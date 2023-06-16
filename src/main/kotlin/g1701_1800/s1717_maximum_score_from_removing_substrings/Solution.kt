package g1701_1800.s1717_maximum_score_from_removing_substrings

// #Medium #String #Greedy #Stack #2023_06_16_Time_265_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun maximumGain(s: String, x: Int, y: Int): Int {
        val v = s.toCharArray()
        return if (x > y) {
            helper(v, 'a', 'b', x) + helper(v, 'b', 'a', y)
        } else {
            helper(v, 'b', 'a', y) + helper(v, 'a', 'b', x)
        }
    }

    private fun helper(v: CharArray, c1: Char, c2: Char, score: Int): Int {
        var left = -1
        var right = 0
        var res = 0
        while (right < v.size) {
            if (v[right] != c2) {
                left = right
            } else {
                while (left >= 0) {
                    val cl = v[left]
                    if (cl == '#') {
                        left--
                    } else if (cl == c1) {
                        res += score
                        v[left] = '#'
                        v[right] = '#'
                        left--
                        break
                    } else {
                        break
                    }
                }
            }
            right++
        }
        return res
    }
}
