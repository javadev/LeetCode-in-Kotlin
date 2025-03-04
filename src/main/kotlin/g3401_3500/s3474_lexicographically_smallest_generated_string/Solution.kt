package g3401_3500.s3474_lexicographically_smallest_generated_string

// #Hard #2025_03_02_Time_41_ms_(100.00%)_Space_39.75_MB_(100.00%)

class Solution {
    fun generateString(str1: String, str2: String): String {
        val n = str1.length
        val m = str2.length
        val l = n + m - 1
        val word = arrayOfNulls<Char>(l)
        for (i in 0..<n) {
            if (str1[i] == 'T') {
                for (j in 0..<m) {
                    val pos = i + j
                    if (word[pos] != null && word[pos] != str2[j]) {
                        return ""
                    }
                    word[pos] = str2[j]
                }
            }
        }
        val free = BooleanArray(l)
        for (i in 0..<l) {
            if (word[i] == null) {
                word[i] = 'a'
                free[i] = true
            }
        }
        if (n == 0) {
            return "a".repeat(l)
        }
        for (i in 0..<n) {
            if (str1[i] == 'F' && intervalEquals(word, str2, i, m)) {
                var fixed = false
                for (j in m - 1 downTo 0) {
                    val pos = i + j
                    if (free[pos]) {
                        word[pos] = 'b'
                        free[pos] = false
                        fixed = true
                        break
                    }
                }
                if (!fixed) {
                    return ""
                }
            }
        }
        val sb = StringBuilder()
        for (c in word) {
            sb.append(c)
        }
        return sb.toString()
    }

    private fun intervalEquals(word: Array<Char?>, str2: String, i: Int, m: Int): Boolean {
        for (j in 0..<m) {
            if (word[i + j] == null || word[i + j] != str2[j]) {
                return false
            }
        }
        return true
    }
}
