package g3201_3300.s3255_find_the_power_of_k_size_subarrays_ii

// #Medium #Array #Sliding_Window #2024_08_21_Time_892_ms_(89.36%)_Space_69.8_MB_(76.60%)

class Solution {
    fun resultsArray(nums: IntArray, k: Int): IntArray {
        if (k == 1) {
            return nums
        }
        var start = 0
        val n = nums.size
        val output = IntArray(n - k + 1)
        for (i in 1 until n) {
            if (nums[i] != nums[i - 1] + 1) {
                start = i
            }
            val index = i - k + 1
            if (index >= 0) {
                if (start > index) {
                    output[index] = -1
                } else {
                    output[index] = nums[i]
                }
            }
        }
        return output
    }
}
