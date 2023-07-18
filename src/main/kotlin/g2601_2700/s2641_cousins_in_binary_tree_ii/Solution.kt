package g2601_2700.s2641_cousins_in_binary_tree_ii

// #Medium #Hash_Table #Tree #Binary_Tree #Depth_First_Search #Breadth_First_Search
// #2023_07_18_Time_922_ms_(90.91%)_Space_67.3_MB_(36.36%)

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
    private var horizontalSum: MutableList<Int?>? = null
    private fun traverse(root: TreeNode?, depth: Int) {
        if (root == null) {
            return
        }
        if (depth < horizontalSum!!.size) {
            horizontalSum!![depth] = horizontalSum!![depth]!! + root.`val`
        } else {
            horizontalSum!!.add(root.`val`)
        }
        traverse(root.left, depth + 1)
        traverse(root.right, depth + 1)
    }

    private fun traverse1(root: TreeNode?, depth: Int) {
        if (root == null) {
            return
        }
        if (depth > 0) {
            var sum = 0
            if (root.left != null) {
                sum += root.left!!.`val`
            }
            if (root.right != null) {
                sum += root.right!!.`val`
            }
            if (root.left != null) {
                root.left!!.`val` = horizontalSum!![depth + 1]!! - sum
            }
            if (root.right != null) {
                root.right!!.`val` = horizontalSum!![depth + 1]!! - sum
            }
        }
        traverse1(root.left, depth + 1)
        traverse1(root.right, depth + 1)
    }

    fun replaceValueInTree(root: TreeNode?): TreeNode {
        horizontalSum = ArrayList()
        root!!.`val` = 0
        if (root.left != null) {
            root.left!!.`val` = 0
        }
        if (root.right != null) {
            root.right!!.`val` = 0
        }
        traverse(root, 0)
        traverse1(root, 0)
        return root
    }
}
