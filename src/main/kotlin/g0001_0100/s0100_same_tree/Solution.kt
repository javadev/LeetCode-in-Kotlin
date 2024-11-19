package g0001_0100.s0100_same_tree

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Level_2_Day_15_Tree
// #Udemy_Tree_Stack_Queue #2023_07_10_Time_134_ms_(86.63%)_Space_33.8_MB_(48.19%)

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
    private fun trav(n: TreeNode?, m: TreeNode?): Boolean {
        return if (n != null && m != null) {
            if (n.`val` != m.`val`) {
                false
            } else {
                trav(n.left, m.left) && trav(n.right, m.right)
            }
        } else {
            n == null && m == null
        }
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        } else if (p == null || q == null) {
            return false
        }
        return trav(p, q)
    }
}
