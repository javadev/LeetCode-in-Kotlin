package g2901_3000.s2962_count_subarrays_where_max_element_appears_at_least_k_times

// #Medium #Array #Sliding_Window #2024_01_19_Time_587_ms_(88.37%)_Space_57_MB_(93.02%)

class Solution {
    fun countSubarrays(nums: IntArray, k: Int): Long {
        val st = IntArray(nums.size + 1)
        var si = 0
        var m = 0
        for (i in nums.indices) {
            if (m < nums[i]) {
                m = nums[i]
                si = 0
            }
            if (m == nums[i]) {
                st[si++] = i
            }
        }
        if (si < k) {
            return 0
        }
        var r: Long = 0
        st[si] = nums.size
        for (i in k..si) {
            r += (st[i - k] + 1).toLong() * (st[i] - st[i - 1])
        }
        return r
    }
}
