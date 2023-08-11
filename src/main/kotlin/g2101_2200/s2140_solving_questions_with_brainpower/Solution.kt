package g2101_2200.s2140_solving_questions_with_brainpower

// #Medium #Array #Dynamic_Programming #2023_06_25_Time_753_ms_(66.97%)_Space_108.6_MB_(99.09%)

class Solution {
    fun mostPoints(questions: Array<IntArray>): Long {
        val n = questions.size
        val memo = LongArray(n)
        memo[n - 1] = questions[n - 1][0].toLong()
        for (i in n - 2 downTo 0) {
            if (i + questions[i][1] + 1 < n) {
                memo[i] = Math.max(memo[i + 1], questions[i][0] + memo[i + questions[i][1] + 1])
            } else {
                memo[i] = Math.max(memo[i + 1], questions[i][0].toLong())
            }
        }
        return memo[0]
    }
}
