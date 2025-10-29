package g3701_3800.s3726_remove_zeros_in_decimal_representation

// #Easy #Math #Simulation #Weekly_Contest_473
// #2025_10_28_Time_2_ms_(73.91%)_Space_41.33_MB_(78.26%)

class Solution {
    fun removeZeros(n: Long): Long {
        val x = StringBuilder()
        val s = n.toString()
        for (i in 0..<s.length) {
            if (s[i] != '0') {
                x.append(s[i])
            }
        }
        return x.toString().toLong()
    }
}
