package g0901_1000.s0938_range_sum_of_bst

// #Easy #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree #Udemy_Tree_Stack_Queue
// #2023_04_29_Time_356_ms_(55.36%)_Space_83.3_MB_(5.36%)

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
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        var ans = 0
        if (root == null) return 0
        if (root.`val` in low..high) {
            ans += root.`val`
        }
        if (root.`val` in low..high) {
            ans += rangeSumBST(root.left, low, high)
            ans += rangeSumBST(root.right, low, high)
        } else if (root.`val` >= low && root.`val` >= high) {
            ans += rangeSumBST(root.left, low, high)
        } else {
            ans += rangeSumBST(root.right, low, high)
        }
        return ans
    }
}
