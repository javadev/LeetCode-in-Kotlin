package g3901_4000.s3987_minimum_total_cost_to_process_all_elements

// #Medium #Array #Math #Simulation #Senior #Weekly_Contest_510
// #2026_11_03_Time_2_ms_(94.04%)_Space_136.23_MB_(77.48%)

class Solution {
    fun minimumCost(nums: IntArray, k: Int): Int {
        var sum = 0L
        val mod = 1000000007
        for (num in nums) {
            sum = sum + num
        }
        if (sum < k) {
            return 0
        }
        val kRequired: Long
        if (sum % k == 0L) {
            kRequired = sum / k
        } else {
            kRequired = sum / k + 1
        }
        return func(kRequired - 1, mod).toInt()
    }

    private fun func(n: Long, mod: Int): Long {
        var ans = ((n % mod) * ((n + 1) % mod)) % mod
        ans = (ans * 500000004) % mod
        return ans
    }
}
