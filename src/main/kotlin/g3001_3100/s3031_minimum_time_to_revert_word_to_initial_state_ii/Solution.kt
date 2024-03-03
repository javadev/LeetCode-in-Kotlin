package g3001_3100.s3031_minimum_time_to_revert_word_to_initial_state_ii

// #Hard #String #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_01_Time_24_ms_(74.98%)_Space_55.1_MB_(14.85%)

class Solution {
    fun minimumTimeToInitialState(w: String, q: Int): Int {
        val c = w.toCharArray()
        val lps = IntArray(c.size)
        var k: Int
        for (i in 1 until lps.size) {
            if (c[i] == c[0]) {
                lps[i] = 1
            }
            k = lps[i - 1]
            while (k > 0) {
                if (c[k] == c[i]) {
                    lps[i] = k + 1
                    break
                }
                k = lps[k - 1]
            }
        }
        k = lps[lps.size - 1]
        while (k > 0) {
            if ((c.size - k) % q == 0) {
                return (c.size - k) / q
            }
            k = lps[k - 1]
        }
        return (c.size + q - 1) / q
    }
}
