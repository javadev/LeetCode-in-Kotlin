package g0901_1000.s0971_flip_binary_tree_to_match_preorder_traversal

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_05_06_Time_173_ms_(66.67%)_Space_35.9_MB_(100.00%)

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
    private val list: MutableList<Int> = ArrayList()
    private var preIndex = 0
    private var isFlipPossible = true
    fun flipMatchVoyage(root: TreeNode?, voyage: IntArray): List<Int> {
        list.clear()
        preIndex = 0
        isFlipPossible = true
        traverse(root, voyage)
        if (!isFlipPossible) {
            list.clear()
            list.add(-1)
        }
        return list
    }

    private fun traverse(root: TreeNode?, voyage: IntArray) {
        if (root == null) {
            return
        }
        if (root.`val` != voyage[preIndex]) {
            isFlipPossible = false
        } else {
            if (preIndex + 1 < voyage.size && root.left != null && root.left!!.`val` != voyage[preIndex + 1]) {
                // swap
                list.add(root.`val`)
                val temp = root.right
                root.right = root.left
                root.left = temp
            }
            preIndex++
            traverse(root.left, voyage)
            traverse(root.right, voyage)
        }
    }
}
