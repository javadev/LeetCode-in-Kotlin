package g3701_3800.s3729_count_distinct_subarrays_divisible_by_k_in_sorted_array

// #Hard #Weekly_Contest_473 #2025_10_28_Time_76_ms_(100.00%)_Space_80.47_MB_(100.00%)

class Solution {
    fun numGoodSubarrays(nums: IntArray, k: Int): Long {
        val cnt: MutableMap<Int, Long> = HashMap()
        cnt[0] = 1L
        var pre = 0
        val n = nums.size
        var res: Long = 0
        for (a in nums) {
            pre = (pre + a) % k
            res += cnt.getOrDefault(pre, 0L)
            cnt[pre] = cnt.getOrDefault(pre, 0L) + 1L
        }
        var i = 0
        while (i < n) {
            var j = i
            while (j < n && nums[j] == nums[i]) {
                ++j
            }
            val l = j - i
            for (ll in 1..<l) {
                if (ll.toLong() * nums[i] % k == 0L) {
                    res -= (l - ll).toLong()
                }
            }
            i = j
        }
        return res
    }
}
