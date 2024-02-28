package g3001_3100.s3014_minimum_number_of_pushes_to_type_word_i

// #Easy #String #Math #Greedy #2024_02_28_Time_152_ms_(58.67%)_Space_34.5_MB_(64.00%)

class Solution {
    fun minimumPushes(word: String): Int {
        if (word.length <= 8) {
            return word.length
        } else {
            var iteration = 1
            var len = word.length
            var count = 0
            while (len > 0) {
                if (len >= 8) {
                    count += 8 * iteration
                    len -= 8
                } else {
                    count += len * iteration
                    len = 0
                }
                iteration++
            }
            return count
        }
    }
}
