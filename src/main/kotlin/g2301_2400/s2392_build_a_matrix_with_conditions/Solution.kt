package g2301_2400.s2392_build_a_matrix_with_conditions

import java.util.LinkedList
import java.util.Queue

// #Hard #Array #Matrix #Graph #Topological_Sort
class Solution {
    // Using topological sort to solve this problem
    fun buildMatrix(k: Int, rowC: Array<IntArray>, colC: Array<IntArray>): Array<IntArray> {
        // First, get the topo-sorted of row and col
        val row = toposort(k, rowC)
        val col = toposort(k, colC)
        // base case: when the length of row or col is less than k, return empty.
        // That is: there is a loop in established graph
        if (row.size < k || col.size < k) {
            return Array(0) { IntArray(0) }
        }
        val res = Array(k) { IntArray(k) }
        val map: MutableMap<Int, Int> = HashMap()
        for (i in 0 until k) {
            // we record the number corresbonding to each column:
            // [number, column index]
            map[col[i]] = i
        }
        // col: 3 2 1
        // row: 1 3 2
        for (i in 0 until k) {
            // For each row: we have number row.get(i). And we need to know
            // which column we need to assign, which is from map.get(row.get(i))
            // known by map.get()
            res[i][map[row[i]]!!] = row[i]
        }
        return res
    }

    private fun toposort(k: Int, matrix: Array<IntArray>): List<Int> {
        // need a int[] to record the indegree of each number [1, k]
        val deg = IntArray(k + 1)
        // need a list to record the order of each number, then return this list
        val res: MutableList<Int> = ArrayList()
        // need a 2-D list to be the graph, and fill the graph
        val graph: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until k) {
            graph.add(ArrayList())
        }
        // need a queue to do the BFS
        val queue: Queue<Int> = LinkedList()
        // First, we need to establish the graph, following the given matrix
        for (a in matrix) {
            val from = a[0]
            val to = a[1]
            graph[from - 1].add(to)
            deg[to]++
        }
        // Second, after building a graph, we start the bfs,
        // that is, traverse the node with 0 degree
        for (i in 1..k) {
            if (deg[i] == 0) {
                queue.offer(i)
                res.add(i)
            }
        }
        // Third, start the topo sort
        while (!queue.isEmpty()) {
            val node = queue.poll()
            val list: List<Int> = graph[node - 1]
            for (i in list) {
                if (--deg[i] == 0) {
                    queue.offer(i)
                    res.add(i)
                }
            }
        }
        return res
    }
}
