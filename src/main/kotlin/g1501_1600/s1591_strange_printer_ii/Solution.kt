package g1501_1600.s1591_strange_printer_ii

// #Hard #Array #Matrix #Graph #Topological_Sort
class Solution {
    fun isPrintable(targetGrid: Array<IntArray>): Boolean {
        val colorBound = Array(61) { IntArray(4) }
        val colors: MutableSet<Int> = HashSet()
        // prepare colorBound with Max and Min integer for later compare
        for (i in colorBound.indices) {
            for (j in colorBound[0].indices) {
                if (j == 0 || j == 1) {
                    colorBound[i][j] = Int.MAX_VALUE
                } else {
                    colorBound[i][j] = Int.MIN_VALUE
                }
            }
        }
        // find the color range for each color
        // each color i has a colorBound[i] with {min_i, min_j, max_i, max_j}
        for (i in targetGrid.indices) {
            for (j in targetGrid[0].indices) {
                colorBound[targetGrid[i][j]][0] = Math.min(colorBound[targetGrid[i][j]][0], i)
                colorBound[targetGrid[i][j]][1] = Math.min(colorBound[targetGrid[i][j]][1], j)
                colorBound[targetGrid[i][j]][2] = Math.max(colorBound[targetGrid[i][j]][2], i)
                colorBound[targetGrid[i][j]][3] = Math.max(colorBound[targetGrid[i][j]][3], j)
                colors.add(targetGrid[i][j])
            }
        }
        val printed = BooleanArray(61)
        val visited = Array(targetGrid.size) { BooleanArray(targetGrid[0].size) }
        // DFS all the colors, skip the color already be printed
        for (color in colors) {
            if (printed[color]) {
                continue
            }
            if (!dfs(targetGrid, printed, colorBound, visited, color)) {
                return false
            }
        }
        // if all color has been printed, then return true
        return true
    }

    private fun dfs(
        targetGrid: Array<IntArray>,
        printed: BooleanArray,
        colorBound: Array<IntArray>,
        visited: Array<BooleanArray>,
        color: Int
    ): Boolean {
        printed[color] = true
        for (i in colorBound[color][0]..colorBound[color][2]) {
            for (j in colorBound[color][1]..colorBound[color][3]) {
                // if i, j is already visited, skip
                if (visited[i][j]) {
                    continue
                }
                // if we find a different color, then check if the color is already printed, if so,
                // return false
                // otherwise, dfs the range of the new color
                if (targetGrid[i][j] != color) {
                    if (printed[targetGrid[i][j]]) {
                        return false
                    }
                    if (!dfs(targetGrid, printed, colorBound, visited, targetGrid[i][j])) {
                        return false
                    }
                }
                visited[i][j] = true
            }
        }
        return true
    }
}
