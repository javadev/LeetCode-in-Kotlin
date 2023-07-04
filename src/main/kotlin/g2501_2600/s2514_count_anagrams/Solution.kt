package g2501_2600.s2514_count_anagrams

// #Hard #String #Hash_Table #Math #Counting #Combinatorics
@Suppress("NAME_SHADOWING")
class Solution {
    fun countAnagrams(s: String): Int {
        val charArray = s.toCharArray()
        var ans = 1L
        var mul = 1L
        val cnt = IntArray(26)
        var j = 0
        for (c in charArray) {
            if (c == ' ') {
                cnt.fill(0)
                j = 0
            } else {
                mul = mul * ++cnt[c.code - 'a'.code] % MOD
                ans = ans * ++j % MOD
            }
        }
        return (ans * pow(mul, MOD - 2) % MOD).toInt()
    }

    private fun pow(x: Long, n: Int): Long {
        var x = x
        var n = n
        var res = 1L
        while (n > 0) {
            if (n % 2 > 0) {
                res = res * x % MOD
            }
            x = x * x % MOD
            n /= 2
        }
        return res
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
