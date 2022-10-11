package g0101_0200.s0168_excel_sheet_column_title

// #Easy #String #Math #2022_10_11_Time_246_ms_(30.12%)_Space_33.6_MB_(75.90%)

class Solution {
    fun convertToTitle(n: Int): String {
        var num = n
        val sb = StringBuilder()
        while (num != 0) {
            var remainder = num % 26
            if (remainder == 0) {
                remainder += 26
            }
            if (num >= remainder) {
                num -= remainder
                sb.append((remainder + 64).toChar())
            }
            num /= 26
        }
        return sb.reverse().toString()
    }
}
