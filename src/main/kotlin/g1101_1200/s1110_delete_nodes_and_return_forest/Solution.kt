package g1101_1200.s1110_delete_nodes_and_return_forest

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_05_31_Time_223_ms_(100.00%)_Space_43.4_MB_(80.00%)

import com_github_leetcode.TreeNode
import java.util.LinkedList
import java.util.Queue

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
    private var toDelete: MutableSet<Int> = mutableSetOf()
    private val nodes: Queue<TreeNode?> = LinkedList()

    private fun deleteAndSplit(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        if (toDelete.contains(root.`val`)) {
            if (root.left != null) {
                nodes.add(root.left)
            }
            if (root.right != null) {
                nodes.add(root.right)
            }
            return null
        }
        root.left = deleteAndSplit(root.left)
        root.right = deleteAndSplit(root.right)
        return root
    }

    fun delNodes(root: TreeNode?, localToDelete: IntArray): List<TreeNode> {
        toDelete = HashSet()
        for (node in localToDelete) {
            toDelete.add(node)
        }
        nodes.add(root)
        val forests: MutableList<TreeNode> = ArrayList()
        while (!nodes.isEmpty()) {
            var node = nodes.poll()
            node = deleteAndSplit(node)
            if (node != null) {
                forests.add(node)
            }
        }
        return forests
    }
}
