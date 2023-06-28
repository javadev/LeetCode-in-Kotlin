package g2201_2300.s2256_minimum_average_difference

// #Medium #Array #Prefix_Sum
class Solution {
    fun minimumAverageDifference(nums: IntArray): Int {
        var numsSum: Long = 0
        for (num in nums) {
            numsSum += num.toLong()
        }
        var minAverageDiff = Long.MAX_VALUE
        var sumFromFront: Long = 0
        var index = 0
        for (i in nums.indices) {
            sumFromFront += nums[i].toLong()
            val numbersRight = if (i == nums.size - 1) 1 else nums.size - i - 1
            val averageDiff = Math.abs(sumFromFront / (i + 1) - (numsSum - sumFromFront) / numbersRight)
            if (minAverageDiff > averageDiff) {
                minAverageDiff = averageDiff
                index = i
            }
            if (averageDiff == 0L) {
                break
            }
        }
        return index
    }
}
