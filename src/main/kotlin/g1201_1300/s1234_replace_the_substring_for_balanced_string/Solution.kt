package g1201_1300.s1234_replace_the_substring_for_balanced_string

// #Medium #String #Sliding_Window #2023_06_09_Time_182_ms_(100.00%)_Space_37_MB_(87.50%)

class Solution {
    fun balancedString(s: String): Int {
        val n = s.length
        var ans = n
        var excess = 0
        val cnt = IntArray(128)
        cnt['R'.code] = -n / 4
        cnt['E'.code] = cnt['R'.code]
        cnt['W'.code] = cnt['E'.code]
        cnt['Q'.code] = cnt['W'.code]
        for (ch in s.toCharArray()) {
            if (++cnt[ch.code] == 1) {
                excess++
            }
        }
        if (excess == 0) {
            return 0
        }
        var i = 0
        var j = 0
        while (i < n) {
            if (--cnt[s[i].code] == 0) {
                excess--
            }
            while (excess == 0) {
                if (++cnt[s[j].code] == 1) {
                    excess++
                }
                ans = Math.min(i - j + 1, ans)
                j++
            }
            i++
        }
        return ans
    }
}
