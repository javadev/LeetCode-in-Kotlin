package g0101_0200.s0117_populating_next_right_pointers_in_each_node_ii

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Linked_List
// #Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search
// #2022_10_08_Time_199_ms_(94.67%)_Space_37_MB_(93.33%)

import com_github_leetcode.left_right.Node
import java.util.LinkedList
import java.util.Queue

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */
class Solution {
    fun connect(root: Node?): Node? {
        if (root == null) return null
        val bfsQueue: Queue<Node> = LinkedList()
        bfsQueue.offer(root)
        root.next = null
        var temp: Node?
        var prev: Node?
        while (bfsQueue.isNotEmpty()) {
            val size = bfsQueue.size
            prev = null
            for (j in 0 until size) {
                temp = bfsQueue.poll()
                if (prev != null) prev.next = temp
                if (temp!!.left != null) bfsQueue.offer(temp.left)
                if (temp.right != null) bfsQueue.offer(temp.right)
                prev = temp
            }
        }
        return root
    }
}
