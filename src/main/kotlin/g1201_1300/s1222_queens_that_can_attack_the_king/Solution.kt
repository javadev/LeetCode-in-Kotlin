package g1201_1300.s1222_queens_that_can_attack_the_king

// #Medium #Array #Matrix #Simulation #2023_06_09_Time_189_ms_(50.00%)_Space_38.1_MB_(50.00%)

class Solution {
    fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        val queensLoc: MutableMap<Int, MutableSet<Int>> = HashMap()
        for (queen in queens) {
            val queensY = queensLoc.getOrDefault(queen[0], HashSet())
            queensY.add(queen[1])
            queensLoc[queen[0]] = queensY
        }
        dfs(queensLoc, king[0] - 1, king[1], result, "n")
        dfs(queensLoc, king[0] + 1, king[1], result, "s")
        dfs(queensLoc, king[0], king[1] + 1, result, "e")
        dfs(queensLoc, king[0], king[1] - 1, result, "w")
        dfs(queensLoc, king[0] - 1, king[1] - 1, result, "nw")
        dfs(queensLoc, king[0] - 1, king[1] + 1, result, "ne")
        dfs(queensLoc, king[0] + 1, king[1] - 1, result, "sw")
        dfs(queensLoc, king[0] + 1, king[1] + 1, result, "se")
        return result
    }

    fun dfs(
        queens: Map<Int, MutableSet<Int>>,
        x: Int,
        y: Int,
        result: MutableList<List<Int>>,
        direction: String?,
    ) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return
        }
        if (queens.containsKey(x) && queens[x]!!.contains(y)) {
            result.add(ArrayList(listOf(x, y)))
            return
        }
        when (direction) {
            "n" -> dfs(queens, x - 1, y, result, direction)
            "s" -> dfs(queens, x + 1, y, result, direction)
            "e" -> dfs(queens, x, y + 1, result, direction)
            "w" -> dfs(queens, x, y - 1, result, direction)
            "ne" -> dfs(queens, x - 1, y + 1, result, direction)
            "nw" -> dfs(queens, x - 1, y - 1, result, direction)
            "se" -> dfs(queens, x + 1, y + 1, result, direction)
            "sw" -> dfs(queens, x + 1, y - 1, result, direction)
        }
    }
}
