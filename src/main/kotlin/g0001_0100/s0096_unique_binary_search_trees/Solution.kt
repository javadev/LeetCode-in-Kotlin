package g0001_0100.s0096_unique_binary_search_trees

// #Medium #Top_100_Liked_Questions #Dynamic_Programming #Math #Tree #Binary_Tree
// #Binary_Search_Tree #Dynamic_Programming_I_Day_11
// #2022_10_07_Time_147_ms_(88.52%)_Space_32.6_MB_(96.72%)

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
