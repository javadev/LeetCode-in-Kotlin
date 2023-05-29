package g1101_1200.s1123_lowest_common_ancestor_of_deepest_leaves

import com_github_leetcode.TreeNode

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree

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
    fun lcaDeepestLeaves(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val leftDep = getDep(root.left)
        val rightDep = getDep(root.right)
        return if (leftDep == rightDep) {
            root
        } else {
            if (leftDep > rightDep) {
                lcaDeepestLeaves(root.left)
            } else {
                lcaDeepestLeaves(root.right)
            }
        }
    }

    fun getDep(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else 1 + Math.max(getDep(root.left), getDep(root.right))
    }
}