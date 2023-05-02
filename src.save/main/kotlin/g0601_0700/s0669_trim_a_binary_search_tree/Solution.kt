package g0601_0700.s0669_trim_a_binary_search_tree

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2023_02_14_Time_195_ms_(100.00%)_Space_36.3_MB_(100.00%)

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
    fun trimBST(root: TreeNode?, l: Int, r: Int): TreeNode? {
        if (root == null) {
            return root
        }
        if (root.`val` > r) {
            return trimBST(root.left, l, r)
        }
        if (root.`val` < l) {
            return trimBST(root.right, l, r)
        }
        root.left = trimBST(root.left, l, r)
        root.right = trimBST(root.right, l, r)
        return root
    }
}
