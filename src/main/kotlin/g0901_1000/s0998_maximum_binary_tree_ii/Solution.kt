package g0901_1000.s0998_maximum_binary_tree_ii

// #Medium #Tree #Binary_Tree #2023_05_13_Time_157_ms_(100.00%)_Space_35.9_MB_(100.00%)

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
    fun insertIntoMaxTree(root: TreeNode?, `val`: Int): TreeNode? {
        return insertIntoMaxTree2(root, `val`)
    }

    private fun insertIntoMaxTree2(root: TreeNode?, `val`: Int): TreeNode {
        if (root == null) {
            return TreeNode(`val`)
        }
        if (root.`val` < `val`) {
            return TreeNode(`val`, root, null)
        }
        root.right = insertIntoMaxTree2(root.right, `val`)
        return root
    }
}
