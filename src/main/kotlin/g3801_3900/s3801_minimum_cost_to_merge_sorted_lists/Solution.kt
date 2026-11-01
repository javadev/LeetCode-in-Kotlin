package g3801_3900.s3801_minimum_cost_to_merge_sorted_lists

// #Hard #Array #Dynamic_Programming #Binary_Search #Two_Pointers #Bit_Manipulation #Senior_Staff
// #Weekly_Contest_483 #2026_05_22_Time_251_ms_(89.19%)_Space_47.69_MB_(83.78%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    private fun numLt(lists: Array<IntArray>, enabled: Int, guess: Int): Int {
        var result = 0
        for (i in lists.indices) {
            if (((enabled shr i) and 1) == 1) {
                val list = lists[i]
                var low = 0
                var high = list.size
                while (low < high) {
                    val mid = (low + high) / 2
                    if (list[mid] < guess) {
                        low = mid + 1
                    } else {
                        high = mid
                    }
                }
                result += low
            }
        }
        return result
    }

    fun minMergeCost(lists: Array<IntArray>): Long {
        val n = lists.size
        val allNums = getSortedNumbers(lists)
        val subsets = buildSubsetInfo(lists, allNums)
        val dp = LongArray(1 shl n)
        dp.fill(Long.MAX_VALUE)
        for (subset in 0..<(1 shl n)) {
            if (Integer.bitCount(subset) <= 1) {
                dp[subset] = 0
                continue
            }
            dp[subset] = calculateMinCost(subset, subsets, dp)
        }
        return dp[(1 shl n) - 1]
    }

    private fun getSortedNumbers(lists: Array<IntArray>): MutableList<Int> {
        val allNums: MutableList<Int> = ArrayList<Int>()
        for (lst in lists) {
            for (num in lst) {
                allNums.add(num)
            }
        }
        allNums.sort()
        return allNums
    }

    private fun buildSubsetInfo(lists: Array<IntArray>, allNums: MutableList<Int>): Array<LongArray?> {
        val n = lists.size
        val subsets = Array<LongArray?>(1 shl n) { LongArray(2) }
        for (subset in 1..<(1 shl n)) {
            val resultLen = getSubsetLength(lists, subset)
            val medianLt = (resultLen - 1) / 2
            subsets[subset]!![0] = resultLen.toLong()
            subsets[subset]!![1] = findMedian(lists, subset, medianLt, allNums).toLong()
        }
        return subsets
    }

    private fun getSubsetLength(lists: Array<IntArray>, subset: Int): Int {
        var resultLen = 0
        for (i in lists.indices) {
            if (((subset shr i) and 1) == 1) {
                resultLen += lists[i].size
            }
        }
        return resultLen
    }

    private fun findMedian(lists: Array<IntArray>, subset: Int, medianLt: Int, allNums: MutableList<Int>): Int {
        var low = 0
        var high = allNums.size - 1
        var actualMedian = -1
        while (low <= high) {
            val mid = (low + high) / 2
            val num: Int = allNums[mid]
            if (numLt(lists, subset, num) <= medianLt) {
                actualMedian = num
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return actualMedian
    }

    private fun calculateMinCost(subset: Int, subsets: Array<LongArray?>, dp: LongArray): Long {
        var minCost = Long.MAX_VALUE
        var a = (subset - 1) and subset
        while (a > 0) {
            val b = subset xor a
            val aLen = subsets[a]!![0]
            val aMedian = subsets[a]!![1]
            val bLen = subsets[b]!![0]
            val bMedian = subsets[b]!![1]
            val cost = aLen + bLen + abs(aMedian - bMedian)
            minCost = min(minCost, dp[a] + dp[b] + cost)
            a = (a - 1) and subset
        }
        return minCost
    }
}
