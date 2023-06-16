package g1701_1800.s1712_ways_to_split_array_into_three_subarrays

// #Medium #Array #Binary_Search #Two_Pointers #Prefix_Sum #Binary_Search_II_Day_10
// #2023_06_16_Time_486_ms_(100.00%)_Space_52.8_MB_(100.00%)

class Solution {
    fun waysToSplit(nums: IntArray): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        var cur = 0
        var res: Long = 0
        var i = 0
        var idx1 = 1
        var sum1 = nums[0]
        var idx2 = 1
        var sum2 = nums[0]
        while (i < nums.size) {
            cur += nums[i]
            val right = sum - cur
            if (i == 0 || i == nums.size - 1) {
                i++
                continue
            }
            while (idx1 <= i && sum1 <= cur - sum1) {
                sum1 += nums[idx1++]
            }
            while (idx2 < idx1 && cur - sum2 > right) {
                sum2 += nums[idx2++]
            }
            if (idx1 > idx2) {
                res = (res + idx1 - idx2) % 1000000007
            }
            i++
        }
        return res.toInt()
    }
}
