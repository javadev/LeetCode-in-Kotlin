package g3401_3500.s3484_design_spreadsheet

// #Medium #2025_03_16_Time_176_ms_(100.00%)_Space_79.62_MB_(100.00%)

@Suppress("unused")
class Spreadsheet(rows: Int) {
    private val data: MutableMap<String, Int> = HashMap<String, Int>()

    fun setCell(cell: String, value: Int) {
        data.put(cell, value)
    }

    fun resetCell(cell: String) {
        data.put(cell, 0)
    }

    fun getValue(formula: String): Int {
        val index = formula.indexOf('+')
        val left = formula.substring(1, index)
        val right = formula.substring(index + 1)
        val x =
            if (Character.isLetter(left[0])) {
                data.getOrDefault(left, 0)
            } else {
                left.toInt()
            }
        val y =
            if (Character.isLetter(right[0])) {
                data.getOrDefault(right, 0)
            } else {
                right.toInt()
            }
        return x + y
    }
}

/*
 * Your Spreadsheet object will be instantiated and called as such:
 * var obj = Spreadsheet(rows)
 * obj.setCell(cell,value)
 * obj.resetCell(cell)
 * var param_3 = obj.getValue(formula)
 */
