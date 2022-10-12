package g0101_0200.s0173_binary_search_tree_iterator

// #Medium #Tree #Binary_Tree #Stack #Design #Binary_Search_Tree #Iterator
// #Data_Structure_II_Day_17_Tree #Programming_Skills_II_Day_16 #Level_2_Day_9_Binary_Search_Tree
// #2022_10_12_Time_563_ms_(46.91%)_Space_60.5_MB_(66.67%)

import com_github_leetcode.TreeNode

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class BSTIterator(root: TreeNode?) {
    private var node: TreeNode?

    init {
        node = root
    }

    operator fun next(): Int {
        var res = -1
        while (node != null) {
            if (node!!.left != null) {
                var rightMost: TreeNode? = node!!.left
                while (rightMost!!.right != null) {
                    rightMost = rightMost.right
                }
                rightMost.right = node
                val temp: TreeNode? = node!!.left
                node!!.left = null
                node = temp
            } else {
                res = node!!.`val`
                node = node!!.right
                return res
            }
        }
        return res
    }

    operator fun hasNext(): Boolean {
        return node != null
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * var obj = BSTIterator(root)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */
