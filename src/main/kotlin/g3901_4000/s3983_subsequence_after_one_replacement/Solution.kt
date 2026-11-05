package g3901_4000.s3983_subsequence_after_one_replacement

import kotlin.math.max

// #Medium #String #Two_Pointers #Staff #Weekly_Contest_509
// #2026_11_03_Time_11_ms_(98.90%)_Space_47.84_MB_(67.03%)

class Solution {
    fun canMakeSubsequence(t: String, s: String): Boolean {
        val arrS = s.toCharArray()
        val arrT = t.toCharArray()
        if (arrS.size < arrT.size) {
            return false
        }
        var idx1 = 0
        var idx2 = 0
        val n = arrT.size
        for (curr in arrS) {
            var nextIdx1 = idx1
            var nextIdx2 = idx2
            if (idx2 < n && arrT[idx2] == curr) {
                nextIdx2 = max(nextIdx2, idx2 + 1)
            }
            if (idx1 < n) {
                nextIdx2 = max(nextIdx2, idx1 + 1)
            }
            if (idx1 < n && arrT[idx1] == curr) {
                nextIdx1 = idx1 + 1
            }
            nextIdx2 = max(nextIdx2, nextIdx1)
            idx1 = nextIdx1
            idx2 = nextIdx2
        }
        return idx1 == n || idx2 == n
    }
}
