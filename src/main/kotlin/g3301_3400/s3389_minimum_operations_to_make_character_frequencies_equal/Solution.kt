package g3301_3400.s3389_minimum_operations_to_make_character_frequencies_equal

// #Hard #String #Hash_Table #Dynamic_Programming #Counting #Enumeration
// #2024_12_18_Time_9_ms_(78.95%)_Space_39.3_MB_(18.42%)

class Solution {
    fun makeStringGood(s: String): Int {
        val n = s.length
        val cnt = IntArray(26)
        for (c in s) cnt[c - 'a']++
        var mn = n
        var mx = 0
        for (c in cnt)
            if (c != 0) {
                mn = Math.min(mn, c)
                mx = Math.max(mx, c)
            }
        if (mn == mx) return 0
        var dp0 = 0
        var dp1 = 0
        var tmp0 = 0
        var tmp1 = 0
        var ans = n - 1
        for (i in mn..mx) {
            dp0 = cnt[0]
            dp1 = Math.abs(i - cnt[0])
            for (j in 1 until 26) {
                tmp0 = dp0
                tmp1 = dp1
                dp0 = Math.min(tmp0, tmp1) + cnt[j]
                if (cnt[j] >= i) {
                    dp1 = Math.min(tmp0, tmp1) + (cnt[j] - i)
                } else {
                    dp1 = Math.min(
                        tmp0 + i - Math.min(i, cnt[j] + cnt[j - 1]),
                        tmp1 + i - Math.min(i, cnt[j] + Math.max(0, cnt[j - 1] - i)),
                    )
                }
            }
            ans = Math.min(ans, minOf(dp0, dp1))
        }
        return ans
    }
}
