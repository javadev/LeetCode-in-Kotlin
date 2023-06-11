package g1501_1600.s1514_path_with_maximum_probability

import java.util.*

// #Medium #Heap_Priority_Queue #Graph #Shortest_Path
class Solution {
    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start: Int, end: Int): Double {
        val nodeToNodesList: Array<MutableList<*>?> = arrayOfNulls<MutableList<*>>(n)
        val nodeToProbabilitiesList: Array<MutableList<*>?> = arrayOfNulls<MutableList<*>>(n)
        for (i in 0 until n) {
            nodeToNodesList[i] = ArrayList()
            nodeToProbabilitiesList[i] = ArrayList()
        }
        for (i in edges.indices) {
            val u = edges[i][0]
            val v = edges[i][1]
            val w = succProb[i]
            nodeToNodesList[u].add(v)
            nodeToProbabilitiesList[u].add(w)
            nodeToNodesList[v].add(u)
            nodeToProbabilitiesList[v].add(w)
        }
        val probabilities = DoubleArray(n)
        probabilities[start] = 1.0
        val visited = BooleanArray(n)
        val queue: Queue<Int> = ArrayDeque()
        queue.add(start)
        visited[start] = true
        while (!queue.isEmpty()) {
            val u = queue.poll()
            visited[u] = false
            for (i in nodeToNodesList[u].indices) {
                val v = nodeToNodesList[u][i]
                val w = nodeToProbabilitiesList[u][i]
                if (probabilities[u] * w > probabilities[v]) {
                    probabilities[v] = probabilities[u] * w
                    if (!visited[v]) {
                        visited[v] = true
                        queue.add(v)
                    }
                }
            }
        }
        return probabilities[end]
    }
}
