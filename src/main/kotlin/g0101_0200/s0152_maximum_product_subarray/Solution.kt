package g0101_0200.s0152_maximum_product_subarray

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Dynamic_Programming_I_Day_6 #Level_2_Day_13_Dynamic_Programming #Udemy_Dynamic_Programming
// #2022_09_06_Time_354_ms_(42.11%)_Space_38.3_MB_(90.00%)

class Solution {
    fun maxProduct(nums: IntArray): Int {
        var pos = nums[0]
        var neg = nums[0]
        var max = nums[0]
        for (i in 1 until nums.size) {
            val temp = pos
            pos = Math.max(nums[i], nums[i] * if (nums[i] >= 0) pos else neg)
            neg = Math.min(nums[i], nums[i] * if (nums[i] >= 0) neg else temp)
            max = Math.max(max, pos)
        }
        return max
    }
}
