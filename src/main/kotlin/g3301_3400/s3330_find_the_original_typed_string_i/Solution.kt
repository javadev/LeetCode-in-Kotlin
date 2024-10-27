package g3301_3400.s3330_find_the_original_typed_string_i

// #Easy #2024_10_27_Time_145_ms_(100.00%)_Space_34.2_MB_(100.00%)

class Solution {
    fun possibleStringCount(word: String): Int {
        val n = word.length
        var count = 1
        var pre = word[0]
        var temp = 0
        for (i in 1 until n) {
            val ch = word[i]
            if (ch == pre) {
                temp++
            } else {
                if (temp >= 1) {
                    count += temp
                }
                temp = 0
                pre = ch
            }
        }
        if (temp >= 1) {
            count += temp
        }
        return count
    }
}
