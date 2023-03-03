package g0601_0700.s0655_print_binary_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_02_13_Time_176_ms_(100.00%)_Space_36_MB_(80.00%)

import com_github_leetcode.TreeNode
import java.util.LinkedList
import kotlin.math.pow

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
    fun printTree(root: TreeNode?): List<MutableList<String>> {
        val result: MutableList<MutableList<String>> = LinkedList()
        val height = if (root == null) 1 else getHeight(root)
        val columns = (2.0.pow(height.toDouble()) - 1).toInt()
        val row: MutableList<String> = ArrayList()
        for (i in 0 until columns) {
            row.add("")
        }
        for (i in 0 until height) {
            result.add(ArrayList(row))
        }
        populateResult(root, result, 0, height, 0, columns - 1)
        return result
    }

    private fun populateResult(
        root: TreeNode?,
        result: List<MutableList<String>>,
        row: Int,
        totalRows: Int,
        i: Int,
        j: Int
    ) {
        if (row == totalRows || root == null) {
            return
        }
        result[row][(i + j) / 2] = root.`val`.toString()
        populateResult(root.left, result, row + 1, totalRows, i, (i + j) / 2 - 1)
        populateResult(root.right, result, row + 1, totalRows, (i + j) / 2 + 1, j)
    }

    private fun getHeight(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else 1 + getHeight(root.left).coerceAtLeast(getHeight(root.right))
    }
}
