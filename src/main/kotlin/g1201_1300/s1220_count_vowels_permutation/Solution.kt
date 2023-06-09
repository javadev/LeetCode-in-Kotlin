package g1201_1300.s1220_count_vowels_permutation

// #Hard #Dynamic_Programming #2023_06_09_Time_129_ms_(100.00%)_Space_32.9_MB_(80.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countVowelPermutation(n: Int): Int {
        var n = n
        val mod = 1e9.toInt() + 7
        var prevA = 1
        var prevE = 1
        var prevI = 1
        var prevO = 1
        var prevU = 1
        while (n-- > 1) {
            val a = ((prevE + prevI) % mod + prevU) % mod
            val e = (prevA + prevI) % mod
            val i = (prevE + prevO) % mod
            val o = prevI
            val u = (prevI + prevO) % mod
            prevA = a
            prevE = e
            prevI = i
            prevO = o
            prevU = u
        }
        return ((((prevA + prevE) % mod + prevI) % mod + prevO) % mod + prevU) % mod
    }
}
