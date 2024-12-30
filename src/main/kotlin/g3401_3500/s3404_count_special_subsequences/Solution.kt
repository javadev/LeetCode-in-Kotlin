package g3401_3500.s3404_count_special_subsequences

// #Medium #2024_12_29_Time_276_(100.00%)_Space_60.90_(100.00%)

class Solution {
    fun numberOfSubsequences(nums: IntArray): Long {
        val freq: MutableMap<Double, Int> = HashMap()
        var ans: Long = 0
        for (r in 4..<nums.size) {
            var p = 0
            val q = r - 2
            while (p < q - 1) {
                val key = nums[p].toDouble() / nums[q]
                freq.put(key, freq.getOrDefault(key, 0) + 1)
                ++p
            }
            for (s in r + 2..<nums.size) {
                ans += freq.getOrDefault(nums[s].toDouble() / nums[r], 0).toLong()
            }
        }
        return ans
    }
}
