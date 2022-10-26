package g0201_0300.s0235_lowest_common_ancestor_of_a_binary_search_tree

// #Easy #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree #Data_Structure_I_Day_14_Tree
// #Level_1_Day_8_Binary_Search_Tree #2022_10_26_Time_404_ms_(75.59%)_Space_46.1_MB_(78.74%)

import com_github_leetcode.TreeNode

/*
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        if (p!!.`val` < root.`val` && q!!.`val` < root.`val`) {
            return lowestCommonAncestor(root.left, q, p)
        }
        if (p.`val` > root.`val` && q!!.`val` > root.`val`) {
            return lowestCommonAncestor(root.right, q, p)
        }
        return root
    }
}
