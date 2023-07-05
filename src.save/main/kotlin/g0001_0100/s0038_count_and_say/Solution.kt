package g0001_0100.s0038_count_and_say

// #Medium #Top_Interview_Questions #String #2023_07_05_Time_135_ms_(100.00%)_Space_34.4_MB_(98.31%)

class Solution {
    fun countAndSay(n: Int): String {
        if (n == 1) {
            return "1"
        }
        val res = StringBuilder()
        val prev = countAndSay(n - 1)
        var count = 1
        for (i in 1 until prev.length) {
            if (prev[i] == prev[i - 1]) {
                count++
            } else {
                res.append(count).append(prev[i - 1])
                count = 1
            }
        }
        res.append(count).append(prev[prev.length - 1])
        return res.toString()
    }
}
