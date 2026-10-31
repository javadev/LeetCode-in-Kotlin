package g3701_3800.s3760_maximum_substrings_with_distinct_start

// #Medium #String #Hash_Table #Senior #Weekly_Contest_478
// #2026_05_08_Time_5_ms_(98.92%)_Space_47.79_MB_(74.99%)

class Solution {
    fun maxDistinct(s: String): Int {
        var mask = 0
        var res = 0
        for (c in s.toCharArray()) {
            val bit = 1 shl (c.code - 'a'.code)
            if ((mask and bit) == 0) {
                mask = mask or bit
                res++
                if (res == 26) {
                    break
                }
            }
        }
        return res
    }
}
