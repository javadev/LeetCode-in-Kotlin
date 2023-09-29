package g0201_0300.s0236_lowest_common_ancestor_of_a_binary_tree

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #Data_Structure_II_Day_18_Tree #Udemy_Tree_Stack_Queue #Big_O_Time_O(n)_Space_O(n)
// #2022_09_10_Time_386_ms_(45.21%)_Space_43.9_MB_(81.65%)

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
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        if (root.`val` == p?.`val` || root.`val` == q?.`val`) {
            return root
        }
        val left: TreeNode? = lowestCommonAncestor(root.left, p, q)
        val right: TreeNode? = lowestCommonAncestor(root.right, p, q)
        if (left != null && right != null) {
            return root
        }
        return left ?: right
    }
}
