package g1001_1100.s1038_binary_search_tree_to_greater_sum_tree

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2023_05_26_Time_123_ms_(91.67%)_Space_34.7_MB_(58.33%)

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
    private var greaterSum = 0
    fun bstToGst(root: TreeNode?): TreeNode {
        if (root!!.right != null) {
            bstToGst(root.right!!)
        }
        root.`val` = greaterSum + root.`val`
        greaterSum = root.`val`
        if (root.left != null) {
            bstToGst(root.left!!)
        }
        return root
    }
}
