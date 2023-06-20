package g1901_2000.s1932_merge_bsts_to_create_single_bst

// #Hard #Hash_Table #Depth_First_Search #Tree #Binary_Search #Binary_Tree
// #2023_06_20_Time_1146_ms_(100.00%)_Space_84.5_MB_(100.00%)

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
    fun canMerge(trees: List<TreeNode>): TreeNode? {
        val valToNode: MutableMap<Int, TreeNode> = HashMap()
        val count: MutableMap<Int, Int> = HashMap()
        for (tree in trees) {
            valToNode[tree.`val`] = tree
            count.merge(
                tree.`val`, 1
            ) { a: Int?, b: Int? ->
                Integer.sum(
                    a!!, b!!
                )
            }
            if (tree.left != null) count.merge(
                tree.left!!.`val`, 1
            ) { a: Int?, b: Int? ->
                Integer.sum(
                    a!!, b!!
                )
            }
            if (tree.right != null) count.merge(
                tree.right!!.`val`, 1
            ) { a: Int?, b: Int? ->
                Integer.sum(
                    a!!, b!!
                )
            }
        }
        for (tree in trees) if (count[tree.`val`] == 1) {
            return if (isValidBST(tree, null, null, valToNode)
                && valToNode.size <= 1) tree else null
        }
        return null
    }

    fun isValidBST(
        tree: TreeNode?, minNode: TreeNode?, maxNode: TreeNode?,
        valToNode: MutableMap<Int, TreeNode>
    ): Boolean {
        if (tree == null) return true
        if (minNode != null && tree.`val` <= minNode.`val`) return false
        if (maxNode != null && tree.`val` >= maxNode.`val`) return false
        if (tree.left == null && tree.right == null && valToNode.containsKey(tree.`val`)) {
            val `val` = tree.`val`
            tree.left = valToNode[`val`]!!.left
            tree.right = valToNode[`val`]!!.right
            valToNode.remove(`val`)
        }
        return isValidBST(tree.left, minNode, tree, valToNode) &&
                isValidBST(tree.right, tree, maxNode, valToNode)
    }
}
