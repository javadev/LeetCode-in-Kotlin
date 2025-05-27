package g3501_3600.s3561_resulting_string_after_adjacent_removals

// #Medium #String #Stack #Simulation #2025_05_25_Time_43_ms_(100.00%)_Space_50.83_MB_(68.75%)

class Solution {
    fun resultingString(s: String): String {
        val n = s.length
        var p = 0
        val buf = CharArray(n)
        for (c in s.toCharArray()) {
            if (p > 0) {
                val d = buf[p - 1].code - c.code
                val ad = if (d < 0) -d else d
                if (ad == 1 || ad == 25) {
                    p--
                    continue
                }
            }
            buf[p++] = c
        }
        return String(buf, 0, p)
    }
}
