package g3801_3900.s3849_maximum_bitwise_xor_after_rearrangement

// #Medium #String #Greedy #Bit_Manipulation #Staff #Weekly_Contest_490
// #2026_07_22_Time_32_ms_(96.39%)_Space_55.08_MB_(65.66%)

class Solution {
    fun maximumXor(s: String, t: String): String {
        val cnt = IntArray(2)
        for (c in t.toCharArray()) {
            cnt[c.code - '0'.code]++
        }

        val ans = CharArray(s.length)
        for (i in 0..<s.length) {
            val x = s.get(i).code - '0'.code
            if (cnt[x xor 1] > 0) {
                cnt[x xor 1]--
                ans[i] = '1'
            } else {
                cnt[x]--
                ans[i] = '0'
            }
        }

        return String(ans)
    }
}
