package g0101_0200.s0144_binary_tree_preorder_traversal

// #Easy #Depth_First_Search #Tree #Binary_Tree #Stack #Data_Structure_I_Day_10_Tree
// #Udemy_Tree_Stack_Queue #2022_10_09_Time_277_ms_(37.90%)_Space_34.2_MB_(82.19%)

import com_github_leetcode.TreeNode
import java.util.Stack

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
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result: MutableList<Int> = ArrayList()
        if (root == null) {
            return result
        }
        val stack: Stack<TreeNode> = Stack<TreeNode>()
        var current: TreeNode? = root
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                result.add(current.`val`)
                stack.push(current.right)
                current = current.left
            }
            current = stack.pop()
        }
        return result
    }
}
