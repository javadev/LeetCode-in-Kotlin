package g3401_3500.s3498_reverse_degree_of_a_string

// #Easy #2025_03_30_Time_1_ms_(100.00%)_Space_42.68_MB_(100.00%)

class Solution {
    fun reverseDegree(s: String): Int {
        var ans = 0
        for (i in 0..<s.length) {
            ans += (26 - (s.get(i).code - 'a'.code)) * (i + 1)
        }
        return ans
    }
}
