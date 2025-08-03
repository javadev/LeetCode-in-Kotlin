package g0101_0200.s0133_clone_graph

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Graph #Udemy_Graph
// #Top_Interview_150_Graph_General #2025_08_03_Time_133_ms_(88.96%)_Space_43.11_MB_(67.94%)

import com_github_leetcode.Node

class Solution {
    fun cloneGraph(node: Node?): Node? {
        return cloneGraph(node, HashMap())
    }

    private fun cloneGraph(node: Node?, processedNodes: MutableMap<Node?, Node?>): Node? {
        if (node == null) {
            return null
        } else if (processedNodes[node] != null) {
            return processedNodes[node]
        }
        val newNode = Node(0)
        processedNodes.put(node, newNode)
        newNode.`val` = node.`val`
        newNode.neighbors = ArrayList()
        for (neighbor in node.neighbors) {
            val clonedNeighbor = cloneGraph(neighbor, processedNodes)
            if (clonedNeighbor != null) {
                (newNode.neighbors as ArrayList).add(clonedNeighbor)
            }
        }
        return newNode
    }
}
