package g3601_3700.s3697_compute_decimal_representation

// #Easy #Array #Math #Weekly_Contest_469 #2025_10_03_Time_1_ms_(100.00%)_Space_42.64_MB_(100.00%)

class Solution {
    fun decimalRepresentation(n: Int): IntArray {
        var n = n
        var place = 1
        val cnt = getDigits(n)
        val ans = IntArray(cnt)
        var idx = cnt - 1
        while (n != 0) {
            val d = n % 10
            ans[idx] = d * place
            idx--
            place = place * 10
            n = n / 10
        }
        var nz = 0
        for (x in ans) {
            if (x != 0) {
                nz++
            }
        }
        val res = IntArray(nz)
        var p = 0
        for (x in ans) {
            if (x != 0) {
                res[p++] = x
            }
        }
        return res
    }

    private fun getDigits(n: Int): Int {
        var n = n
        var cnt = 0
        while (n != 0) {
            cnt++
            n = n / 10
        }
        return cnt
    }
}
