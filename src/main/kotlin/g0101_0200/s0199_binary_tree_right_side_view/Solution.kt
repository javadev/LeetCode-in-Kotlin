package g0101_0200.s0199_binary_tree_right_side_view

// #Medium #Top_100_Liked_Questions #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Data_Structure_II_Day_16_Tree #Level_2_Day_15_Tree #Top_Interview_150_Binary_Tree_BFS
// #2022_09_09_Time_194_ms_(92.89%)_Space_35.4_MB_(67.89%)

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
    fun rightSideView(root: TreeNode?): List<Int> {
        val list: MutableList<Int> = ArrayList()
        recurse(root, 0, list)
        return list
    }

    private fun recurse(node: TreeNode?, level: Int, list: MutableList<Int>) {
        if (node != null) {
            if (list.size < level + 1) {
                list.add(node.`val`)
            }
            recurse(node.right, level + 1, list)
            recurse(node.left, level + 1, list)
        }
    }
}
