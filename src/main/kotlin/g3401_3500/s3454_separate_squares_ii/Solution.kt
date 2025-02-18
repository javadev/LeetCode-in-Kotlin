package g3401_3500.s3454_separate_squares_ii

// #Hard #Array #Binary_Search #Segment_Tree #Line_Sweep
// #2025_02_18_Time_277_ms_(100.00%)_Space_96.52_MB_(33.33%)

class Solution {
    fun separateSquares(squares: Array<IntArray>): Double {
        val n = squares.size
        val m = 2 * n
        val events = createEvents(squares, m)
        val xsRaw = createXsRaw(squares, m)
        events.sortWith<Event> { a, b: Event -> a.y.compareTo(b.y) }
        val xs = compress(xsRaw)
        val totalUnionArea = calculateTotalUnionArea(events, xs, m)
        val target = totalUnionArea / 2.0
        return findSplitPoint(events, xs, m, target)
    }

    private fun createEvents(squares: Array<IntArray>, m: Int): Array<Event> {
        val events = Array(m) { Event(0.0, 0.0, 0.0, 0) }
        var idx = 0
        for (sq in squares) {
            val x = sq[0].toDouble()
            val y = sq[1].toDouble()
            val l = sq[2].toDouble()
            val x2 = x + l
            val y2 = y + l
            events[idx++] = Event(y, x, x2, 1)
            events[idx++] = Event(y2, x, x2, -1)
        }
        return events
    }

    private fun createXsRaw(squares: Array<IntArray>, m: Int): DoubleArray {
        val xsRaw = DoubleArray(m)
        var xIdx = 0
        for (sq in squares) {
            val x = sq[0].toDouble()
            val l = sq[2].toDouble()
            xsRaw[xIdx++] = x
            xsRaw[xIdx++] = x + l
        }
        return xsRaw
    }

    private fun calculateTotalUnionArea(events: Array<Event>, xs: DoubleArray, m: Int): Double {
        val segTree = SegmentTree(xs)
        var totalUnionArea = 0.0
        var lastY = events[0].y
        var i = 0
        while (i < m) {
            val curY = events[i].y
            if (curY > lastY) {
                val unionX = segTree.query()
                totalUnionArea += unionX * (curY - lastY)
                lastY = curY
            }
            while (i < m && events[i].y == curY) {
                val indices = findIndices(xs, events[i])
                segTree.update(1, 0, xs.size - 1, indices[0], indices[1], events[i].type)
                i++
            }
        }
        return totalUnionArea
    }

    private fun findSplitPoint(events: Array<Event>, xs: DoubleArray, m: Int, target: Double): Double {
        val segTree = SegmentTree(xs)
        var lastY = events[0].y
        var cumArea = 0.0
        var i = 0
        while (i < m) {
            val curY = events[i].y
            if (curY > lastY) {
                val unionX = segTree.query()
                val dy = curY - lastY
                if (cumArea + unionX * dy >= target - 1e-10) {
                    return lastY + (target - cumArea) / unionX
                }
                cumArea += unionX * dy
                lastY = curY
            }
            while (i < m && events[i].y == curY) {
                val indices = findIndices(xs, events[i])
                segTree.update(1, 0, xs.size - 1, indices[0], indices[1], events[i].type)
                i++
            }
        }
        return lastY
    }

    private fun findIndices(xs: DoubleArray, event: Event): IntArray {
        var lIdx = xs.binarySearch(event.x1)
        if (lIdx < 0) {
            lIdx = -lIdx - 1
        }
        var rIdx = xs.binarySearch(event.x2)
        if (rIdx < 0) {
            rIdx = -rIdx - 1
        }
        return intArrayOf(lIdx, rIdx)
    }

    private fun compress(arr: DoubleArray): DoubleArray {
        arr.sort()
        var cnt = 1
        for (i in 1..<arr.size) {
            if (arr[i] != arr[i - 1]) {
                cnt++
            }
        }
        val res = DoubleArray(cnt)
        res[0] = arr[0]
        var j = 1
        for (i in 1..<arr.size) {
            if (arr[i] != arr[i - 1]) {
                res[j++] = arr[i]
            }
        }
        return res
    }

    private class Event(var y: Double, var x1: Double, var x2: Double, var type: Int)

    private class SegmentTree(var xs: DoubleArray) {
        var n: Int
        var tree: DoubleArray
        var count: IntArray

        init {
            this.n = xs.size
            tree = DoubleArray(4 * n)
            count = IntArray(4 * n)
        }

        fun update(idx: Int, l: Int, r: Int, ql: Int, qr: Int, `val`: Int) {
            if (qr <= l || ql >= r) {
                return
            }
            if (ql <= l && r <= qr) {
                count[idx] += `val`
            } else {
                val mid = (l + r) shr 1
                update(idx shl 1, l, mid, ql, qr, `val`)
                update(idx shl 1 or 1, mid, r, ql, qr, `val`)
            }
            if (count[idx] > 0) {
                tree[idx] = xs[r] - xs[l]
            } else if (r - l == 1) {
                tree[idx] = 0.0
            } else {
                tree[idx] = tree[idx shl 1] + tree[idx shl 1 or 1]
            }
        }

        fun query(): Double {
            return tree[1]
        }
    }
}
