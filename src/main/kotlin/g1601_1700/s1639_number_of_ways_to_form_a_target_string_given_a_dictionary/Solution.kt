package g1601_1700.s1639_number_of_ways_to_form_a_target_string_given_a_dictionary

// #Hard #Array #String #Dynamic_Programming
// #2023_06_18_Time_408_ms_(100.00%)_Space_53.4_MB_(71.43%)

class Solution {
    fun numWays(words: Array<String>, target: String): Int {
        val counts = precompute(words)
        val memo = Array(target.length) { arrayOfNulls<Int?>(words[0].length) }
        return solve(memo, counts, words, target, 0, 0)
    }

    private fun precompute(words: Array<String>): Array<IntArray> {
        val counts = Array(words[0].length) { IntArray(26) }
        for (word in words) {
            for (idx in word.indices) {
                counts[idx][word[idx].code - 'a'.code]++
            }
        }
        return counts
    }

    private fun solve(
        memo: Array<Array<Int?>>,
        counts: Array<IntArray>,
        words: Array<String>,
        target: String,
        idx: Int,
        len: Int,
    ): Int {
        if (idx >= target.length) {
            return 1
        }
        if (len >= words[0].length || words[0].length - len < target.length - idx) {
            return 0
        }
        if (memo[idx][len] != null) {
            return memo[idx][len]!!
        }
        var answer = 0
        answer += solve(memo, counts, words, target, idx, len + 1)
        answer %= MOD
        answer += (
            solve(
                memo,
                counts,
                words,
                target,
                idx + 1,
                len + 1,
            ).toLong() * counts[len][target[idx].code - 'a'.code] %
                MOD
            ).toInt()
        answer %= MOD
        memo[idx][len] = answer
        return memo[idx][len]!!
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
