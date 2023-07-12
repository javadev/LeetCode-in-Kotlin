package g2501_2600.s2583_kth_largest_sum_in_a_binary_tree

// #Medium #Breadth_First_Search #Tree #Binary_Search
// #2023_07_11_Time_557_ms_(83.33%)_Space_62.6_MB_(66.67%)

import com_github_leetcode.TreeNode
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

class Solution {
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        val heap: Queue<Long> = PriorityQueue()
        val levels: Queue<TreeNode?> = LinkedList()
        levels.offer(root)
        while (levels.isNotEmpty()) {
            var sum: Long = 0
            val size: Int = levels.size
            for (i in 0 until size) {
                val node = levels.poll()
                sum += node!!.`val`
                if (node.left != null) levels.offer(node.left)
                if (node.right != null) levels.offer(node.right)
            }
            if (heap.size < k) {
                heap.offer(sum)
            } else if (heap.peek() < sum) {
                heap.poll()
                heap.offer(sum)
            }
        }
        return if (heap.size < k) -1 else heap.peek()
    }
}
