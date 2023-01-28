package g0101_0200.s0168_excel_sheet_column_title

// #Easy #String #Math #2022_11_25_Time_208_ms_(66.07%)_Space_34.2_MB_(39.29%)

class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var num = columnNumber
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
