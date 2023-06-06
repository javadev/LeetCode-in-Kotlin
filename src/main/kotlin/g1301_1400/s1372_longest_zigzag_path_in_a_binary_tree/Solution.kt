package g1301_1400.s1372_longest_zigzag_path_in_a_binary_tree

import com_github_leetcode.TreeNode

// #Medium #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree
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
    private var maxLength = 0
    fun longestZigZag(root: TreeNode?): Int {
        dfs(root, true)
        return maxLength
    }

    private fun dfs(root: TreeNode?, isLeft: Boolean): Int {
        if (root == null) {
            return 0
        }
        val left = dfs(root.left, false)
        val right = dfs(root.right, true)
        maxLength = Math.max(maxLength, left)
        maxLength = Math.max(maxLength, right)
        return 1 + if (isLeft) left else right
    }
}
