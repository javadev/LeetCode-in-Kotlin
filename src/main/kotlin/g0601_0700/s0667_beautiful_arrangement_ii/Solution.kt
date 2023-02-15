package g0601_0700.s0667_beautiful_arrangement_ii

// #Medium #Array #Math #2023_02_14_Time_175_ms_(100.00%)_Space_36.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun constructArray(n: Int, k: Int): IntArray {
        var k = k
        val res = IntArray(n)
        var left = 1
        var right = n
        for (i in 0 until n) {
            res[i] = if (k % 2 == 0) left++ else right--
            if (k > 1) {
                k--
            }
        }
        return res
    }
}
