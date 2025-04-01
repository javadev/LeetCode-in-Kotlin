package g3501_3600.s3501_maximize_active_section_with_trade_ii

// #Hard #Array #String #Binary_Search #Segment_Tree
// #2025_04_01_Time_259_ms_(100.00%)_Space_140.14_MB_(_%)

import kotlin.math.max

class Solution {
    fun maxActiveSectionsAfterTrade(s: String, queries: Array<IntArray>): List<Int> {
        val n = s.length
        var activeCount = 0
        for (ch in s.toCharArray()) {
            if (ch == '1') {
                activeCount++
            }
        }
        val segments: MutableList<IntArray?> = ArrayList<IntArray?>()
        var start = 0
        for (i in 0..<n) {
            if (i == n - 1 || s[i] != s[i + 1]) {
                segments.add(intArrayOf(start, i - start + 1))
                start = i + 1
            }
        }
        val segmentCount = segments.size
        val maxPower = 20
        val rmq = Array<IntArray>(maxPower) { IntArray(segmentCount) }
        for (i in 0..<maxPower) {
            rmq[i].fill(NEG_INF)
        }
        for (i in 0..<segmentCount) {
            if (s[segments[i]!![0]] == '0' && i + 2 < segmentCount) {
                rmq[0][i] = segments[i]!![1] + segments[i + 2]!![1]
            }
        }
        var power = 1
        var rangeLen = 2
        while (power < maxPower) {
            var i = 0
            var j = rangeLen - 1
            while (j < segmentCount) {
                rmq[power][i] =
                    max(rmq[power - 1][i], rmq[power - 1][i + rangeLen / 2])
                i++
                j++
            }
            power++
            rangeLen *= 2
        }
        val result: MutableList<Int> = ArrayList<Int>()
        for (query in queries) {
            val left = query[0]
            val right = query[1]
            val leftIndex = binarySearch(segments, left) - 1
            val rightIndex = binarySearch(segments, right) - 1
            if (rightIndex - leftIndex + 1 <= 2) {
                result.add(activeCount)
                continue
            }
            var bestIncrease = max(getMaxInRange(rmq, leftIndex + 1, rightIndex - 3), 0)
            bestIncrease = max(
                bestIncrease,
                calculateNewSections(
                    s, segments, left, right, leftIndex, rightIndex, leftIndex,
                ),
            )
            bestIncrease = max(
                bestIncrease,
                calculateNewSections(
                    s,
                    segments,
                    left,
                    right,
                    leftIndex,
                    rightIndex,
                    rightIndex - 2,
                ),
            )
            result.add(activeCount + bestIncrease)
        }
        return result
    }

    private fun binarySearch(segments: MutableList<IntArray?>, key: Int): Int {
        var lo = 0
        var hi = segments.size
        while (lo < hi) {
            val mid = lo + (hi - lo) / 2
            if (segments[mid]!![0] > key) {
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        return lo
    }

    private fun getMaxInRange(rmq: Array<IntArray>, left: Int, right: Int): Int {
        if (left > right) {
            return NEG_INF
        }
        val power = 31 - Integer.numberOfLeadingZeros(right - left + 1)
        return max(rmq[power][left], rmq[power][right - (1 shl power) + 1])
    }

    private fun getSegmentSize(
        segments: MutableList<IntArray?>,
        left: Int,
        right: Int,
        leftIndex: Int,
        rightIndex: Int,
        i: Int,
    ): Int {
        if (i == leftIndex) {
            return segments[leftIndex]!![1] - (left - segments[leftIndex]!![0])
        }
        if (i == rightIndex) {
            return right - segments[rightIndex]!![0] + 1
        }
        return segments[i]!![1]
    }

    private fun calculateNewSections(
        s: String,
        segments: MutableList<IntArray?>,
        left: Int,
        right: Int,
        leftIndex: Int,
        rightIndex: Int,
        i: Int,
    ): Int {
        if (i < 0 || i + 2 >= segments.size || s[segments[i]!![0]] == '1') {
            return NEG_INF
        }
        val size1 = getSegmentSize(segments, left, right, leftIndex, rightIndex, i)
        val size2 = getSegmentSize(segments, left, right, leftIndex, rightIndex, i + 2)
        return size1 + size2
    }

    companion object {
        private const val INF = 1e9
        private const val NEG_INF: Int = -INF.toInt()
    }
}
