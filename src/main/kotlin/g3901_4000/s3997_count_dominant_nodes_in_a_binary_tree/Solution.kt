package g3901_4000.s3997_count_dominant_nodes_in_a_binary_tree

// #Medium #Depth_First_Search #Tree #Binary_Tree #Senior #Weekly_Contest_511
// #2026_11_17_Time_7_ms_(95.22%)_Space_172.70_MB_(86.01%)

import com_github_leetcode.TreeNode
import kotlin.math.max

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private var dominantNode = 0

    fun countDominantNodes(root: TreeNode?): Int {
        dominantNode = 0
        dfs(root)
        return dominantNode
    }

    private fun dfs(root: TreeNode?): Int {
        if (root == null) {
            return Int.MIN_VALUE
        }
        if (root.left == null && root.right == null) {
            dominantNode++
            return root.`val`
        }
        val left = dfs(root.left)
        val right = dfs(root.right)
        val max = max(left, right)
        if (root.`val` >= max) {
            dominantNode++
        }
        return max(max, root.`val`)
    }
}
