package g1001_1100.s1022_sum_of_root_to_leaf_binary_numbers

// #Easy #Depth_First_Search #Tree #Binary_Tree
// #2023_05_22_Time_158_ms_(88.89%)_Space_36.3_MB_(11.11%)

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
    fun sumRootToLeaf(root: TreeNode?): Int {
        val paths: MutableList<List<Int>> = ArrayList()
        dfs(root, paths, ArrayList())
        var sum = 0
        for (list in paths) {
            var num = 0
            for (i in list) {
                num = (num shl 1) + i
            }
            sum += num
        }
        return sum
    }

    private fun dfs(root: TreeNode?, paths: MutableList<List<Int>>, path: MutableList<Int>) {
        path.add(root!!.`val`)
        if (root.left != null) {
            dfs(root.left!!, paths, path)
            path.removeAt(path.size - 1)
        }
        if (root.right != null) {
            dfs(root.right!!, paths, path)
            path.removeAt(path.size - 1)
        }
        if (root.left == null && root.right == null) {
            paths.add(ArrayList(path))
        }
    }
}
