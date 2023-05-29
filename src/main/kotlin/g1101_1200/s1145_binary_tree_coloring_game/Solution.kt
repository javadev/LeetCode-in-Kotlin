package g1101_1200.s1145_binary_tree_coloring_game

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Tree #Binary_Tree
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
    fun btreeGameWinningMove(root: TreeNode?, n: Int, x: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.`val` == x) {
            val leftCount = countNodes(root.left)
            val rightCount = countNodes(root.right)
            val parent = n - (leftCount + rightCount + 1)
            return parent > leftCount + rightCount || leftCount > parent + rightCount || rightCount > parent + leftCount
        }
        return btreeGameWinningMove(root.left, n, x) || btreeGameWinningMove(root.right, n, x)
    }

    private fun countNodes(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else countNodes(root.left) + countNodes(root.right) + 1
    }
}