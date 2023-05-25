package g1101_1200.s1161_maximum_level_sum_of_a_binary_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_05_25_Time_445_ms_(87.50%)_Space_97.1_MB_(75.00%)

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
    private var sums: MutableList<Int>? = null

    fun maxLevelSum(root: TreeNode?): Int {
        sums = ArrayList()
        find(root, 1)
        var ans = 1
        var maxv = Int.MIN_VALUE
        for (i in (sums as ArrayList<Int>).indices) {
            if ((sums as ArrayList<Int>).get(i) > maxv) {
                maxv = (sums as ArrayList<Int>).get(i)
                ans = i + 1
            }
        }
        return ans
    }

    private fun find(root: TreeNode?, height: Int) {
        if (root == null) {
            return
        }
        if (sums!!.size < height) {
            sums!!.add(root.`val`)
        } else {
            sums!![height - 1] = sums!![height - 1] + root.`val`
        }
        find(root.left, height + 1)
        find(root.right, height + 1)
    }
}
