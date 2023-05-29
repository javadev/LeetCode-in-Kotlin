package g1101_1200.s1110_delete_nodes_and_return_forest

import com_github_leetcode.TreeNode
import java.util.Queue
import java.util.LinkedList

// #Medium #Depth_First_Search #Tree #Binary_Tree

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
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