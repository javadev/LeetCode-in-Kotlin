package g1401_1500.s1403_minimum_subsequence_in_non_increasing_order

// #Easy #Array #Sorting #Greedy #2023_06_07_Time_190_ms_(100.00%)_Space_38.9_MB_(100.00%)

class Solution {
    fun minSubsequence(nums: IntArray): List<Int> {
        nums.sort()
        var startIndex = 0
        var endIndex = nums.size - 1
        var sumOfNonIncludedElements = nums[0]
        var sumOfIncludedElements = nums[endIndex]
        val result: MutableList<Int> = ArrayList()
        while (startIndex < endIndex) {
            if (sumOfNonIncludedElements < sumOfIncludedElements) {
                sumOfNonIncludedElements += nums[++startIndex]
            } else {
                result.add(nums[endIndex])
                sumOfIncludedElements += nums[--endIndex]
            }
        }
        result.add(nums[startIndex])
        return result
    }
}
