package g3201_3300.s3210_find_the_encrypted_string

// #Easy #String #2024_07_11_Time_170_ms_(62.69%)_Space_35.5_MB_(67.16%)

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
