package g1401_1500.s1448_count_good_nodes_in_binary_tree

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
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
    private var count = 0
    private fun traverse(root: TreeNode?, max: Int) {
        var max = max
        if (root == null) {
            return
        }
        if (root.`val` >= max) {
            count += 1
            max = root.`val`
        }
        traverse(root.left, max)
        traverse(root.right, max)
    }

    fun goodNodes(root: TreeNode?): Int {
        traverse(root, Int.MIN_VALUE)
        return count
    }
}
