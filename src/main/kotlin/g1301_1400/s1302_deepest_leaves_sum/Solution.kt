package g1301_1400.s1302_deepest_leaves_sum

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_06_05_Time_325_ms_(67.39%)_Space_40.1_MB_(76.09%)

import com_github_leetcode.TreeNode
import java.util.LinkedList
import java.util.Objects
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
    fun deepestLeavesSum(root: TreeNode?): Int {
        val queue: Queue<TreeNode?> = LinkedList()
        queue.offer(root)
        var sum = 0
        while (!queue.isEmpty()) {
            val size = queue.size
            sum = 0
            for (i in 0 until size) {
                val curr = queue.poll()
                sum += Objects.requireNonNull(curr)!!.`val`
                if (curr!!.left != null) {
                    queue.offer(curr.left)
                }
                if (curr.right != null) {
                    queue.offer(curr.right)
                }
            }
        }
        return sum
    }
}
