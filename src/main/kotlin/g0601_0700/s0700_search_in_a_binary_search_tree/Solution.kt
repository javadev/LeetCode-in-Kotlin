package g0601_0700.s0700_search_in_a_binary_search_tree

// #Easy #Tree #Binary_Tree #Binary_Search_Tree #Data_Structure_I_Day_13_Tree
// #2023_02_22_Time_251_ms_(88.31%)_Space_51_MB_(7.79%)

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
@Suppress("NAME_SHADOWING")
class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        var root: TreeNode? = root
        while (root != null && root.`val` != `val`) {
            root = if (root.`val` > `val`) {
                root.left
            } else {
                root.right
            }
        }
        return root
    }
}
