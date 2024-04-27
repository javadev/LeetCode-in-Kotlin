package g3101_3200.s3120_count_the_number_of_special_characters_i

// #Easy #String #Hash_Table #2024_04_27_Time_145_ms_(97.26%)_Space_35.1_MB_(49.32%)

class Solution {
    fun numberOfSpecialChars(word: String): Int {
        val a = IntArray(26)
        val b = IntArray(26)
        var ans = 0
        for (c in word.toCharArray()) {
            if (c in 'a'..'z') {
                a[c.code - 'a'.code]++
            } else {
                b[c.code - 'A'.code]++
            }
        }
        for (i in 0..25) {
            if (a[i] != 0 && b[i] != 0) {
                ans++
            }
        }
        return ans
    }
}
