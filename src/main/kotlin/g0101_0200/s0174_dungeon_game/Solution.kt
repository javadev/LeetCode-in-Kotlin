package g0101_0200.s0174_dungeon_game

// #Hard #Array #Dynamic_Programming #Matrix #2022_10_12_Time_300_ms_(66.67%)_Space_37.7_MB_(83.33%)

class Solution {
    fun calculateMinimumHP(dungeon: Array<IntArray>): Int {
        val m = dungeon.size
        val n = dungeon[0].size
        val memo = Array(m) { IntArray(n) }
        return Math.max(1, 1 - traverse(dungeon, 0, 0, memo))
    }

    private fun traverse(dungeon: Array<IntArray>, r: Int, c: Int, memo: Array<IntArray>): Int {
        if (r == dungeon.size - 1 && c == dungeon[0].size - 1) {
            return dungeon[r][c]
        }
        if (memo[r][c] != 0) {
            return memo[r][c]
        }
        var res = Int.MIN_VALUE
        if (r + 1 < dungeon.size) {
            res = Math.max(res, traverse(dungeon, r + 1, c, memo))
        }
        if (c + 1 < dungeon[0].size) {
            res = Math.max(res, traverse(dungeon, r, c + 1, memo))
        }
        res = Math.min(dungeon[r][c], res + dungeon[r][c])
        memo[r][c] = res
        return res
    }
}
