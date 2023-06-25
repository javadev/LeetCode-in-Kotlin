package g2101_2200.s2156_find_substring_with_given_hash_value

// #Hard #String #Sliding_Window #Hash_Function #Rolling_Hash
class Solution {
    fun subStrHash(s: String, power: Int, modulo: Int, k: Int, hashValue: Int): String {
        var mul1: Long = 1
        var times = k - 1
        while (times-- > 0) {
            mul1 = mul1 * power % modulo
        }
        var index = -1
        var hash: Long = 0
        var end = s.length - 1
        for (i in s.length - 1 downTo 0) {
            val `val` = s[i].code - 96
            hash = (hash * power % modulo + `val`) % modulo
            if (end - i + 1 == k) {
                if (hash == hashValue.toLong()) {
                    index = i
                }
                hash = (hash - (s[end].code - 96) * mul1 % modulo + modulo) % modulo
                end--
            }
        }
        return s.substring(index, index + k)
    }
}
