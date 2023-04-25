package g0201_0300.s0257_binary_tree_paths

// #Easy #String #Depth_First_Search #Tree #Binary_Tree #Backtracking
// #2022_11_01_Time_320_ms_(72.84%)_Space_36.1_MB_(66.67%)

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
    private var result: MutableList<String>? = null
    private var sb: StringBuilder? = null
    fun binaryTreePaths(root: TreeNode?): List<String> {
        result = ArrayList()
        if (root == null) {
            return result as ArrayList<String>
        }
        sb = StringBuilder()
        walkThrough(root)
        return result as ArrayList<String>
    }

    private fun walkThrough(root: TreeNode?) {
        assert(root != null)
        var length = sb!!.length
        sb!!.append(root!!.`val`)
        length = sb!!.length - length
        if (root.left == null && root.right == null) {
            // leaf node.
            result!!.add(sb.toString())
            sb!!.delete(sb!!.length - length, sb!!.length)
            return
        }
        sb!!.append("->")
        length += 2
        if (root.left != null) {
            walkThrough(root.left)
        }
        if (root.right != null) {
            walkThrough(root.right)
        }
        sb!!.delete(sb!!.length - length, sb!!.length)
    }
}
