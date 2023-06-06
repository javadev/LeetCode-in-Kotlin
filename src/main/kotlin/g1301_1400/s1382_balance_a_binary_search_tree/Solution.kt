package g1301_1400.s1382_balance_a_binary_search_tree

// #Medium #Depth_First_Search #Greedy #Tree #Binary_Tree #Binary_Search_Tree #Divide_and_Conquer
// #2023_06_06_Time_369_ms_(85.71%)_Space_42.9_MB_(92.86%)

import com_github_leetcode.TreeNode

/*
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
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
