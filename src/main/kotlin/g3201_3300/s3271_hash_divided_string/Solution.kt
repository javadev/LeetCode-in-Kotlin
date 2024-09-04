package g3201_3300.s3271_hash_divided_string

// #Medium #String #Simulation #2024_09_04_Time_178_ms_(100.00%)_Space_36.9_MB_(97.50%)

class Solution {
    fun stringHash(s: String, k: Int): String {
        val result = StringBuilder()
        var i = 0
        var sum = 0
        while (i < s.length) {
            sum += s[i].code - 'a'.code
            if ((i + 1) % k == 0) {
                result.append(('a'.code + sum % 26).toChar())
                sum = 0
            }
            i++
        }
        return result.toString()
    }
}
