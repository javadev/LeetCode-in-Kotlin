package g2201_2300.s2236_root_equals_sum_of_children

// #Easy #Tree #Binary_Tree #2023_06_27_Time_141_ms_(86.73%)_Space_33.9_MB_(64.29%)

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
    fun checkTree(root: TreeNode): Boolean {
        return root.left!!.`val` + root.right!!.`val` == root.`val`
    }
}
