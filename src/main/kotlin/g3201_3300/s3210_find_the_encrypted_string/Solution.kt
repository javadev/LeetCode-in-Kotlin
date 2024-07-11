package g3201_3300.s3210_find_the_encrypted_string

// #Easy #String #2024_07_09_Time_1_ms_(100.00%)_Space_42.8_MB_(34.96%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun getEncryptedString(s: String, k: Int): String {
        var k = k
        val n = s.length
        k %= n
        val str = StringBuilder(s.substring(k, n))
        str.append(s.substring(0, k))
        return str.toString()
    }
}
