package g3001_3100.s3035_maximum_palindromes_after_operations

// #Medium #Array #String #Hash_Table #Sorting #Greedy #Counting
// #2024_03_01_Time_4_ms_(99.13%)_Space_44.9_MB_(90.28%)

class Solution {
    fun maxPalindromesAfterOperations(words: Array<String>): Int {
        val ar = IntArray(26)
        val dp = IntArray(101)
        var s = 0
        var p = 0
        var ans = 0
        for (str in words) {
            for (c in str.toCharArray()) {
                ar[c.code - 'a'.code]++
            }
            dp[str.length]++
        }
        for (j in ar) {
            s += j % 2
            p += (j / 2)
        }
        for (i in 1 until dp.size) {
            if (dp[i] > 0) {
                if (i % 2 == 0) {
                    while (dp[i] > 0 && p > 0) {
                        p -= i / 2
                        if (p >= 0) {
                            ans++
                        }
                        dp[i]--
                    }
                } else {
                    while (dp[i] > 0 && (i == 1 || p > 0)) {
                        if (s == 0) {
                            s += 2
                            p--
                        }
                        s--
                        p -= (i - 1) / 2
                        if (p >= 0) {
                            ans++
                        }
                        dp[i]--
                    }
                }
            }
        }
        return ans
    }
}
