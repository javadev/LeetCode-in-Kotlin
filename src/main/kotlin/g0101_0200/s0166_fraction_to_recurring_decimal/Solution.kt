package g0101_0200.s0166_fraction_to_recurring_decimal

// #Medium #Top_Interview_Questions #String #Hash_Table #Math
// #2022_10_11_Time_147_ms_(90.91%)_Space_33.6_MB_(90.91%)

class Solution {
    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        if (numerator == 0) {
            return "0"
        }
        val sb = StringBuilder()
        // negative case
        if (numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) {
            sb.append("-")
        }
        val x = Math.abs(java.lang.Long.valueOf(numerator.toLong()))
        val y = Math.abs(java.lang.Long.valueOf(denominator.toLong()))
        sb.append(x / y)
        var remainder = x % y
        if (remainder == 0L) {
            return sb.toString()
        }
        // decimal case
        sb.append(".")
        // store the remainder in a Hashmap because in the case of recurring decimal, the remainder
        // repeats as dividend.
        val map: MutableMap<Long, Int> = HashMap()
        while (remainder != 0L) {
            if (map.containsKey(remainder)) {
                sb.insert(map.getValue(remainder), "(")
                sb.append(")")
                break
            }
            // store the remainder and the index of it's occurence in the String
            map[remainder] = sb.length
            remainder *= 10
            sb.append(remainder / y)
            remainder %= y
        }
        return sb.toString()
    }
}
