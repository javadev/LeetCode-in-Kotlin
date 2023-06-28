package g2201_2300.s2270_number_of_ways_to_split_array

// #Medium #Array #Prefix_Sum
class Solution {
    fun waysToSplitArray(nums: IntArray): Int {
        var leftSum: Long = 0
        var rightSum: Long = 0
        for (i in nums) {
            rightSum += i.toLong()
        }
        var count = 0
        for (i in 0 until nums.size - 1) {
            rightSum -= nums[i].toLong()
            leftSum += nums[i].toLong()
            if (leftSum >= rightSum) {
                count++
            }
        }
        return count
    }
}
