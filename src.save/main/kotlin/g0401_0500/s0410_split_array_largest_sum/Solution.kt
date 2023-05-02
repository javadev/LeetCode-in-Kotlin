package g0401_0500.s0410_split_array_largest_sum

// #Hard #Array #Dynamic_Programming #Greedy #Binary_Search
// #2022_12_03_Time_165_ms_(100.00%)_Space_33.9_MB_(100.00%)

class Solution {
    fun splitArray(nums: IntArray, m: Int): Int {
        var maxVal = 0
        var minVal = nums[0]
        for (num in nums) {
            maxVal += num
            minVal = Math.max(minVal, num)
        }
        while (minVal < maxVal) {
            val midVal = minVal + (maxVal - minVal) / 2
            // if we can split, try to reduce the midVal so decrease maxVal
            if (canSplit(midVal, nums, m)) {
                maxVal = midVal
            } else {
                // if we can't split, then try to increase midVal by increasing minVal
                minVal = midVal + 1
            }
        }
        return minVal
    }

    private fun canSplit(maxSubArrSum: Int, nums: IntArray, m: Int): Boolean {
        var currSum = 0
        var currSplits = 1
        for (num in nums) {
            currSum += num
            if (currSum > maxSubArrSum) {
                currSum = num
                currSplits++
                // if maxSubArrSum was TOO high that we can split the array into more that 'm' parts
                // then its not ideal
                if (currSplits > m) {
                    return false
                }
            }
        }
        return true
    }
}
