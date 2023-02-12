package g0601_0700.s0653_two_sum_iv_input_is_a_bst

// #Easy #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Two_Pointers
// #Binary_Search_Tree #Data_Structure_I_Day_14_Tree
// #2023_02_12_Time_231_ms_(96.08%)_Space_37.5_MB_(100.00%)

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
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        if (root == null) {
            return false
        }
        val res: MutableList<Int> = ArrayList()
        inOrder(res, root)
        var i = 0
        var j = res.size - 1
        while (i < j) {
            val val1 = res[i]
            val val2 = res[j]
            if (val1 + val2 == k) {
                return true
            } else if (val1 + val2 < k) {
                i++
            } else {
                j--
            }
        }
        return false
    }

    private fun inOrder(res: MutableList<Int>, root: TreeNode?) {
        if (root == null) {
            return
        }
        inOrder(res, root.left)
        res.add(root.`val`)
        inOrder(res, root.right)
    }
}
