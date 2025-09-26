package g3601_3700.s3686_number_of_stable_subsequences

// #Hard #Array #Dynamic_Programming #Weekly_Contest_467
// #2025_09_20_Time_11_ms_(100.00%)_Space_70.56_MB_(55.00%)

class Solution {
    fun countStableSubsequences(nums: IntArray): Int {
        var e1: Long = 0
        var e2: Long = 0
        var o1: Long = 0
        var o2: Long = 0
        for (x in nums) {
            if ((x and 1) == 0) {
                val ne1: Long = (e1 + (o1 + o2 + 1)) % MOD
                val ne2: Long = (e2 + e1) % MOD
                e1 = ne1
                e2 = ne2
            } else {
                val no1: Long = (o1 + (e1 + e2 + 1)) % MOD
                val no2: Long = (o2 + o1) % MOD
                o1 = no1
                o2 = no2
            }
        }
        val ans: Long = (e1 + e2 + o1 + o2) % MOD
        return ans.toInt()
    }

    companion object {
        private const val MOD = 1000000007L
    }
}
