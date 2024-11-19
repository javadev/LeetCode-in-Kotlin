package g1001_1100.s1036_escape_a_large_maze

// #Hard #Array #Hash_Table #Depth_First_Search #Breadth_First_Search
// #2023_05_25_Time_387_ms_(100.00%)_Space_94.1_MB_(100.00%)

class Solution {
    fun isEscapePossible(blocked: Array<IntArray>, source: IntArray, target: IntArray): Boolean {
        if (blocked.isEmpty()) {
            return true
        }
        val blocks: MutableSet<Int> = HashSet()
        for (b in blocked) {
            if (target[0] * 1000000 + target[1] != b[0] * 1000000 + b[1]) {
                blocks.add(b[0] * 1000000 + b[1])
            }
        }
        return (
            dfs(blocks, source, source[0], source[1], HashSet(), target) &&
                dfs(blocks, target, target[0], target[1], HashSet(), source)
            )
    }

    private fun dfs(
        blocks: Set<Int>,
        start: IntArray,
        i: Int,
        j: Int,
        visited: MutableSet<Int>,
        target: IntArray,
    ): Boolean {
        if (i < 0 || j < 0 || i > 999999 || j > 999999 || blocks.contains(i * 1000000 + j) ||
            visited.contains(i * 1000000 + j)
        ) {
            return false
        }
        if (i == target[0] && j == target[1]) {
            return true
        }
        visited.add(i * 1000000 + j)
        return if (visited.size > blocks.size * (blocks.size + 1)) {
            true
        } else {
            dfs(blocks, start, i + 1, j, visited, target) ||
                dfs(blocks, start, i - 1, j, visited, target) ||
                dfs(blocks, start, i, j + 1, visited, target) ||
                dfs(blocks, start, i, j - 1, visited, target)
        }
    }
}
