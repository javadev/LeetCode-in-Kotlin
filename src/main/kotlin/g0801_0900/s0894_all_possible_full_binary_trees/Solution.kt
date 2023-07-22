package g0801_0900.s0894_all_possible_full_binary_trees

// #Medium #Dynamic_Programming #Tree #Binary_Tree #Recursion #Memoization
// #2023_04_11_Time_257_ms_(100.00%)_Space_46.5_MB_(90.00%)

import com_github_leetcode.TreeNode

/*
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun allPossibleFBT(n: Int): List<TreeNode> {
        if (n % 2 == 0) {
            // no complete binary tree possible
            return ArrayList()
        }
        val dp: Array<ArrayList<TreeNode>?> = arrayOfNulls(n + 1)
        // form left to right
        var i = 1
        while (i <= n) {
            helper(i, dp)
            i += 2
        }
        return dp[n]!!
    }

    // Using tabulation
    private fun helper(n: Int, dp: Array<ArrayList<TreeNode>?>) {
        if (n <= 0) {
            return
        }
        if (n == 1) {
            dp[1] = ArrayList()
            dp[1]!!.add(TreeNode(0))
            return
        }
        dp[n] = ArrayList()
        var i = 1
        while (i < n) {
            // left
            for (nodeL in dp[i]!!) {
                // right
                for (nodeR in dp[n - i - 1]!!) {
                    // 1 node used here
                    val root = TreeNode(0)
                    root.left = nodeL
                    root.right = nodeR
                    dp[n]!!.add(root)
                }
            }
            i += 2
        }
    }
}
