package g3301_3400.s3302_find_the_lexicographically_smallest_valid_sequence

// #Medium #String #Dynamic_Programming #Greedy #Two_Pointers
// #2024_10_01_Time_705_ms_(100.00%)_Space_65.9_MB_(100.00%)

class Solution {
    fun validSequence(word1: String, word2: String): IntArray? {
        val c1 = word1.toCharArray()
        val c2 = word2.toCharArray()
        val dp = IntArray(c1.size + 1)
        var j = c2.size - 1
        for (i in c1.indices.reversed()) {
            if (j >= 0 && c1[i] == c2[j]) {
                dp[i] = dp[i + 1] + 1
                j--
            } else {
                dp[i] = dp[i + 1]
            }
        }
        val ans = IntArray(c2.size)
        var i = 0
        j = 0
        while (i < c1.size && j < c2.size) {
            if (c1[i] == c2[j]) {
                ans[j] = i
                j++
            } else {
                if (dp[i + 1] >= c2.size - 1 - j) {
                    ans[j] = i
                    j++
                    i++
                    break
                }
            }
            i++
        }
        if (j < c2.size && i == c1.size) {
            return IntArray(0)
        }
        while (j < c2.size && i < c1.size) {
            if (c2[j] == c1[i]) {
                ans[j] = i
                j++
            }
            i++
        }
        return ans
    }
}
