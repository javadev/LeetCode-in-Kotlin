package g2001_2100.s2096_step_by_step_directions_from_a_binary_tree_node_to_another

// #Medium #String #Depth_First_Search #Tree #Binary_Tree
// #2023_06_28_Time_690_ms_(93.33%)_Space_95.9_MB_(66.67%)

import com_github_leetcode.TreeNode

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
    private fun find(n: TreeNode?, `val`: Int, sb: StringBuilder): Boolean {
        if (n!!.`val` == `val`) {
            return true
        }
        if (n.left != null && find(n.left, `val`, sb)) {
            sb.append("L")
        } else if (n.right != null && find(n.right, `val`, sb)) {
            sb.append("R")
        }
        return sb.isNotEmpty()
    }

    fun getDirections(root: TreeNode?, startValue: Int, destValue: Int): String {
        val s = StringBuilder()
        val d = StringBuilder()
        find(root, startValue, s)
        find(root, destValue, d)
        var i = 0
        val maxI = d.length.coerceAtMost(s.length)
        while (i < maxI && s[s.length - i - 1] == d[d.length - i - 1]) {
            ++i
        }
        val result = StringBuilder()
        for (j in 0 until s.length - i) {
            result.append("U")
        }
        result.append(d.reverse().substring(i))
        return result.toString()
    }
}
