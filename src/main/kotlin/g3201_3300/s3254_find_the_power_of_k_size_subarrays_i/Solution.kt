package g3201_3300.s3254_find_the_power_of_k_size_subarrays_i

// #Medium #Array #Sliding_Window #2024_08_21_Time_245_ms_(92.59%)_Space_42.2_MB_(16.67%)

class Solution {
    fun resultsArray(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val arr = IntArray(n - k + 1)
        var count = 0
        for (i in 1 until k) {
            if (nums[i] == nums[i - 1] + 1) {
                count++
            }
        }
        arr[0] = if ((count == k - 1)) nums[k - 1] else -1
        for (i in 1..n - k) {
            if (nums[i] == nums[i - 1] + 1) {
                count--
            }
            if (nums[i + k - 1] == nums[i + k - 2] + 1) {
                count++
            }
            arr[i] = if ((count == k - 1)) nums[i + k - 1] else -1
        }
        return arr
    }
}
