package g2301_2400.s2385_amount_of_time_for_binary_tree_to_be_infected

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
    private var max = 0
    fun amountOfTime(root: TreeNode?, start: Int): Int {
        dfs(root, start, Distance(-1))
        return max
    }

    private fun dfs(root: TreeNode?, start: Int, l: Distance): Int {
        if (root == null) {
            return 0
        }
        val ld = Distance(-1)
        val rd = Distance(-1)
        val left = dfs(root.left, start, ld)
        val right = dfs(root.right, start, rd)
        if (l.`val` == -1 && start == root.`val`) {
            max = Math.max(left, right)
            l.`val` = 1
        }
        if (ld.`val` != -1) {
            max = Math.max(max, ld.`val` + right)
            l.`val` = ld.`val` + 1
        } else if (rd.`val` != -1) {
            max = Math.max(max, rd.`val` + left)
            l.`val` = rd.`val` + 1
        }
        return Math.max(left, right) + 1
    }

    private class Distance internal constructor(var `val`: Int)
}
