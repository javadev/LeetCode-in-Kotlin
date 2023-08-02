package g1301_1400.s1305_all_elements_in_two_binary_search_trees

// #Medium #Sorting #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2023_06_05_Time_531_ms_(100.00%)_Space_41.3_MB_(88.89%)

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
    fun getAllElements(root1: TreeNode?, root2: TreeNode?): List<Int> {
        val list1 = getAllNodes(root1)
        val list2 = getAllNodes(root2)
        val merged: MutableList<Int> = ArrayList()
        merged.addAll(list1)
        merged.addAll(list2)
        merged.sort()
        return merged
    }

    private fun getAllNodes(root: TreeNode?): List<Int> {
        val list: MutableList<Int> = ArrayList()
        return inorder(root, list)
    }

    private fun inorder(root: TreeNode?, result: MutableList<Int>): List<Int> {
        if (root == null) {
            return result
        }
        inorder(root.left, result)
        result.add(root.`val`)
        return inorder(root.right, result)
    }
}
