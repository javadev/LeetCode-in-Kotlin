package g0001_0100.s0096_unique_binary_search_trees

// #Medium #Top_100_Liked_Questions #Dynamic_Programming #Math #Tree #Binary_Tree
// #Binary_Search_Tree #Dynamic_Programming_I_Day_11
// #2022_09_16_Time_237_ms_(26.76%)_Space_33_MB_(85.92%)

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
