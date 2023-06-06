package g1301_1400.s1392_longest_happy_prefix

// #Hard #String #Hash_Function #String_Matching #Rolling_Hash
class Solution {
    fun longestPrefix(s: String): String {
        val times = 2
        var prefixHash: Long = 0
        var suffixHash: Long = 0
        var multiplier: Long = 1
        var len: Long = 0
        // use some large prime as a modulo to avoid overflow errors, e.g. 10 ^ 9 + 7.
        val mod: Long = 1000000007
        for (i in 0 until s.length - 1) {
            prefixHash = (prefixHash * times + s[i].code.toLong()) % mod
            suffixHash = (multiplier * s[s.length - i - 1].code.toLong() + suffixHash) % mod
            if (prefixHash == suffixHash) {
                len = i.toLong() + 1
            }
            multiplier = multiplier * times % mod
        }
        return s.substring(0, len.toInt())
    }
}
