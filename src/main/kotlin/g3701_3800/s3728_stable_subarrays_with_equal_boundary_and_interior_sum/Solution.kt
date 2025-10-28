package g3701_3800.s3728_stable_subarrays_with_equal_boundary_and_interior_sum

// #Medium #Weekly_Contest_473 #2025_10_28_Time_146_ms_(60.00%)_Space_89.72_MB_(80.00%)

class Solution {
    fun countStableSubarrays(capacity: IntArray): Long {
        val n = capacity.size
        var res: Long = 0
        var pre: Long = 0
        val mpp: MutableMap<Long, MutableMap<Long, Long>> = HashMap()
        for (i in 0..<n) {
            if (mpp.containsKey(capacity[i].toLong())) {
                val t: MutableMap<Long, Long> = mpp[capacity[i].toLong()]!!
                val cnt = t[pre - capacity[i]]
                if (cnt != null) {
                    res += cnt
                }
            }
            pre += capacity[i].toLong()
            val t = mpp.computeIfAbsent(capacity[i].toLong()) { _: Long -> HashMap() }
            t[pre] = t.getOrDefault(pre, 0L) + 1L
            if (i > 0 && capacity[i] == 0 && capacity[i - 1] == 0) {
                res--
            }
        }
        return res
    }
}
