package g0901_1000.s0965_univalued_binary_tree

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_05_05_Time_138_ms_(90.91%)_Space_35.2_MB_(9.09%)

import com_github_leetcode.TreeNode
import java.util.LinkedList

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
    fun isUnivalTree(root: TreeNode?): Boolean {
        val `val`: Int = root!!.`val`
        val queue: LinkedList<TreeNode?> = LinkedList<TreeNode?>()
        queue.add(root)
        while (!queue.isEmpty()) {
            val node: TreeNode? = queue.poll()
            if (node!!.`val` != `val`) {
                return false
            }
            if (node.left != null) {
                queue.add(node.left)
            }
            if (node.right != null) {
                queue.add(node.right)
            }
        }
        return true
    }
}
