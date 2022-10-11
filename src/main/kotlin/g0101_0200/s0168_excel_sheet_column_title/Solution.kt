package g0101_0200.s0168_excel_sheet_column_title

// #Easy #String #Math #2022_10_11_Time_246_ms_(30.12%)_Space_33.6_MB_(75.90%)

class Solution {
    fun convertToTitle(n: Int): String {
        var n = n
        val sb = StringBuilder()
        while (n != 0) {
            var remainder = n % 26
            if (remainder == 0) {
                remainder += 26
            }
            if (n >= remainder) {
                n -= remainder
                sb.append((remainder + 64).toChar())
            }
            n /= 26
        }
        return sb.reverse().toString()
    }
}
