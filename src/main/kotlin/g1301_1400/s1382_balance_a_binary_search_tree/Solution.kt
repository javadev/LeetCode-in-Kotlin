package g1301_1400.s1382_balance_a_binary_search_tree

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Greedy #Tree #Binary_Tree #Binary_Search_Tree #Divide_and_Conquer
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
    fun balanceBST(root: TreeNode?): TreeNode? {
        val inorder = inorder(root, ArrayList())
        return dfs(inorder, 0, inorder.size - 1)
    }

    private fun inorder(root: TreeNode?, list: MutableList<Int>): List<Int> {
        if (root == null) {
            return list
        }
        inorder(root.left, list)
        list.add(root.`val`)
        return inorder(root.right, list)
    }

    private fun dfs(nums: List<Int>, start: Int, end: Int): TreeNode? {
        if (end < start) {
            return null
        }
        val mid = (start + end) / 2
        val root = TreeNode(nums[mid])
        root.left = dfs(nums, start, mid - 1)
        root.right = dfs(nums, mid + 1, end)
        return root
    }
}
