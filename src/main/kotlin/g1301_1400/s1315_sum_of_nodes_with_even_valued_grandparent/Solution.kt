package g1301_1400.s1315_sum_of_nodes_with_even_valued_grandparent

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
    fun sumEvenGrandparent(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else dfs(root, root.left, 0) + dfs(root, root.right, 0)
    }

    private fun dfs(grandparent: TreeNode?, parent: TreeNode?, sum: Int): Int {
        var sum = sum
        if (grandparent == null || parent == null) {
            return sum
        }
        if (grandparent.`val` % 2 == 0 && parent.left != null) {
            sum += parent.left!!.`val`
        }
        if (grandparent.`val` % 2 == 0 && parent.right != null) {
            sum += parent.right!!.`val`
        }
        sum = dfs(parent, parent.left, sum)
        sum = dfs(parent, parent.right, sum)
        return sum
    }
}
