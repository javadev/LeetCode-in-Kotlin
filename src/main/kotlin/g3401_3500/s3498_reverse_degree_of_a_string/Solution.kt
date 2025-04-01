package g3401_3500.s3498_reverse_degree_of_a_string

// #Easy #String #Simulation #2025_04_01_Time_2_ms_(87.18%)_Space_42.65_MB_(89.74%)

class Solution {
    fun reverseDegree(s: String): Int {
        var ans = 0
        for (i in 0..<s.length) {
            ans += (26 - (s.get(i).code - 'a'.code)) * (i + 1)
        }
        return ans
    }
}
