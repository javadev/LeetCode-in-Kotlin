package g0101_0200.s0105_construct_binary_tree_from_preorder_and_inorder_traversal

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Tree #Binary_Tree
// #Divide_and_Conquer #Data_Structure_II_Day_15_Tree
// #2022_09_03_Time_370_ms_(58.31%)_Space_37.6_MB_(93.81%)

import com_github_leetcode.TreeNode
import java.util.HashMap

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
    private var j = 0
    private val map: MutableMap<Int, Int> = HashMap()

    fun get(key: Int): Int {
        return map.getValue(key)
    }

    private fun answer(preorder: IntArray, inorder: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end || j > preorder.size) {
            return null
        }
        val value = preorder[j++]
        val index = get(value)
        val node = TreeNode(value)
        node.left = answer(preorder, inorder, start, index - 1)
        node.right = answer(preorder, inorder, index + 1, end)
        return node
    }

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        j = 0
        for (i in preorder.indices) {
            map[inorder[i]] = i
        }
        return answer(preorder, inorder, 0, preorder.size - 1)
    }
}
