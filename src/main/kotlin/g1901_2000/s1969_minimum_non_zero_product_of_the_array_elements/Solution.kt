package g1901_2000.s1969_minimum_non_zero_product_of_the_array_elements

// #Medium #Math #Greedy #Recursion #2023_06_21_Time_131_ms_(100.00%)_Space_32.1_MB_(100.00%)

class Solution {
    fun minNonZeroProduct(p: Int): Int {
        val m = (1e9 + 7).toInt()
        var n = ((1L shl p) - 2) % m
        var ans = n + 1
        var cnt = (1L shl p - 1) - 1
        while (cnt > 0) {
            if (cnt and 1L == 1L) {
                ans = ans * n % m
            }
            cnt = cnt shr 1
            n = n * n % m
        }
        return ans.toInt()
    }
}
