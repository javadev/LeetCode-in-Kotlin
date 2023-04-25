package g0801_0900.s0885_spiral_matrix_iii

// #Medium #Array #Matrix #Simulation #2023_04_08_Time_265_ms_(100.00%)_Space_39.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun spiralMatrixIII(rows: Int, cols: Int, y: Int, x: Int): Array<IntArray> {
        var y = y
        var x = x
        var j: Int
        var i = 0
        var moves = 0
        val result = Array(rows * cols) { IntArray(2) }
        result[0][0] = y
        result[0][1] = x
        i++
        while (i < result.size) {
            moves++
            // Move right
            if (y < 0 || y >= rows) {
                x += moves
            } else {
                j = 0
                while (j < moves) {
                    x++
                    if (x in 0 until cols) {
                        result[i][0] = y
                        result[i][1] = x
                        i++
                    }
                    j++
                }
            }
            if (i >= result.size) {
                break
            }
            // Move down
            if (x < 0 || x >= cols) {
                y += moves
            } else {
                j = 0
                while (j < moves) {
                    y++
                    if (y in 0 until rows) {
                        result[i][0] = y
                        result[i][1] = x
                        i++
                    }
                    j++
                }
            }
            if (i >= result.size) {
                break
            }
            moves++
            // Move left
            if (y < 0 || y >= rows) {
                x -= moves
            } else {
                j = 0
                while (j < moves) {
                    x--
                    if (x in 0 until cols) {
                        result[i][0] = y
                        result[i][1] = x
                        i++
                    }
                    j++
                }
            }
            if (i >= result.size) {
                break
            }
            // Move up
            if (x < 0 || x >= cols) {
                y -= moves
            } else {
                j = 0
                while (j < moves) {
                    y--
                    if (y in 0 until rows) {
                        result[i][0] = y
                        result[i][1] = x
                        i++
                    }
                    j++
                }
            }
        }
        return result
    }
}
