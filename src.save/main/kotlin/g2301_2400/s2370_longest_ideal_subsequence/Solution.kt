package g2301_2400.s2370_longest_ideal_subsequence

// #Medium #String #Hash_Table #Dynamic_Programming
// #2023_07_02_Time_255_ms_(100.00%)_Space_37.6_MB_(100.00%)

class Solution {
    fun longestIdealString(s: String, k: Int): Int {
        var ans = 1
        val array = IntArray(26)
        for (i in 0 until s.length) {
            val curr = s[i].code - 'a'.code
            var currans = 1
            var temp = k
            array[curr] += 1
            var j = curr - 1
            while (temp > 0) {
                if (j == -1) {
                    break
                }
                currans = Math.max(currans, array[j] + 1)
                temp--
                if (j == 0) {
                    break
                }
                j--
            }
            temp = k
            j = curr + 1
            while (temp > 0) {
                if (j == 26) {
                    break
                }
                currans = Math.max(currans, array[j] + 1)
                temp--
                if (j == 25) {
                    break
                }
                j++
            }
            array[curr] = Math.max(currans, array[curr])
            ans = Math.max(ans, array[curr])
        }
        return ans
    }
}
