package g3301_3400.s3333_find_the_original_typed_string_ii

// #Hard #2024_10_27_Time_590_ms_(100.00%)_Space_52.1_MB_(100.00%)

class Solution {
    fun possibleStringCount(word: String, k: Int): Int {
        val list: MutableList<Int> = ArrayList<Int>()
        val n = word.length
        var i = 0
        while (i < n) {
            var j = i + 1
            while (j < n && word[j] == word[j - 1]) {
                j++
            }
            list.add(j - i)
            i = j
        }
        val m = list.size
        val power = LongArray(m)
        power[m - 1] = list[m - 1].toLong()
        i = m - 2
        while (i >= 0) {
            power[i] = (power[i + 1] * list[i]) % MOD
            i--
        }
        if (m >= k) {
            return power[0].toInt()
        }
        val dp = Array<LongArray?>(m) { LongArray(k - m + 1) }
        i = 0
        while (i < k - m + 1) {
            if (list[m - 1] + i + m > k) {
                dp[m - 1]!![i] = list[m - 1] - (k - m - i).toLong()
            }
            i++
        }
        i = m - 2
        while (i >= 0) {
            var sum: Long = dp[i + 1]!![k - m] * list[i] % MOD
            for (j in k - m downTo 0) {
                sum += dp[i + 1]!![j]
                if (j + list[i] > k - m) {
                    sum = (sum - dp[i + 1]!![k - m] + MOD) % MOD
                } else {
                    sum = (sum - dp[i + 1]!![j + list[i]] + MOD) % MOD
                }
                dp[i]!![j] = sum
            }
            i--
        }
        return dp[0]!![0].toInt()
    }

    companion object {
        private const val MOD = 1e9.toLong() + 7
    }
}
