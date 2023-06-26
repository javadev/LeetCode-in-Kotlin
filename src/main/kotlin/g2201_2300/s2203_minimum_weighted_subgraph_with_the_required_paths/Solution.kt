package g2201_2300.s2203_minimum_weighted_subgraph_with_the_required_paths

import java.util.PriorityQueue
import java.util.Queue

// #Hard #Graph #Shortest_Path
class Solution {
    fun minimumWeight(n: Int, edges: Array<IntArray>, src1: Int, src2: Int, dest: Int): Long {
        val graph: Array<MutableList<IntArray>?> = arrayOfNulls(n)
        val weight = Array(3) { LongArray(n) }
        for (i in 0 until n) {
            for (j in 0..2) {
                weight[j][i] = Long.MAX_VALUE
            }
            graph[i] = ArrayList()
        }
        for (e in edges) {
            graph[e[0]]?.add(intArrayOf(e[1], e[2]))
        }
        val queue: Queue<Node> = PriorityQueue(Comparator.comparingLong { node: Node -> node.weight })
        queue.offer(Node(0, src1, 0))
        weight[0][src1] = 0
        queue.offer(Node(1, src2, 0))
        weight[1][src2] = 0
        while (!queue.isEmpty()) {
            val curr = queue.poll()
            if (curr.vertex == dest && curr.index == 2) {
                return curr.weight
            }
            for (next in graph[curr.vertex]!!) {
                if (curr.index == 2 && weight[curr.index][next[0]] > curr.weight + next[1]) {
                    weight[curr.index][next[0]] = curr.weight + next[1]
                    queue.offer(Node(curr.index, next[0], weight[curr.index][next[0]]))
                } else if (weight[curr.index][next[0]] > curr.weight + next[1]) {
                    weight[curr.index][next[0]] = curr.weight + next[1]
                    queue.offer(Node(curr.index, next[0], weight[curr.index][next[0]]))
                    if (weight[curr.index xor 1][next[0]] != Long.MAX_VALUE &&
                        weight[curr.index][next[0]] + weight[curr.index xor 1][next[0]]
                        < weight[2][next[0]]
                    ) {
                        weight[2][next[0]] = weight[curr.index][next[0]] + weight[curr.index xor 1][next[0]]
                        queue.offer(Node(2, next[0], weight[2][next[0]]))
                    }
                }
            }
        }
        return -1
    }

    private class Node(var index: Int, var vertex: Int, var weight: Long)
}
