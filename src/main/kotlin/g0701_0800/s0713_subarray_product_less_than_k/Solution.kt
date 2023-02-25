package g0701_0800.s0713_subarray_product_less_than_k

// #Medium #Array #Sliding_Window #Algorithm_II_Day_5_Sliding_Window #Programming_Skills_II_Day_12
// #Udemy_Arrays #2023_02_25_Time_336_ms_(92.11%)_Space_42_MB_(94.74%)

class Solution {
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        var p = 1
        var j = 0
        var ans = 0
        for (i in nums.indices) {
            p *= nums[i]
            while (p >= k && j < i) {
                p /= nums[j]
                j++
            }
            ans += if (p < k) i - j + 1 else 0
        }
        return ans
    }
}
