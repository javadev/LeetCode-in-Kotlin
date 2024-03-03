package g3001_3100.s3029_minimum_time_to_revert_word_to_initial_state_i

// #Medium #String #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_03_Time_160_ms_(82.05%)_Space_34.7_MB_(82.05%)

class Solution {
    fun minimumTimeToInitialState(word: String, k: Int): Int {
        val n = word.length
        var i = k
        while (i < n) {
            if (word.substring(i, n) == word.substring(0, n - i)) {
                return i / k
            }
            i += k
        }
        return (n + k - 1) / k
    }
}
