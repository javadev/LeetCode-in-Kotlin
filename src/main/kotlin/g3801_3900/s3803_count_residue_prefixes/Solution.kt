package g3801_3900.s3803_count_residue_prefixes // #Easy #String #Hash_Table #Mid_Level #Weekly_Contest_484
// #2026_05_22_Time_1_ms_(100.00%)_Space_43.67_MB_(91.69%)

class Solution {
    fun residuePrefixes(s: String): Int {
        val n = s.length
        var count = 0
        var p = 0
        val c1 = s.get(p)
        while (p < n && c1 == s.get(p)) {
            if (++p % 3 == 1) {
                count++
            }
        }
        if (p >= n) {
            return count
        }
        val c2 = s.get(p)
        while (p < n && (c1 == s.get(p) || c2 == s.get(p))) {
            if (++p % 3 == 2) {
                count++
            }
        }
        return count
    }
}
