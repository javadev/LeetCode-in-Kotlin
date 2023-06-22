package g2001_2100.s2049_count_nodes_with_the_highest_score

// #Medium #Array #Depth_First_Search #Tree #Binary_Tree
class Solution {
    internal class Node {
        var left: Node? = null
        var right: Node? = null
    }

    private var size = 0
    private var max: Long = 0
    private var freq = 0
    private fun postOrder(root: Node?): Long {
        if (root == null) {
            return 0
        }
        val left = postOrder(root.left)
        val right = postOrder(root.right)
        val `val` = Math.max(1, left) * Math.max(1, right) * Math.max(size - left - right - 1, 1)
        if (`val` > max) {
            max = `val`
            freq = 1
        } else if (`val` == max) {
            freq += 1
        }
        return left + right + 1
    }

    fun countHighestScoreNodes(parents: IntArray): Int {
        size = parents.size
        val nodes = arrayOfNulls<Node>(size)
        for (i in 0 until size) {
            nodes[i] = Node()
        }
        var root: Node? = null
        for (i in 0 until size) {
            if (parents[i] != -1) {
                val node = nodes[parents[i]]
                if (node!!.left == null) {
                    node.left = nodes[i]
                } else {
                    node.right = nodes[i]
                }
            } else {
                root = nodes[i]
            }
        }
        postOrder(root)
        return freq
    }
}
