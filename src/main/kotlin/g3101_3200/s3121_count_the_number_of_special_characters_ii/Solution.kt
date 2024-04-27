package g3101_3200.s3121_count_the_number_of_special_characters_ii

// #Medium #String #Hash_Table #2024_04_27_Time_274_ms_(90.74%)_Space_46.5_MB_(25.93%)

import kotlin.math.min

class Solution {
    fun numberOfSpecialChars(word: String): Int {
        val small = IntArray(26)
        small.fill(-1)
        val capital = IntArray(26)
        capital.fill(Int.MAX_VALUE)
        var result = 0
        for (i in word.indices) {
            val a = word[i]
            if (a.code < 91) {
                capital[a.code - 65] = min(capital[a.code - 65].toDouble(), i.toDouble()).toInt()
            } else {
                small[a.code - 97] = i
            }
        }
        for (i in 0..25) {
            if (-1 != small[i] && Int.MAX_VALUE != capital[i] && capital[i] > small[i]) {
                result++
            }
        }
        return result
    }
}
