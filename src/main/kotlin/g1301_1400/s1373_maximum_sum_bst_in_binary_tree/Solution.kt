package g1301_1400.s1373_maximum_sum_bst_in_binary_tree

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2023_06_06_Time_451_ms_(100.00%)_Space_54.3_MB_(100.00%)

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
    fun maxSumBST(root: TreeNode?): Int {
        val temp = checkBST(root)
        return Math.max(temp.maxSum, 0)
    }

    private class IsBST {
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        var isBst = true
        var sum = 0
        var maxSum = Int.MIN_VALUE
    }

    private fun checkBST(root: TreeNode?): IsBST {
        if (root == null) {
            return IsBST()
        }
        val lp = checkBST(root.left)
        val rp = checkBST(root.right)
        val mp = IsBST()
        mp.max = Math.max(root.`val`, Math.max(lp.max, rp.max))
        mp.min = Math.min(root.`val`, Math.min(lp.min, rp.min))
        mp.sum = lp.sum + rp.sum + root.`val`
        val check = root.`val` > lp.max && root.`val` < rp.min
        if (lp.isBst && rp.isBst && check) {
            mp.isBst = true
            val tempMax = Math.max(mp.sum, Math.max(lp.sum, rp.sum))
            mp.maxSum = Math.max(tempMax, Math.max(lp.maxSum, rp.maxSum))
        } else {
            mp.isBst = false
            mp.maxSum = Math.max(lp.maxSum, rp.maxSum)
        }
        return mp
    }
}
