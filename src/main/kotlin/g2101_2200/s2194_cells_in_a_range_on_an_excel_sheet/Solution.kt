package g2101_2200.s2194_cells_in_a_range_on_an_excel_sheet

// #Easy #String #2023_06_26_Time_176_ms_(100.00%)_Space_37.1_MB_(100.00%)

class Solution {
    fun cellsInRange(s: String): List<String> {
        val c = s.toCharArray()
        val strings: MutableList<String> = ArrayList()
        var i = c[0]
        while (i <= c[3]) {
            var j = c[1]
            while (j <= c[4]) {
                strings.add(String(charArrayOf(i, j)))
                j++
            }
            i++
        }
        return strings
    }
}
