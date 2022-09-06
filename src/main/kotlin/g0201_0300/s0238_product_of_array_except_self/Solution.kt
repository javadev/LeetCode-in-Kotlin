package g0201_0300.s0238_product_of_array_except_self

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Prefix_Sum
// #Data_Structure_II_Day_5_Array #Udemy_Arrays
// #2022_07_04_Time_1_ms_(100.00%)_Space_50.8_MB_(85.60%)
class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var product = 1
        val ans = IntArray(nums.size)
        for (num in nums) {
            product = product * num
        }
        for (i in nums.indices) {
            if (nums[i] != 0) {
                ans[i] = product / nums[i]
            } else {
                var p = 1
                for (j in nums.indices) {
                    if (j != i) {
                        p = p * nums[j]
                    }
                }
                ans[i] = p
            }
        }
        return ans
    }
}
