package com_github_leetcode

import java.util.LinkedList
import java.util.Queue

class TreeNode {
    var `val`: Int
    var left: TreeNode? = null
    var right: TreeNode? = null

    constructor(`val`: Int) {
        this.`val` = `val`
    }

    constructor(`val`: Int, left: TreeNode?, right: TreeNode?) {
        this.`val` = `val`
        this.left = left
        this.right = right
    }

    override fun toString(): String {
        return if (left == null && right == null) {
            "" + `val`
        } else {
            val root = "" + `val`
            var leftValue = "null"
            var rightValue = "null"
            if (left != null) {
                leftValue = left.toString()
            }
            if (right != null) {
                rightValue = right.toString()
            }
            "$root,$leftValue,$rightValue"
        }
    }

    companion object {
        fun create(treeValues: List<Int?>): TreeNode? {
            val root = if (treeValues.isEmpty()) null else TreeNode(treeValues[0]!!)
            val queue: Queue<TreeNode> = LinkedList()
            queue.offer(root)
            var i = 1
            while (i < treeValues.size) {
                val curr: TreeNode = queue.poll()
                curr.left = if (treeValues[i] == null) null else TreeNode(treeValues[i]!!)
                queue.offer(curr.left)
                if (++i < treeValues.size) {
                    curr.right = if (treeValues[i] == null) null else TreeNode(treeValues[i]!!)
                    queue.offer(curr.right)
                }
                i++
            }
            return root
        }
    }
}
