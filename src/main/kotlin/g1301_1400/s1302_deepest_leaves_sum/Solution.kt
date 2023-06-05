package g1301_1400.s1302_deepest_leaves_sum

import com_github_leetcode.TreeNode
import java.util.LinkedList
import java.util.Objects
import java.util.Queue

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
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
