package g0101_0200.s0129_sum_root_to_leaf_numbers

// #Medium #Depth_First_Search #Tree #Binary_Tree #Top_Interview_150_Binary_Tree_General
// #2022_11_25_Time_237_ms_(52.50%)_Space_34.1_MB_(55.00%)

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
    private var sum = 0

    fun sumNumbers(root: TreeNode): Int {
        recurseSum(root, 0)
        return sum
    }

    private fun recurseSum(node: TreeNode, curNum: Int) {
        if (node.left == null && node.right == null) {
            sum += 10 * curNum + node.`val`
        } else {
            if (node.left != null) {
                recurseSum(node.left!!, 10 * curNum + node.`val`)
            }
            if (node.right != null) {
                recurseSum(node.right!!, 10 * curNum + node.`val`)
            }
        }
    }
}
