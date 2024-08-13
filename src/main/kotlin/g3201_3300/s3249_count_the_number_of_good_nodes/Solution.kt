package g3201_3300.s3249_count_the_number_of_good_nodes

// #Medium #Depth_First_Search #Tree #2024_08_13_Time_1190_ms_(100.00%)_Space_127.6_MB_(77.27%)

class Solution {
    private var count = 0

    fun countGoodNodes(edges: Array<IntArray>): Int {
        val n = edges.size + 1
        val nodes = arrayOfNulls<TNode>(n)
        nodes[0] = TNode()
        for (edge in edges) {
            val a = edge[0]
            val b = edge[1]
            if (nodes[b] != null && nodes[a] == null) {
                nodes[a] = TNode()
                nodes[b]!!.children.add(nodes[a])
            } else {
                if (nodes[a] == null) {
                    nodes[a] = TNode()
                }
                if (nodes[b] == null) {
                    nodes[b] = TNode()
                }
                nodes[a]!!.children.add(nodes[b])
            }
        }
        sizeOfTree(nodes[0])
        return count
    }

    private fun sizeOfTree(node: TNode?): Int {
        if (node!!.size > 0) {
            return node.size
        }
        val children: List<TNode?> = node.children
        if (children.isEmpty()) {
            count++
            node.size = 1
            return 1
        }
        val size = sizeOfTree(children[0])
        var sum = size
        var goodNode = true
        for (i in 1 until children.size) {
            val child = children[i]
            if (size != sizeOfTree(child)) {
                goodNode = false
            }
            sum += sizeOfTree(child)
        }
        if (goodNode) {
            count++
        }
        sum++
        node.size = sum
        return sum
    }

    private class TNode {
        var size: Int = -1
        var children: MutableList<TNode?> = ArrayList()
    }
}
