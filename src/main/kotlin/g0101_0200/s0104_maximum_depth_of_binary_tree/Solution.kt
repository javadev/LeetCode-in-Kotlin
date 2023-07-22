package g0101_0200.s0104_maximum_depth_of_binary_tree

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search
// #Tree #Binary_Tree #Data_Structure_I_Day_11_Tree
// #Programming_Skills_I_Day_10_Linked_List_and_Tree #Udemy_Tree_Stack_Queue
// #2023_07_11_Time_166_ms_(83.53%)_Space_36.5_MB_(86.11%)

import com_github_leetcode.TreeNode
import kotlin.math.max

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
    fun maxDepth(root: TreeNode?): Int {
        return findDepth(root, 0)
    }

    private fun findDepth(node: TreeNode?, currentDepth: Int): Int {
        var localCurrentDepth = currentDepth
        if (node == null) {
            return 0
        }
        localCurrentDepth++
        return 1 + max(findDepth(node.left, localCurrentDepth), findDepth(node.right, localCurrentDepth))
    }
}
