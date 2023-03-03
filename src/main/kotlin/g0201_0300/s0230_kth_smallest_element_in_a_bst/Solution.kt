package g0201_0300.s0230_kth_smallest_element_in_a_bst

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #Binary_Search_Tree #Data_Structure_II_Day_17_Tree #Level_2_Day_9_Binary_Search_Tree
// #2022_09_10_Time_393_ms_(33.33%)_Space_41.8_MB_(66.67%)

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
    private var k = 0
    private var count = 0
    private var `val` = 0
    fun kthSmallest(root: TreeNode, k: Int): Int {
        this.k = k
        calculate(root)
        return `val`
    }

    private fun calculate(node: TreeNode) {
        if (node.left == null && node.right == null) {
            count++
            if (count == k) {
                `val` = node.`val`
            }
            return
        }
        if (node.left != null) {
            calculate(node.left!!)
        }
        count++
        if (count == k) {
            `val` = node.`val`
            return
        }
        if (node.right != null) {
            calculate(node.right!!)
        }
    }
}
