package g1901_2000.s1977_number_of_ways_to_separate_numbers

// #Hard #String #Dynamic_Programming #Suffix_Array
class Solution {
    private lateinit var lcp: Array<IntArray>
    private lateinit var dp: Array<LongArray>
    private lateinit var dps: Array<LongArray>
    private var num: String? = null
    private var n = 0

    // Pre-compute The Longest Common Prefix sequence for each index in the string
    private fun calcLCP() {
        for (i in n - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (num!![i] == num!![j]) {
                    lcp[i][j] = lcp[i + 1][j + 1] + 1
                }
            }
        }
    }

    // compare substring of same length for value
    private fun compare(i: Int, j: Int, len: Int): Boolean {
        val common = lcp[i][j]
        return common >= len || num!![i + common] < num!![j + common]
    }

    // calculates number of possible separations
    private fun calcResult() {
        for (i in n - 1 downTo 0) {
            // leading zero at current current index
            if (num!![i] == '0') {
                continue
            }
            // for substring starting at index i
            var sum: Long = 0
            for (j in n - 1 downTo i) {
                val mod: Long = 1000000007
                if (j == n - 1) {
                    // whole substring from index i is a valid possible list of integer (single
                    // integer in this case)
                    dp[i][j] = 1
                } else {
                    // first integer (i-j)
                    val len = j - i + 1
                    // second integer start index
                    val st = j + 1
                    // second integer end index
                    val ed = st + len - 1
                    // equal length integers should be compared for value
                    dp[i][j] = 0
                    if (ed < n && compare(i, st, len)) {
                        dp[i][j] = dp[st][ed]
                    }
                    // including the second integers possibilities with length greater than 1st one.
                    if (ed + 1 < n) {
                        // dps[st][ed+1] => dp[st][ed+1].......dp[st][n-1]
                        dp[i][j] = (dp[i][j] + dps[st][ed + 1]) % mod
                    }
                }
                sum = (sum + dp[i][j]) % mod
                dps[i][j] = sum
            }
        }
    }

    fun numberOfCombinations(num: String): Int {
        if (num[0] == '0') {
            return 0
        }
        n = num.length
        this.num = num
        lcp = Array(n + 1) { IntArray(n + 1) }
        dp = Array(n + 1) { LongArray(n + 1) }
        dps = Array(n + 1) { LongArray(n + 1) }
        calcLCP()
        calcResult()
        return dps[0][0].toInt()
    }
}
