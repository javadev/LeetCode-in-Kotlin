package g2001_2100.s2075_decode_the_slanted_ciphertext

// #Medium #String #Simulation #2023_06_26_Time_418_ms_(100.00%)_Space_49.2_MB_(100.00%)

class Solution {
    fun decodeCiphertext(encodedText: String, rows: Int): String {
        if (rows == 1) {
            return encodedText
        }
        val total = encodedText.length
        val cols = total / rows
        val grid = Array(rows) { CharArray(cols) }
        var index = 0
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                grid[i][j] = encodedText[index++]
            }
        }
        val sb = StringBuilder()
        var colIndex = 0
        while (colIndex < cols) {
            var j = colIndex
            var i = 0
            while (j < cols && i < rows) {
                sb.append(grid[i][j])
                j++
                i++
            }
            colIndex++
        }
        var i = sb.length - 1
        while (i >= 0 && sb[i] == ' ') {
            i--
        }
        return sb.substring(0, i + 1)
    }
}
