package g0501_0600.s0590_n_ary_tree_postorder_traversal

// #Easy #Depth_First_Search #Tree #Stack #2023_01_31_Time_237_ms_(88.10%)_Space_38.9_MB_(76.19%)

import com_github_leetcode.Node

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    private var ans: ArrayList<Int>? = null
    fun postorder(root: Node?): List<Int> {
        ans = ArrayList()
        recursion(root)
        if (root != null) {
            ans!!.add(root.`val`)
        }
        return ans as ArrayList<Int>
    }

    private fun recursion(root: Node?) {
        if (root == null) {
            return
        }
        for (child in root.neighbors) {
            recursion(child)
            ans!!.add(child.`val`)
        }
    }
}
