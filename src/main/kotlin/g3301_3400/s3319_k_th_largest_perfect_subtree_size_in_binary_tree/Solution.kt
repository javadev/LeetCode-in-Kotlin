package g3301_3400.s3319_k_th_largest_perfect_subtree_size_in_binary_tree

// #Medium #Sorting #Depth_First_Search #Tree #Binary_Tree
// #2024_10_15_Time_332_ms_(45.45%)_Space_39.6_MB_(100.00%)

import com_github_leetcode.TreeNode
import java.util.PriorityQueue
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
    private val pq: Queue<Int?> = PriorityQueue<Int?>()

    fun kthLargestPerfectSubtree(root: TreeNode?, k: Int): Int {
        dfs(root, k)
        return (if (pq.isEmpty() || pq.size < k) -1 else pq.peek())!!
    }

    private fun dfs(root: TreeNode?, k: Int): Int {
        if (root == null) {
            return 0
        }
        val left = dfs(root.left, k)
        val right = dfs(root.right, k)
        if (left == right) {
            pq.offer(1 + left + right)
        }
        if (pq.size > k) {
            pq.poll()
        }
        return if (left == right) 1 + left + right else -1
    }
}
