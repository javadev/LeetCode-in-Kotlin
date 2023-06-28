package com_github_leetcode

import java.util.LinkedList
import java.util.Queue

object TreeUtils {
    /*
    * This method is to construct a normal binary tree. The input reads like
    * this for [5, 3, 6, 2, 4, null, null, 1], i.e. preorder:
                   5
                 /   \
                3     6
               / \    / \
              2   4  #   #
             /
            1
    */
    fun constructBinaryTree(treeValues: List<Int?>): TreeNode {
        val root = TreeNode(treeValues[0]!!)
        val queue: Queue<TreeNode?> = LinkedList()
        queue.offer(root)
        var i = 1
        while (i < treeValues.size) {
            val curr = queue.poll()
            if (treeValues[i] != null) {
                curr!!.left = TreeNode(treeValues[i]!!)
                queue.offer(curr.left)
            }
            if (++i < treeValues.size && treeValues[i] != null) {
                curr!!.right = TreeNode(treeValues[i]!!)
                queue.offer(curr.right)
            }
            i++
        }
        return root
    }
}
