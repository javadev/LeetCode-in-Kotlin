package g3201_3300.s3242_design_neighbor_sum_service

// #Easy #Array #Hash_Table #Matrix #Design #Simulation
// #2024_08_07_Time_333_ms_(75.00%)_Space_49.4_MB_(81.25%)

class NeighborSum(private val grid: Array<IntArray>) {
    private val n = grid.size
    private val rowIndex = IntArray(n * n)
    private val colIndex = IntArray(n * n)

    init {
        // Precompute the positions of each value in the grid for quick access
        for (i in 0 until n) {
            for (j in 0 until n) {
                rowIndex[grid[i][j]] = i
                colIndex[grid[i][j]] = j
            }
        }
    }

    fun adjacentSum(value: Int): Int {
        var sum = 0
        val i = rowIndex[value]
        val j = colIndex[value]
        // Check up
        if (i > 0) {
            sum += grid[i - 1][j]
        }
        // Check down
        if (i < n - 1) {
            sum += grid[i + 1][j]
        }
        // Check left
        if (j > 0) {
            sum += grid[i][j - 1]
        }
        // Check right
        if (j < n - 1) {
            sum += grid[i][j + 1]
        }
        return sum
    }

    fun diagonalSum(value: Int): Int {
        var sum = 0
        val i = rowIndex[value]
        val j = colIndex[value]
        // Check top-left
        if (i > 0 && j > 0) {
            sum += grid[i - 1][j - 1]
        }
        // Check top-right
        if (i > 0 && j < n - 1) {
            sum += grid[i - 1][j + 1]
        }
        // Check bottom-left
        if (i < n - 1 && j > 0) {
            sum += grid[i + 1][j - 1]
        }
        // Check bottom-right
        if (i < n - 1 && j < n - 1) {
            sum += grid[i + 1][j + 1]
        }
        return sum
    }
}

/*
 * Your neighborSum object will be instantiated and called as such:
 * var obj = neighborSum(grid)
 * var param_1 = obj.adjacentSum(value)
 * var param_2 = obj.diagonalSum(value)
 */
