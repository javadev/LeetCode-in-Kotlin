package g0801_0900.s0878_nth_magical_number

// #Hard #Math #Binary_Search #2023_04_08_Time_124_ms_(100.00%)_Space_32.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun nthMagicalNumber(n: Int, a: Int, b: Int): Int {
        val c = lcm(a.toLong(), b.toLong())
        var l: Long = 2
        var r = n * c
        var ans = r
        while (l <= r) {
            val mid = l + (r - l) / 2
            val cnt = mid / a + mid / b - mid / c
            if (cnt < n) {
                l = mid + 1
            } else {
                ans = mid
                r = mid - 1
            }
        }
        return (ans % MOD).toInt()
    }

    private fun lcm(a: Long, b: Long): Long {
        return a * b / gcd(a, b)
    }

    private fun gcd(a: Long, b: Long): Long {
        var a = a
        var b = b
        var t: Long
        while (b != 0L) {
            t = b
            b = a % b
            a = t
        }
        return a
    }

    companion object {
        private const val MOD = 1000000007
    }
}
