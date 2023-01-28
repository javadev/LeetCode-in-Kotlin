package g0401_0500.s0482_license_key_formatting

// #Easy #String #2023_01_02_Time_234_ms_(87.18%)_Space_36.7_MB_(84.62%)

class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        val sb = StringBuilder()
        var cnt = 0
        var occ = 0
        for (c in s.toCharArray()) {
            if (c == '-') {
                continue
            }
            cnt++
        }
        var l = cnt % k
        for (c in s.toCharArray()) {
            if (c == '-') {
                continue
            }
            if (occ == k) {
                occ = 0
                sb.append('-')
            } else if (occ == l && l != 0) {
                l = 0
                occ = 0
                sb.append('-')
            }
            sb.append(c.uppercaseChar())
            occ++
        }
        return sb.toString()
    }
}
