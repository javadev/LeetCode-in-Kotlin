package g2301_2400.s2333_minimum_sum_of_squared_difference

// #Medium #Array #Math #Sorting #Heap_Priority_Queue
// #2023_07_01_Time_502_ms_(100.00%)_Space_50.6_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.pow

class Solution {
    fun minSumSquareDiff(nums1: IntArray, nums2: IntArray, k1: Int, k2: Int): Long {
        var minSumSquare: Long = 0
        val diffs = IntArray(100001)
        var totalDiff: Long = 0
        var kSum = k1.toLong() + k2
        var currentDiff: Int
        var maxDiff = 0
        for (i in nums1.indices) {
            // get current diff.
            currentDiff = abs(nums1[i] - nums2[i])
            // if current diff > 0, count/store it. If not,then ignore it.
            if (currentDiff > 0) {
                totalDiff += currentDiff.toLong()
                diffs[currentDiff]++
                maxDiff = maxDiff.coerceAtLeast(currentDiff)
            }
        }
        // if kSum (k1 + k2) < totalDifferences, it means we can make all numbers/differences 0s
        if (totalDiff <= kSum) {
            return 0
        }
        // starting from the back, from the highest difference, lower that group one by one to the
        // previous group.
        // we need to make all n diffs to n-1, then n-2, as long as kSum allows it.
        run {
            var i = maxDiff
            while (i > 0 && kSum > 0) {
                if (diffs[i] > 0) {
                    // if current group has more differences than the totalK, we can only move k of them
                    // to the lower level.
                    if (diffs[i] >= kSum) {
                        diffs[i] -= kSum.toInt()
                        diffs[i - 1] += kSum.toInt()
                        kSum = 0
                    } else {
                        // else, we can make this whole group one level lower.
                        diffs[i - 1] += diffs[i]
                        kSum -= diffs[i].toLong()
                        diffs[i] = 0
                    }
                }
                i--
            }
        }
        for (i in 0..maxDiff) {
            if (diffs[i] > 0) {
                minSumSquare += i.toDouble().pow(2.0).toLong() * diffs[i]
            }
        }
        return minSumSquare
    }
}
