package g0001_0100.s0096_unique_binary_search_trees

// #Medium #Dynamic_Programming #Math #Tree #Binary_Tree #Binary_Search_Tree
// #Dynamic_Programming_I_Day_11 #Big_O_Time_O(n)_Space_O(1)
// #2023_07_10_Time_116_ms_(92.31%)_Space_32.6_MB_(84.62%)

class Solution {
    fun numTrees(n: Int): Int {
        var result: Long = 1
        for (i in 0 until n) {
            result *= 2L * n - i
            result /= (i + 1).toLong()
        }
        result /= (n + 1).toLong()
        return result.toInt()
    }
}
