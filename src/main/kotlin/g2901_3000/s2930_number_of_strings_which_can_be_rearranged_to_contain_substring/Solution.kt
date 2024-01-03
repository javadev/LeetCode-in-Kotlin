package g2901_3000.s2930_number_of_strings_which_can_be_rearranged_to_contain_substring

// #Medium #Dynamic_Programming #Math #Combinatorics
// #2024_01_03_Time_132_ms_(100.00%)_Space_33.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun pow(x: Long, n: Long, mod: Long): Long {
        var n = n
        var result: Long = 1
        var p = x % mod
        while (n != 0L) {
            if ((n and 1L) != 0L) {
                result = (result * p) % mod
            }
            p = (p * p) % mod
            n = n shr 1
        }
        return result
    }

    fun stringCount(n: Int): Int {
        val mod = 1e9.toInt() + 7L
        return (
            (
                (
                    pow(26, n.toLong(), mod) -
                        (n + 75) * pow(25, n - 1L, mod) +
                        (2 * n + 72) * pow(24, n - 1L, mod) -
                        (n + 23) * pow(23, n - 1L, mod)
                    ) %
                    mod +
                    mod
                ) %
                mod
            ).toInt()
    }
}
