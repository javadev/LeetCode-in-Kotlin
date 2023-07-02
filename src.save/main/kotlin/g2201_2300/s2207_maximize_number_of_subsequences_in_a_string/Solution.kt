package g2201_2300.s2207_maximize_number_of_subsequences_in_a_string

// #Medium #String #Greedy #Prefix_Sum #2023_06_27_Time_295_ms_(100.00%)_Space_38.9_MB_(100.00%)

class Solution {
    fun maximumSubsequenceCount(text: String, pattern: String): Long {
        val first = pattern[0]
        val second = pattern[1]
        if (first == second) {
            var res: Long = 0
            for (c in text.toCharArray()) {
                if (c == first) {
                    res++
                }
            }
            return res * (res + 1) / 2
        }
        var res: Long = 0
        var firstCount = 0
        var secondCount = 0
        for (c in text.toCharArray()) {
            if (c == first) {
                firstCount++
            } else if (c == second) {
                secondCount++
                res += firstCount.toLong()
            }
        }
        return Math.max(res + secondCount, res + firstCount)
    }
}
