package g0801_0900.s0897_increasing_order_search_tree

// #Easy #Depth_First_Search #Tree #Binary_Tree #Stack #Binary_Search_Tree
// #2023_04_12_Time_128_ms_(85.71%)_Space_34_MB_(14.29%)

import com_github_leetcode.TreeNode
import java.util.LinkedList

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
    fun increasingBST(root: TreeNode?): TreeNode {
        val list: MutableList<TreeNode> = LinkedList<TreeNode>()
        traverse(root, list)
        for (i in 1 until list.size) {
            list[i - 1].right = list[i]
            list[i].left = null
        }
        return list[0]
    }

    private fun traverse(root: TreeNode?, list: MutableList<TreeNode>) {
        if (root != null) {
            traverse(root.left, list)
            list.add(root)
            traverse(root.right, list)
        }
    }
}
