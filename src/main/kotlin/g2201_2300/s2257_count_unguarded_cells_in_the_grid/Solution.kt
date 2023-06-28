package g2201_2300.s2257_count_unguarded_cells_in_the_grid

// #Medium #Array #Matrix #Simulation
class Solution {
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        val matrix = Array(m) { CharArray(n) }
        var result = 0
        for (i in 0..guards.size - 1) {
            val guardRow = guards[i][0]
            val guardCol = guards[i][1]
            matrix[guardRow][guardCol] = 'G'
        }
        for (i in 0..walls.size - 1) {
            val wallRow = walls[i][0]
            val wallCol = walls[i][1]
            matrix[wallRow][wallCol] = 'W'
        }
        for (i in 0..guards.size - 1) {
            var currentRow = guards[i][0]
            var currentCol = guards[i][1] - 1
            extracted(matrix, currentRow, currentCol)
            currentRow = guards[i][0]
            currentCol = guards[i][1] + 1
            extracted(n, matrix, currentRow, currentCol)
            currentRow = guards[i][0] - 1
            currentCol = guards[i][1]
            extracted1(matrix, currentRow, currentCol)
            currentRow = guards[i][0] + 1
            currentCol = guards[i][1]
            extracted1(m, matrix, currentRow, currentCol)
        }
        for (i in 0..m - 1) {
            for (j in 0..n - 1) {
                if (matrix[i][j] != 'R' && matrix[i][j] != 'G' && matrix[i][j] != 'W') {
                    result++
                }
            }
        }
        return result
    }

    private fun extracted1(m: Int, matrix: Array<CharArray>, currentRow: Int, currentCol: Int) {
        var currentRow = currentRow
        while (currentRow <= m - 1) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R'
            } else {
                break
            }
            currentRow++
        }
    }

    private fun extracted1(matrix: Array<CharArray>, currentRow: Int, currentCol: Int) {
        var currentRow = currentRow
        while (currentRow >= 0) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R'
            } else {
                break
            }
            currentRow--
        }
    }

    private fun extracted(n: Int, matrix: Array<CharArray>, currentRow: Int, currentCol: Int) {
        var currentCol = currentCol
        while (currentCol <= n - 1) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R'
            } else {
                break
            }
            currentCol++
        }
    }

    private fun extracted(matrix: Array<CharArray>, currentRow: Int, currentCol: Int) {
        var currentCol = currentCol
        while (currentCol >= 0) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R'
            } else {
                break
            }
            currentCol--
        }
    }
}
