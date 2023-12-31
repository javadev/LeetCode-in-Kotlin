package g2901_3000.s2923_find_champion_i

// #Easy #Array #Matrix #2023_12_31_Time_591_ms_(5.63%)_Space_49.8_MB_(36.62%)

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
