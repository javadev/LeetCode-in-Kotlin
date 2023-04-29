package g0901_1000.s0940_distinct_subsequences_ii

// #Hard #String #Dynamic_Programming #2023_04_29_Time_177_ms_(100.00%)_Space_35.9_MB_(100.00%)

class Solution {
    fun distinctSubseqII(s: String): Int {
        val n = s.length
        val mod = 1000000007
        val arr = IntArray(26)
        for (i in 0 until n) {
            val x = s[i].code - 'a'.code
            var sum: Long = 0
            arr[x] += 1
            for (j in 0..25) {
                sum = (sum + arr[j]) % mod
            }
            arr[x] = sum.toInt()
        }
        var total: Long = 0
        for (x in arr) {
            total = (total + x) % mod
        }
        return total.toInt()
    }
}
