package g3501_3600.s3569_maximize_count_of_distinct_primes_after_split

// #Hard #2025_06_01_Time_441_ms_(100.00%)_Space_98.42_MB_(100.00%)

import java.util.TreeSet
import kotlin.math.max
import kotlin.math.min

class Solution {
    private class Node {
        var maxVal: Int = 0
        var lazyDelta: Int = 0
    }

    private class SegmentTree(var n: Int) {
        var tree: Array<Node>

        init {
            tree = Array<Node>(4 * this.n) { Node() }
        }

        fun push(nodeIdx: Int) {
            if (tree[nodeIdx].lazyDelta != 0) {
                tree[2 * nodeIdx].maxVal += tree[nodeIdx].lazyDelta
                tree[2 * nodeIdx].lazyDelta += tree[nodeIdx].lazyDelta
                tree[2 * nodeIdx + 1].maxVal += tree[nodeIdx].lazyDelta
                tree[2 * nodeIdx + 1].lazyDelta += tree[nodeIdx].lazyDelta
                tree[nodeIdx].lazyDelta = 0
            }
        }

        fun update(queryStart: Int, queryEnd: Int, delta: Int) {
            var queryStart = queryStart
            var queryEnd = queryEnd
            queryStart = max(1, queryStart)
            queryEnd = min(n - 1, queryEnd)
            if (queryStart > queryEnd) {
                return
            }
            update(1, 1, n - 1, queryStart, queryEnd, delta)
        }

        fun update(
            nodeIdx: Int,
            start: Int,
            end: Int,
            queryStart: Int,
            queryEnd: Int,
            delta: Int,
        ) {
            if (start > end || start > queryEnd || end < queryStart) {
                return
            }
            if (queryStart <= start && end <= queryEnd) {
                tree[nodeIdx].maxVal += delta
                tree[nodeIdx].lazyDelta += delta
                return
            }
            push(nodeIdx)

            val mid = (start + end) / 2
            update(2 * nodeIdx, start, mid, queryStart, queryEnd, delta)
            update(2 * nodeIdx + 1, mid + 1, end, queryStart, queryEnd, delta)
            tree[nodeIdx].maxVal = max(tree[2 * nodeIdx].maxVal, tree[2 * nodeIdx + 1].maxVal)
        }

        fun queryMax(): Int {
            if (n - 1 < 1) {
                return 0
            }
            return tree[1].maxVal
        }
    }

    fun maximumCount(nums: IntArray, queries: Array<IntArray>): IntArray {
        val n = nums.size
        val primeIndices: MutableMap<Int, TreeSet<Int>> = HashMap()
        for (i in 0..<n) {
            if (isPrime[nums[i]]) {
                primeIndices.computeIfAbsent(nums[i]) { k: Int? -> TreeSet<Int>() }.add(i)
            }
        }
        val segmentTree = SegmentTree(n)
        for (entry in primeIndices.entries) {
            val indices = entry.value
            val first: Int = indices.first()!!
            val last: Int = indices.last()!!
            segmentTree.update(first + 1, last, 1)
        }
        val result = IntArray(queries.size)
        for (q in queries.indices) {
            val idx = queries[q][0]
            val `val` = queries[q][1]
            val oldVal = nums[idx]
            if (isPrime[oldVal]) {
                val indices: TreeSet<Int> = primeIndices[oldVal]!!
                val oldFirst: Int = indices.first()!!
                val oldLast: Int = indices.last()!!
                indices.remove(idx)
                if (indices.isEmpty()) {
                    primeIndices.remove(oldVal)
                    segmentTree.update(oldFirst + 1, oldLast, -1)
                } else {
                    val newFirst: Int = indices.first()!!
                    val newLast: Int = indices.last()!!

                    if (idx == oldFirst && newFirst != oldFirst) {
                        segmentTree.update(oldFirst + 1, newFirst, -1)
                    }
                    if (idx == oldLast && newLast != oldLast) {
                        segmentTree.update(newLast + 1, oldLast, -1)
                    }
                }
            }
            nums[idx] = `val`
            if (isPrime[`val`]) {
                val wasNewPrime = !primeIndices.containsKey(`val`)
                val indices = primeIndices.computeIfAbsent(`val`) { k: Int? -> TreeSet<Int>() }
                val oldFirst: Int = (if (indices.isEmpty()) -1 else indices.first())!!
                val oldLast: Int = (if (indices.isEmpty()) -1 else indices.last())!!
                indices.add(idx)
                val newFirst: Int = indices.first()!!
                val newLast: Int = indices.last()!!
                if (wasNewPrime) {
                    segmentTree.update(newFirst + 1, newLast, 1)
                } else {
                    if (idx < oldFirst) {
                        segmentTree.update(newFirst + 1, oldFirst, 1)
                    }
                    if (idx > oldLast) {
                        segmentTree.update(oldLast + 1, newLast, 1)
                    }
                }
            }
            val totalDistinctPrimesInCurrentNums = primeIndices.size
            var maxIntersection = segmentTree.queryMax()
            maxIntersection = max(0, maxIntersection)
            result[q] = totalDistinctPrimesInCurrentNums + maxIntersection
        }
        return result
    }

    companion object {
        private const val MAX_VAL = 100005
        private val isPrime = BooleanArray(MAX_VAL)

        init {
            isPrime.fill(true)
            isPrime[1] = false
            isPrime[0] = false
            var i = 2
            while (i * i < MAX_VAL) {
                if (isPrime[i]) {
                    var j = i * i
                    while (j < MAX_VAL) {
                        isPrime[j] = false
                        j += i
                    }
                }
                i++
            }
        }
    }
}
