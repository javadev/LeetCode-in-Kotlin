package g2401_2500.s2497_maximum_star_sum_of_a_graph

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Graph
// #2023_07_05_Time_773_ms_(100.00%)_Space_94.6_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    private lateinit var graphNodeIdToNodeValues: Array<PriorityQueue<Int>?>
    fun maxStarSum(nodeValues: IntArray, edges: Array<IntArray>, maxNumberOfEdges: Int): Int {
        val totalNodes = nodeValues.size
        graphNodeIdToNodeValues = arrayOfNulls(totalNodes)
        for (i in 0 until totalNodes) {
            graphNodeIdToNodeValues[i] = PriorityQueue()
        }
        for (edge in edges) {
            addEdgeEndingWithValueOfNode(nodeValues, edge[0], edge[1], maxNumberOfEdges)
            addEdgeEndingWithValueOfNode(nodeValues, edge[1], edge[0], maxNumberOfEdges)
        }
        return calculateMaxStarSum(nodeValues, totalNodes)
    }

    private fun addEdgeEndingWithValueOfNode(
        nodeValues: IntArray, fromNode: Int, toNode: Int, maxNumberOfEdges: Int
    ) {
        if (nodeValues[toNode] > 0 && graphNodeIdToNodeValues[fromNode]!!.size < maxNumberOfEdges) {
            graphNodeIdToNodeValues[fromNode]!!.add(nodeValues[toNode])
        } else if (!graphNodeIdToNodeValues[fromNode]!!.isEmpty()
            && graphNodeIdToNodeValues[fromNode]!!.peek() < nodeValues[toNode]
        ) {
            graphNodeIdToNodeValues[fromNode]!!.poll()
            graphNodeIdToNodeValues[fromNode]!!.add(nodeValues[toNode])
        }
    }

    private fun calculateMaxStarSum(nodeValues: IntArray, totalNodes: Int): Int {
        var maxStarSum = Int.MIN_VALUE
        for (i in 0 until totalNodes) {
            var sum = nodeValues[i]
            for (value in graphNodeIdToNodeValues[i]!!) {
                sum += value
            }
            maxStarSum = Math.max(maxStarSum, sum)
        }
        return maxStarSum
    }
}
