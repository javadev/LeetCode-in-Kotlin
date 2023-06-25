package g2101_2200.s2111_minimum_operations_to_make_the_array_k_increasing

// #Hard #Array #Binary_Search #2023_06_25_Time_558_ms_(100.00%)_Space_50.7_MB_(100.00%)

class Solution {
    fun kIncreasing(a: IntArray, k: Int): Int {
        val n = a.size
        var res = 0
        for (s in 0 until k) {
            val dp: MutableList<Int> = ArrayList()
            var i = s
            while (i < n) {
                if (!bsearch(dp, a[i])) {
                    dp.add(a[i])
                }
                i += k
            }
            res += dp.size
        }
        return n - res
    }

    private fun bsearch(dp: MutableList<Int>, target: Int): Boolean {
        if (dp.isEmpty()) {
            return false
        }
        var lo = 0
        var hi = dp.size - 1
        while (lo < hi) {
            val mid = lo + (hi - lo) / 2
            if (dp[mid] <= target) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        if (dp[lo] > target) {
            dp[lo] = target
            return true
        }
        return false
    }
}
