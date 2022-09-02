package g0101_0200.s0102_binary_tree_level_order_traversal

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Breadth_First_Search #Tree
// #Binary_Tree #Data_Structure_I_Day_11_Tree #Level_1_Day_6_Tree #Udemy_Tree_Stack_Queue
// #2022_09_02_Time_355_ms_(29.37%)_Space_36.7_MB_(63.47%)

import com_github_leetcode.TreeNode
import java.util.ArrayList
import java.util.LinkedList
import java.util.Queue

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var root: TreeNode? = root
        val result: MutableList<List<Int>> = ArrayList()
        if (root == null) {
            return result
        }
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        queue.add(null)
        var level: MutableList<Int> = ArrayList()
        while (!queue.isEmpty()) {
            root = queue.remove()
            while (!queue.isEmpty() && root != null) {
                level.add(root.`val`)
                if (root.left != null) {
                    queue.add(root.left)
                }
                if (root.right != null) {
                    queue.add(root.right)
                }
                root = queue.remove()
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
