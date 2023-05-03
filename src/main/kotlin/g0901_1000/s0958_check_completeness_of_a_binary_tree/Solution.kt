package g0901_1000.s0958_check_completeness_of_a_binary_tree

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2023_05_03_Time_142_ms_(96.04%)_Space_36.4_MB_(5.76%)

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
    fun isCompleteTree(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        val queue: LinkedList<TreeNode?> = LinkedList<TreeNode?>()
        queue.add(root.left)
        queue.add(root.right)
        var seenNull = false
        while (!queue.isEmpty()) {
            val node: TreeNode? = queue.poll()
            if (node == null) {
                seenNull = true
            } else {
                if (seenNull) {
                    return false
                }
                queue.add(node.left)
                queue.add(node.right)
            }
        }
        return true
    }
}
