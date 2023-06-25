package g2101_2200.s2194_cells_in_a_range_on_an_excel_sheet

// #Easy #String
class Solution {
    fun cellsInRange(str: String): List<String> {
        val c = str.toCharArray()
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
