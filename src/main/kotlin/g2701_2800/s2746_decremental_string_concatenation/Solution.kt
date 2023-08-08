package g2701_2800.s2746_decremental_string_concatenation

// #Medium #Array #String #Dynamic_Programming
// #2023_08_08_Time_264_ms_(100.00%)_Space_44.7_MB_(59.38%)

class Solution {
    private val inf = 1e9.toInt()
    private lateinit var dp: Array<Array<Array<Int?>>>
    fun minimizeConcatenatedLength(words: Array<String>): Int {
        val n = words.size
        dp = Array(n) {
            Array(26) {
                arrayOfNulls(
                    26
                )
            }
        }
        val curWord = words[0]
        val curLen = curWord.length
        val curFirst = curWord[0]
        val curLast = curWord[curLen - 1]
        return curLen + solve(1, curFirst, curLast, n, words)
    }

    private fun solve(idx: Int, prevFirst: Char, prevLast: Char, n: Int, words: Array<String>): Int {
        if (idx == n) return 0
        if (dp[idx][prevFirst.code - 'a'.code][prevLast.code - 'a'.code] != null) {
            return dp[idx][prevFirst.code - 'a'.code][prevLast.code - 'a'.code]!!
        }
        val curWord = words[idx]
        val curLen = curWord.length
        val curFirst = curWord[0]
        val curLast = curWord[curLen - 1]
        var ans = inf
        ans = if (prevFirst == curLast) {
            ans.coerceAtMost(curLen - 1 + solve(idx + 1, curFirst, prevLast, n, words))
        } else {
            ans.coerceAtMost(curLen + solve(idx + 1, curFirst, prevLast, n, words))
        }
        ans = if (prevLast == curFirst) {
            ans.coerceAtMost(curLen - 1 + solve(idx + 1, prevFirst, curLast, n, words))
        } else {
            ans.coerceAtMost(curLen + solve(idx + 1, prevFirst, curLast, n, words))
        }
        return ans.also { dp[idx][prevFirst.code - 'a'.code][prevLast.code - 'a'.code] = it }
    }
}
