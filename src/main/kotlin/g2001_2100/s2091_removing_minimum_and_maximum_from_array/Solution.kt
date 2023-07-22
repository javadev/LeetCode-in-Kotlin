package g2001_2100.s2091_removing_minimum_and_maximum_from_array

// #Medium #Array #Greedy #2023_06_28_Time_607_ms_(100.00%)_Space_57.3_MB_(100.00%)

class Solution {
    fun minimumDeletions(nums: IntArray): Int {
        val n = nums.size
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var minIndex = 0
        var maxIndex = 0
        for (i in nums.indices) {
            if (nums[i] < min) {
                min = nums[i]
                minIndex = i
            }
            if (nums[i] > max) {
                max = nums[i]
                maxIndex = i
            }
        }
        val firstCase: Int
        val secondCase: Int
        val thirdCase: Int
        if (minIndex > maxIndex) {
            firstCase = minIndex + 1
            secondCase = n - maxIndex
            thirdCase = maxIndex + 1 + (n - minIndex)
        } else {
            firstCase = maxIndex + 1
            secondCase = n - minIndex
            thirdCase = minIndex + 1 + (n - maxIndex)
        }
        return firstCase.coerceAtMost(secondCase.coerceAtMost(thirdCase))
    }
}
