package g0101_0200.s0171_excel_sheet_column_number

// #Easy #Top_Interview_Questions #String #Math
// #2022_10_12_Time_310_ms_(30.68%)_Space_35_MB_(77.27%)

class Solution {
    fun titleToNumber(s: String): Int {
        var num = 0
        var pow = 0
        for (i in s.length - 1 downTo 0) {
            num += Math.pow(26.0, pow++.toDouble()).toInt() * (s[i].toInt() - 'A'.toInt() + 1)
        }
        return num
    }
}
