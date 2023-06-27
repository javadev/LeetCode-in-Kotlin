package g2001_2100.s2090_k_radius_subarray_averages

// #Medium #Array #Sliding_Window #2023_06_27_Time_874_ms_(85.63%)_Space_54.7_MB_(40.94%)

import java.util.Arrays

class Solution {
    fun getAverages(nums: IntArray, k: Int): IntArray {
        // initialize result array with -1
        val res = IntArray(nums.size)
        Arrays.fill(res, -1)
        if (nums.size <= k * 2) {
            // return if not enough elements
            return res
        }
        var sum: Long = 0
        val range = 2 * k + 1L
        // take sum of all elements from 0 to k*2 index
        for (i in 0..2 * k) {
            sum += nums[i].toLong()
        }
        // update first valid avg
        res[k] = (sum / range).toInt()
        // update other valid averages using sliding window
        for (i in k + 1 until nums.size - k) {
            sum = sum - nums[i - k - 1] + nums[i + k]
            res[i] = (sum / range).toInt()
        }
        return res
    }
}
