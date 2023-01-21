package g0501_0600.s0559_maximum_depth_of_n_ary_tree

// #Easy #Depth_First_Search #Breadth_First_Search #Tree
// #2023_01_21_Time_196_ms_(100.00%)_Space_37.6_MB_(92.31%)

import com_github_leetcode.Node

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: List<Node?> = listOf()
 * }
 */

class Solution {
    private var max = 0
    fun maxDepth(root: Node?): Int {
        if (root == null) {
            return 0
        }
        if (root.neighbors.isEmpty()) {
            return 1
        }
        for (child in root.neighbors) {
            findDepth(child, 1)
        }
        return max
    }

    private fun findDepth(n: Node?, d: Int) {
        if (!n!!.neighbors.isEmpty()) {
            for (no in n.neighbors) {
                findDepth(no, d + 1)
            }
        } else {
            max = Math.max(max, d + 1)
        }
    }
}
