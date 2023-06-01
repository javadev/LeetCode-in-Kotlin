package g1001_1100.s1079_letter_tile_possibilities

// #Medium #String #Backtracking #2023_06_01_Time_144_ms_(100.00%)_Space_34.2_MB_(100.00%)

class Solution {
    private var count = 0

    fun numTilePossibilities(tiles: String): Int {
        count = 0
        val chars = tiles.toCharArray()
        chars.sort()
        val visited = BooleanArray(chars.size)
        dfs(chars, 0, visited)
        return count
    }

    private fun dfs(chars: CharArray, length: Int, visited: BooleanArray) {
        if (length == chars.size) {
            return
        }
        for (i in chars.indices) {
            if (visited[i] || i - 1 >= 0 && chars[i] == chars[i - 1] && !visited[i - 1]) {
                continue
            }
            count++
            visited[i] = true
            dfs(chars, length + 1, visited)
            visited[i] = false
        }
    }
}
