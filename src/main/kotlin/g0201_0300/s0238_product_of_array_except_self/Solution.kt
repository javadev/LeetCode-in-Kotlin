package g0201_0300.s0238_product_of_array_except_self

// #Medium #Top_100_Liked_Questions #Array #Prefix_Sum #Data_Structure_II_Day_5_Array #Udemy_Arrays
// #Big_O_Time_O(n^2)_Space_O(n) #2022_09_10_Time_669_ms_(48.96%)_Space_69_MB_(86.94%)

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
