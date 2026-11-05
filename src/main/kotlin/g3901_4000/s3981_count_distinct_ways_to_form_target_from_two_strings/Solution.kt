package g3901_4000.s3981_count_distinct_ways_to_form_target_from_two_strings

// #Hard #String #Dynamic_Programming #Prefix_Sum #Senior_Staff #Biweekly_Contest_186
// #2026_11_03_Time_28_ms_(100.00%)_Space_45.96_MB_(95.35%)

class Solution {
    fun interleaveCharacters(word1: String, word2: String, target: String): Int {
        val wl1 = word1.length
        val wl2 = word2.length
        val tl = target.length
        var dp = initializeDP(wl1, wl2)
        var nextDp = Array<IntArray>(wl1 + 1) { IntArray(wl2 + 1) }
        val s1: Array<IntArray> = Array<IntArray>(wl1 + 1) { IntArray(wl2 + 1) }
        val s2 = Array<IntArray>(wl1 + 1) { IntArray(wl2 + 1) }
        val m1 = BooleanArray(wl1)
        val m2 = BooleanArray(wl2)
        for (i in tl - 1 downTo 0) {
            val tc = target[i]
            updateMatches(word1, m1, tc)
            updateMatches(word2, m2, tc)
            calculateS1(s1, dp, m1, wl1, wl2)
            calculateS2(s2, s1, nextDp, dp, m2, wl1, wl2)
            val temp = dp
            dp = nextDp
            nextDp = temp
        }
        val dp1 = helper(word1, target, tl, wl1)
        val dp2 = helper(word2, target, tl, wl2)
        val ans: Long = (dp[0][0] - dp1[0] - dp2[0]) % MOD
        return ((ans + MOD) % MOD).toInt()
    }

    private fun initializeDP(wl1: Int, wl2: Int): Array<IntArray> {
        val dp = Array<IntArray>(wl1 + 1) { IntArray(wl2 + 1) }
        for (i in 0..wl1) {
            dp[i].fill(1)
        }
        return dp
    }

    private fun updateMatches(word: String, matches: BooleanArray, targetChar: Char) {
        for (i in 0..<word.length) {
            matches[i] = word[i] == targetChar
        }
    }

    private fun calculateS1(s1: Array<IntArray>, dp: Array<IntArray>, m1: BooleanArray, wl1: Int, wl2: Int) {
        s1[wl1].fill(0)
        for (j in wl1 - 1 downTo 0) {
            val current = s1[j]
            val next = s1[j + 1]
            if (m1[j]) {
                calculateS1Row(current, next, dp[j + 1], wl2)
            } else {
                System.arraycopy(next, 0, current, 0, wl2 + 1)
            }
        }
    }

    private fun calculateS1Row(current: IntArray, next: IntArray, dpNext: IntArray, wl2: Int) {
        for (k in wl2 downTo 0) {
            current[k] = (next[k] + dpNext[k]) % MOD
        }
    }

    private fun calculateS2(
        s2: Array<IntArray>,
        s1: Array<IntArray>,
        nextDp: Array<IntArray>,
        dp: Array<IntArray>,
        m2: BooleanArray,
        wl1: Int,
        wl2: Int,
    ) {
        for (j in 0..wl1) {
            calculateS2Row(s2[j], s1[j], nextDp[j], dp[j], m2, wl2)
        }
    }

    private fun calculateS2Row(
        s2Row: IntArray,
        s1Row: IntArray,
        nextDpRow: IntArray,
        dpRow: IntArray,
        m2: BooleanArray,
        wl2: Int,
    ) {
        s2Row[wl2] = 0
        for (k in wl2 - 1 downTo 0) {
            var `val` = s2Row[k + 1]
            if (m2[k]) {
                `val` = (`val` + dpRow[k + 1]) % MOD
            }
            s2Row[k] = `val`
            nextDpRow[k] = (s1Row[k] + `val`) % MOD
        }
        nextDpRow[wl2] = s1Row[wl2]
    }

    private fun helper(word1: String, target: String, tl: Int, wl1: Int): LongArray {
        var ans = LongArray(wl1 + 1)
        ans.fill(1)
        for (i in tl - 1 downTo 0) {
            ans = calculateHelperRow(word1, target[i], ans, wl1)
        }
        return ans
    }

    private fun calculateHelperRow(word: String, targetChar: Char, ans: LongArray, length: Int): LongArray {
        val next = LongArray(length + 1)
        var sum: Long = 0
        for (j in length - 1 downTo 0) {
            if (word[j] == targetChar) {
                sum = (sum + ans[j + 1]) % MOD
            }
            next[j] = sum
        }
        return next
    }

    companion object {
        private const val MOD = 1000000007
    }
}
