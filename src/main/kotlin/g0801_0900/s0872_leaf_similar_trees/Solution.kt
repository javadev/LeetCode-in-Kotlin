package g0801_0900.s0872_leaf_similar_trees

// #Easy #Depth_First_Search #Tree #Binary_Tree #LeetCode_75_Binary_Tree/DFS
// #2023_04_08_Time_140_ms_(100.00%)_Space_33.9_MB_(64.29%)

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
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val list1: MutableList<Int> = ArrayList()
        val list2: MutableList<Int> = ArrayList()
        preOrder(root1, list1)
        preOrder(root2, list2)
        // compare the lists
        if (list1.size != list2.size) {
            return false
        }
        for (i in list1.indices) {
            if (list1[i] != list2[i]) {
                return false
            }
        }
        return true
    }

    private fun preOrder(root: TreeNode?, list: MutableList<Int>) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                list.add(root.`val`)
            }
            preOrder(root.left, list)
            preOrder(root.right, list)
        }
    }
}
