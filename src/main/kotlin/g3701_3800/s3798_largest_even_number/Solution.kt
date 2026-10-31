package g3701_3800.s3798_largest_even_number // #Easy #String #Mid_Level #Weekly_Contest_483
// #2026_05_22_Time_0_ms_(100.00%)_Space_43.67_MB_(94.28%)

class Solution {
    fun largestEven(s: String): String {
        var i: Int = s.length - 1
        while (i >= 0) {
            if (s[i] == '2') {
                break
            }
            i--
        }
        return s.substring(0, i + 1)
    }
}
