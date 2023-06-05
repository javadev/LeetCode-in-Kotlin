package g1301_1400.s1325_delete_leaves_with_a_given_value

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
    fun removeLeafNodes(root: TreeNode?, target: Int): TreeNode? {
        var root = root
        while (hasTargetLeafNodes(root, target)) {
            root = removeLeafNodes(target, root)
        }
        return root
    }

    private fun removeLeafNodes(target: Int, root: TreeNode?): TreeNode? {
        var root = root
        if (root == null) {
            return root
        }
        if (root.`val` == target && root.left == null && root.right == null) {
            root = null
            return root
        }
        if (root.left != null && root.left!!.`val` == target && root.left!!.left == null && root.left!!.right == null) {
            root.left = null
        }
        if (root.right != null && root.right!!.`val` == target && root.right!!.left == null &&
            root.right!!.right == null
        ) {
            root.right = null
        }
        removeLeafNodes(target, root.left)
        removeLeafNodes(target, root.right)
        return root
    }

    private fun hasTargetLeafNodes(root: TreeNode?, target: Int): Boolean {
        if (root == null) {
            return false
        }
        return if (root.left == null && root.right == null && root.`val` == target) {
            true
        } else hasTargetLeafNodes(root.left, target) || hasTargetLeafNodes(root.right, target)
    }
}
