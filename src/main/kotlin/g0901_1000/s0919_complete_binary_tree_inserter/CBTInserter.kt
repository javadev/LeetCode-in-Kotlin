package g0901_1000.s0919_complete_binary_tree_inserter

// #Medium #Breadth_First_Search #Tree #Binary_Tree #Design
// #2023_04_16_Time_225_ms_(100.00%)_Space_37_MB_(100.00%)

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
class CBTInserter(root: TreeNode?) {
    private val q: Queue<TreeNode>
    private val head: TreeNode

    init {
        q = LinkedList()
        head = root!!
        addToQueue()
    }

    private fun addToQueue() {
        val hlq: Queue<TreeNode> = LinkedList()
        hlq.add(head)
        while (!hlq.isEmpty()) {
            var size = hlq.size
            while (size-- > 0) {
                val poll: TreeNode = hlq.poll()
                q.add(poll)
                if (poll.left != null) {
                    hlq.add(poll.left)
                }
                if (poll.right != null) {
                    hlq.add(poll.right)
                }
            }
        }
    }

    fun insert(`val`: Int): Int {
        val nn = TreeNode(`val`)
        deleteFullNode()
        val peek: TreeNode = q.peek()
        if (peek.left == null) {
            peek.left = nn
        } else {
            peek.right = nn
        }
        q.add(nn)
        return peek.`val`
    }

    private fun deleteFullNode() {
        while (!q.isEmpty()) {
            val peek: TreeNode = q.peek()
            if (peek.left != null && peek.right != null) {
                q.poll()
            } else {
                break
            }
        }
    }

    // get_root()
    fun get_root(): TreeNode {
        return head
    }
}

/*
 * Your CBTInserter object will be instantiated and called as such:
 * var obj = CBTInserter(root)
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.get_root()
 */
