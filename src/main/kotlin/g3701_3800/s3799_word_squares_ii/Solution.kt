package g3701_3800.s3799_word_squares_ii

// #Medium #Array #String #Sorting #Backtracking #Enumeration #Senior #Weekly_Contest_483
// #2026_05_22_Time_5_ms_(99.15%)_Space_56.77_MB_(55.56%)

class Solution {
    fun wordSquares(words: Array<String>): MutableList<MutableList<String>> {
        val s = words.clone()
        s.sort()
        val result: MutableList<MutableList<String>> = ArrayList<MutableList<String>>()
        val n = s.size
        for (a in 0..<n) {
            for (b in 0..<n) {
                if (a != b && s[a][0] == s[b][0]) {
                    for (c in 0..<n) {
                        if (c != a && c != b && s[a][3] == s[c][0]) {
                            for (d in 0..<n) {
                                if (d != a && d != b && d != c && s[d][0] == s[b][3] && s[d][3] == s[c][3]) {
                                    result.add(mutableListOf(s[a], s[b], s[c], s[d]))
                                }
                            }
                        }
                    }
                }
            }
        }
        return result
    }
}
