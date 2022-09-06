package g0201_0300.s0222_count_complete_tree_nodes

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Tree #Binary_Search #Binary_Tree #Binary_Search_II_Day_10
// #2022_07_04_Time_0_ms_(100.00%)_Space_50_MB_(37.43%)
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
    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val leftHeight = leftHeight(root)
        val rightHeight = rightHeight(root)
        // case 1: When Height(Left sub-tree) = Height(right sub-tree) 2^h - 1
        return if (leftHeight == rightHeight) {
            (1 shl leftHeight) - 1
        } else {
            1 + countNodes(root.left) + countNodes(root.right)
        }
    }

    private fun leftHeight(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else 1 + leftHeight(root.left)
    }

    private fun rightHeight(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else 1 + rightHeight(root.right)
    }
}
