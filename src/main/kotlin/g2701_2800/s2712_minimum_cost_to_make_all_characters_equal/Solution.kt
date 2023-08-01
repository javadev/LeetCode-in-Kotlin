package g2701_2800.s2712_minimum_cost_to_make_all_characters_equal

// #Medium #String #Dynamic_Programming #Greedy
// #2023_08_01_Time_200_ms_(100.00%)_Space_38.1_MB_(88.89%)

class Solution {
    fun minimumCost(s: String): Long {
        val n = s.length
        val h = n / 2
        val ca = s.toCharArray()
        var result: Long
        // to 1's
        var m = 0L
        var inverse = false
        for (i in h downTo 0) {
            if (inverse) {
                if (ca[i] == '1') {
                    inverse = false
                    m += i + 1
                }
            } else {
                if (ca[i] == '0') {
                    inverse = true
                    m += i + 1
                }
            }
        }
        inverse = false
        for (i in h + 1 until n) {
            if (inverse) {
                if (ca[i] == '1') {
                    inverse = false
                    m += n - i
                }
            } else {
                if (ca[i] == '0') {
                    inverse = true
                    m += n - i
                }
            }
        }
        result = m
        m = 0L
        inverse = false
        for (i in h downTo 0) {
            if (inverse) {
                if (ca[i] == '0') {
                    inverse = false
                    m += i + 1
                }
            } else {
                if (ca[i] == '1') {
                    inverse = true
                    m += i + 1
                }
            }
        }
        inverse = false
        for (i in h + 1 until n) {
            if (inverse) {
                if (ca[i] == '0') {
                    inverse = false
                    m += n - i
                }
            } else {
                if (ca[i] == '1') {
                    inverse = true
                    m += n - i
                }
            }
        }
        result = result.coerceAtMost(m)
        return result
    }
}
