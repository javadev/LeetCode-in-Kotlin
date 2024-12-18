package g3301_3400.s3389_minimum_operations_to_make_character_frequencies_equal

// #Hard #String #Hash_Table #Dynamic_Programming #Counting #Enumeration
// #2024_12_18_Time_9_ms_(78.95%)_Space_39.3_MB_(18.42%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun makeStringGood(s: String): Int {
        val n = s.length
        val cnt = IntArray(26)
        for (c in s) cnt[c - 'a']++
        var mn = n
        var mx = 0
        for (c in cnt)
            if (c != 0) {
                mn = min(mn, c)
                mx = max(mx, c)
            }
        if (mn == mx) return 0
        var dp0: Int
        var dp1: Int
        var tmp0: Int
        var tmp1: Int
        var ans = n - 1
        for (i in mn..mx) {
            dp0 = cnt[0]
            dp1 = abs(i - cnt[0])
            for (j in 1 until 26) {
                tmp0 = dp0
                tmp1 = dp1
                dp0 = min(tmp0, tmp1) + cnt[j]
                dp1 = if (cnt[j] >= i) {
                    min(tmp0, tmp1) + (cnt[j] - i)
                } else {
                    min(
                        tmp0 + i - min(i, cnt[j] + cnt[j - 1]),
                        tmp1 + i - min(i, cnt[j] + max(0, cnt[j - 1] - i)),
                    )
                }
            }
            ans = min(ans, minOf(dp0, dp1))
        }
        return ans
    }
}
