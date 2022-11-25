package g0101_0200.s0102_binary_tree_level_order_traversal

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Breadth_First_Search #Tree
// #Binary_Tree #Data_Structure_I_Day_11_Tree #Level_1_Day_6_Tree #Udemy_Tree_Stack_Queue
// #2022_11_25_Time_332_ms_(67.53%)_Space_37_MB_(56.24%)

import com_github_leetcode.TreeNode
import java.util.ArrayList
import java.util.LinkedList
import java.util.Queue

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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var localRoot: TreeNode? = root
        val result: MutableList<List<Int>> = ArrayList()
        if (localRoot == null) {
            return result
        }
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(localRoot)
        queue.add(null)
        var level: MutableList<Int> = ArrayList()
        while (!queue.isEmpty()) {
            localRoot = queue.remove()
            while (!queue.isEmpty() && localRoot != null) {
                level.add(localRoot.`val`)
                if (localRoot.left != null) {
                    queue.add(localRoot.left)
                }
                if (localRoot.right != null) {
                    queue.add(localRoot.right)
                }
                localRoot = queue.remove()
            }
            result.add(level)
            level = ArrayList()
            if (!queue.isEmpty()) {
                queue.add(null)
            }
        }
        return result
    }
}
