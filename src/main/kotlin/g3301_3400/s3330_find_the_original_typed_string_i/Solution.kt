package g3301_3400.s3330_find_the_original_typed_string_i

// #Easy #String #2024_10_29_Time_142_ms_(88.24%)_Space_34.7_MB_(70.59%)

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
