package g0901_1000.s0995_minimum_number_of_k_consecutive_bit_flips

// #Hard #Array #Bit_Manipulation #Prefix_Sum #Sliding_Window
// #2023_05_12_Time_480_ms_(100.00%)_Space_106.6_MB_(33.33%)

class Solution {
    fun minKBitFlips(nums: IntArray, k: Int): Int {
        val n = nums.size
        val pref = IntArray(n)
        for (i in 0 until n) {
            if (i == 0) {
                if (nums[i] == 0) {
                    pref[i]++
                }
            } else {
                pref[i] = pref[i - 1]
                val flips = pref[i] - if (i - k >= 0) pref[i - k] else 0
                if (flips % 2 == nums[i]) {
                    if (i + k > n) {
                        return -1
                    }
                    pref[i]++
                }
            }
        }
        return pref[n - 1]
    }
}
