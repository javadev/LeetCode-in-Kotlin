package g1501_1600.s1514_path_with_maximum_probability

// #Medium #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_06_12_Time_681_ms_(100.00%)_Space_67.5_MB_(62.50%)

import java.util.ArrayDeque
import java.util.Queue

class Solution {
    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start: Int, end: Int): Double {
        val nodeToNodesList: Array<MutableList<Int>?> = arrayOfNulls(n)
        val nodeToProbabilitiesList: Array<MutableList<Double>?> = arrayOfNulls(n)
        for (i in 0 until n) {
            nodeToNodesList[i] = mutableListOf()
            nodeToProbabilitiesList[i] = ArrayList()
        }
        for (i in edges.indices) {
            val u = edges[i][0]
            val v = edges[i][1]
            val w = succProb[i]
            nodeToNodesList[u]?.add(v)
            nodeToProbabilitiesList[u]?.add(w)
            nodeToNodesList[v]?.add(u)
            nodeToProbabilitiesList[v]?.add(w)
        }
        val probabilities = DoubleArray(n)
        probabilities[start] = 1.0
        val visited = BooleanArray(n)
        val queue: Queue<Int> = ArrayDeque()
        queue.add(start)
        visited[start] = true
        while (queue.isNotEmpty()) {
            val u = queue.poll()
            visited[u] = false
            for (i in nodeToNodesList[u]?.indices!!) {
                val v = nodeToNodesList[u]?.get(i)
                val w = nodeToProbabilitiesList[u]?.get(i)
                if (probabilities[u] * w!! > probabilities[v!!]) {
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
