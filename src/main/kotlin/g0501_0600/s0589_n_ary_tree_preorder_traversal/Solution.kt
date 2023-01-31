package g0501_0600.s0589_n_ary_tree_preorder_traversal

// #Easy #Depth_First_Search #Tree #Stack #Programming_Skills_I_Day_5_Function #Level_1_Day_6_Tree
// #2023_01_31_Time_233_ms_(84.02%)_Space_39.3_MB_(37.63%)

import com_github_leetcode.Node

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun preorder(root: Node?): List<Int> {
        val res: MutableList<Int> = ArrayList()
        preorderHelper(res, root)
        return res
    }

    private fun preorderHelper(res: MutableList<Int>, root: Node?) {
        if (root == null) {
            return
        }
        res.add(root.`val`)
        for (node in root.neighbors) {
            preorderHelper(res, node)
        }
    }
}
