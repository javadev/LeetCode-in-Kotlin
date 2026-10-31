package g3801_3900.s3838_weighted_word_mapping

// #Easy #Array #String #Simulation #Mid_Level #Biweekly_Contest_176
// #2026_07_21_Time_2_ms_(93.33%)_Space_46.37_MB_(83.88%)

class Solution {
    fun mapWordWeights(words: Array<String>, weights: IntArray): String {
        val ans = StringBuilder()
        for (s in words) {
            var cnt = 0
            for (i in 0..<s.length) {
                cnt += weights[s.get(i).code - 'a'.code]
            }
            ans.append(('a'.code + (25 - (cnt % 26))).toChar())
        }
        return ans.toString()
    }
}
