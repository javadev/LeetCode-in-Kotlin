package g0101_0200.s0129_sum_root_to_leaf_numbers

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_10_08_Time_269_ms_(29.63%)_Space_33.9_MB_(90.74%)

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
