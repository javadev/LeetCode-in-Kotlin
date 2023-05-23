package g1001_1100.s1028_recover_a_tree_from_preorder_traversal

// #Hard #String #Depth_First_Search #Tree #Binary_Tree
// #2023_05_23_Time_246_ms_(100.00%)_Space_49.3_MB_(100.00%)

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
    private var ptr = 0
    fun recoverFromPreorder(traversal: String): TreeNode? {
        return find(traversal, 0)
    }

    private fun find(traversal: String, level: Int): TreeNode? {
        if (ptr == traversal.length) {
            return null
        }
        var i = ptr
        var count = 0
        while (traversal[i] == '-') {
            count++
            i++
        }
        return if (count == level) {
            val start = i
            while (i < traversal.length && traversal[i] != '-') {
                i++
            }
            val `val` = traversal.substring(start, i).toInt()
            ptr = i
            val root = TreeNode(`val`)
            root.left = find(traversal, level + 1)
            root.right = find(traversal, level + 1)
            root
        } else {
            null
        }
    }
}
