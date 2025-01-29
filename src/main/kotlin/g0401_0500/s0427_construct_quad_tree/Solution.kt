package g0401_0500.s0427_construct_quad_tree

// #Medium #Array #Tree #Matrix #Divide_and_Conquer #Top_Interview_150_Divide_and_Conquer
// #2022_12_08_Time_221_ms_(94.74%)_Space_36.9_MB_(94.74%)

/*
 * Definition for a QuadTree node.
 * class Node(var `val`: Boolean, var isLeaf: Boolean) {
 *     var topLeft: Node? = null
 *     var topRight: Node? = null
 *     var bottomLeft: Node? = null
 *     var bottomRight: Node? = null
 * }
 */
class Solution {
    fun construct(grid: Array<IntArray>): Node? {
        return construct(grid, 0, 0, grid.size)
    }

    private fun construct(grid: Array<IntArray>, x: Int, y: Int, len: Int): Node? {
        val value: Int = grid[x][y]
        if (len == 1) { return Node(value == 1, true) }
        var isLeaf = true
        for (i in 0 until len) {
            for (p in 0 until len) {
                if (grid[x + i][y + p] != value) {
                    isLeaf = false
                }
            }
        }
        if (isLeaf) { return Node(value == 1, true) }
        return Node(true, false).apply {
            val halfLength: Int = len / 2
            topLeft = construct(grid, x, y, halfLength)
            topRight = construct(grid, x, y + halfLength, halfLength)
            bottomLeft = construct(grid, x + halfLength, y, halfLength)
            bottomRight = construct(grid, x + halfLength, y + halfLength, halfLength)
        }
    }
}
