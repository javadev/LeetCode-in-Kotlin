package g3001_3100.s3031_minimum_time_to_revert_word_to_initial_state_ii

// #Hard #String #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_03_Time_328_ms_(52.94%)_Space_53_MB_(5.88%)

class Solution {
    fun minimumTimeToInitialState(word: String, k: Int): Int {
        val c = word.toCharArray()
        val lps = IntArray(c.size)
        var q: Int
        for (i in 1 until lps.size) {
            if (c[i] == c[0]) {
                lps[i] = 1
            }
            q = lps[i - 1]
            while (q > 0) {
                if (c[q] == c[i]) {
                    lps[i] = q + 1
                    break
                }
                q = lps[q - 1]
            }
        }
        q = lps[lps.size - 1]
        while (q > 0) {
            if ((c.size - q) % k == 0) {
                return (c.size - q) / k
            }
            q = lps[q - 1]
        }
        return (c.size + k - 1) / k
    }
}
