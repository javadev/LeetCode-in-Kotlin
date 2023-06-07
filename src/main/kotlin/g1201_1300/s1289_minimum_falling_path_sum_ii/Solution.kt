package g1201_1300.s1289_minimum_falling_path_sum_ii

// #Hard #Array #Dynamic_Programming #Matrix
class Solution {
    fun minFallingPathSum(grid: Array<IntArray>): Int {
        val n = grid[0].size
        var prev = IntArray(n)
        var curr = IntArray(n)
        var prevMinOne = 0
        var prevMinTwo = 0
        for (ints in grid) {
            var currMinOne = Int.MAX_VALUE
            var currMinTwo = Int.MAX_VALUE
            for (j in 0 until n) {
                val prevMin = if (prev[j] == prevMinOne) prevMinTwo else prevMinOne
                curr[j] = ints[j] + prevMin
                if (curr[j] < currMinOne) {
                    currMinTwo = currMinOne
                    currMinOne = curr[j]
                } else if (curr[j] < currMinTwo) {
                    currMinTwo = curr[j]
                }
            }
            prevMinOne = currMinOne
            prevMinTwo = currMinTwo
            // reuse curr array, avoid new int[] in every row
            val temp = prev
            prev = curr
            curr = temp
        }
        return prevMinOne
    }
}
