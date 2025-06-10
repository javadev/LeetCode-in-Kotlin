package g3501_3600.s3574_maximize_subarray_gcd_score

// #Hard #Array #Math #Enumeration #Number_Theory
// #2025_06_10_Time_27_ms_(100.00%)_Space_48.98_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxGCDScore(nums: IntArray, k: Int): Long {
        var mx = 0
        for (x in nums) {
            mx = max(mx, x)
        }
        val width = 32 - Integer.numberOfLeadingZeros(mx)
        val lowbitPos: Array<MutableList<Int>> = Array<MutableList<Int>>(width) { i: Int -> ArrayList<Int>() }
        val intervals = Array<IntArray?>(width + 1) { IntArray(3) }
        var size = 0
        var ans: Long = 0
        for (i in nums.indices) {
            val x = nums[i]
            val tz = Integer.numberOfTrailingZeros(x)
            lowbitPos[tz].add(i)
            for (j in 0..<size) {
                intervals[j]!![0] = gcd(intervals[j]!![0], x)
            }
            intervals[size]!![0] = x
            intervals[size]!![1] = i - 1
            intervals[size]!![2] = i
            size++
            var idx = 1
            for (j in 1..<size) {
                if (intervals[j]!![0] != intervals[j - 1]!![0]) {
                    intervals[idx]!![0] = intervals[j]!![0]
                    intervals[idx]!![1] = intervals[j]!![1]
                    intervals[idx]!![2] = intervals[j]!![2]
                    idx++
                } else {
                    intervals[idx - 1]!![2] = intervals[j]!![2]
                }
            }
            size = idx
            for (j in 0..<size) {
                val g = intervals[j]!![0]
                val l = intervals[j]!![1]
                val r = intervals[j]!![2]
                ans = max(ans, g.toLong() * (i - l))
                val pos = lowbitPos[Integer.numberOfTrailingZeros(g)]
                val minL = if (pos.size > k) max(l, pos.get(pos.size - k - 1)!!) else l
                if (minL < r) {
                    ans = max(ans, g.toLong() * 2 * (i - minL))
                }
            }
        }
        return ans
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (a != 0) {
            val tmp = a
            a = b % a
            b = tmp
        }
        return b
    }
}
