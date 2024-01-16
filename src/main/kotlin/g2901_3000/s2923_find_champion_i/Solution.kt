package g2901_3000.s2923_find_champion_i

// #Easy #Array #Matrix #2024_01_16_Time_320_ms_(58.62%)_Space_49.8_MB_(48.28%)

class Solution {
    fun findChampion(grid: Array<IntArray>): Int {
        var champion = grid[1][0]
        for (opponent in 2 until grid.size) {
            if (grid[opponent][champion] != 0) {
                champion = opponent
            }
        }
        return champion
    }
}
