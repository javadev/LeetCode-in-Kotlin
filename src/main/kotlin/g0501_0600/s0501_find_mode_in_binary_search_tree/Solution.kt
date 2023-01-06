package g0501_0600.s0501_find_mode_in_binary_search_tree

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
    fun findMode(root: TreeNode?): IntArray {
        var maxOccurTimes = 0
        var prevValue: Int? = null
        var prevOccurTime = 1
        val ans = hashSetOf<Int>()

        fun updateGlobal(currValue: Int) {
            if (currValue == prevValue) {
                prevOccurTime++
                when {
                    prevOccurTime == maxOccurTimes -> ans.add(currValue)
                    prevOccurTime > maxOccurTimes -> {
                        maxOccurTimes = prevOccurTime
                        ans.clear()
                        ans.add(currValue)
                    }
                }
            } else {
                prevOccurTime = 1
                prevValue = currValue
                if (maxOccurTimes <= 1) {
                    ans.add(currValue)
                }
            }
        }

        fun processInOrder(node: TreeNode? = root) {
            if (node != null) {
                node.left?.let { processInOrder(it) }
                updateGlobal(node.`val`)
                node.right?.let { processInOrder(it) }
            }
        }
        processInOrder()

        return ans.toIntArray()
    }
}
