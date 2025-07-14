package g3601_3700.s3615_longest_palindromic_path_in_graph

// #Hard #String #Dynamic_Programming #Bit_Manipulation #Graph
// #2025_07_14_Time_635_ms_(100.00%)_Space_96.67_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxLen(n: Int, edges: Array<IntArray>, labelsStr: String): Int {
        val labels = labelsStr.toCharArray()
        // collect lists of adjacent nodes
        val adj = adj(n, edges)
        // size of int to store n bits bitmask
        val bSize = 1 shl n
        val cache = Array<Array<IntArray>>(n) { Array<IntArray>(n) { IntArray(bSize) } }
        var maxLength = 0
        for (i in 0..<n) {
            // find palindromes of odd length (one node in the middle)
            val localLength = findPalindrome(adj, labels, i, i, 0, cache)
            maxLength = max(maxLength, localLength)
            // find palindromes of even length (two nodes in the middle)
            for (j in adj[i]) {
                if (labels[i] == labels[j]) {
                    val length = findPalindrome(adj, labels, i, j, 0, cache)
                    maxLength = max(maxLength, length)
                }
            }
        }
        return maxLength
    }

    private fun findPalindrome(
        adj: Array<IntArray>,
        labels: CharArray,
        i: Int,
        j: Int,
        b: Int,
        cache: Array<Array<IntArray>>,
    ): Int {
        if (cache[i][j][b] != 0) {
            return cache[i][j][b]
        }
        var b1 = set(b, i)
        b1 = set(b1, j)
        val length = if (i == j) 1 else 2
        var maxExtraLength = 0
        for (i1 in adj[i]) {
            if (get(b1, i1)) {
                continue
            }
            for (j1 in adj[j]) {
                if (i1 == j1) {
                    continue
                }
                if (labels[i1] != labels[j1]) {
                    continue
                }
                if (get(b1, j1)) {
                    continue
                }
                val extraLength = findPalindrome(adj, labels, i1, j1, b1, cache)
                maxExtraLength = max(maxExtraLength, extraLength)
            }
        }
        cache[i][j][b] = length + maxExtraLength
        return length + maxExtraLength
    }

    private fun get(b: Int, i: Int): Boolean {
        return (b and (1 shl i)) != 0
    }

    private fun set(b: Int, i: Int): Int {
        return b or (1 shl i)
    }

    private fun adj(n: Int, edges: Array<IntArray>): Array<IntArray> {
        val adjList: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        for (i in 0..<n) {
            adjList.add(ArrayList<Int>())
        }
        for (edge in edges) {
            adjList[edge[0]].add(edge[1])
            adjList[edge[1]].add(edge[0])
        }
        val adj = Array<IntArray>(n) { i -> adjList[i].stream().mapToInt { j: Int -> j }.toArray() }
        return adj
    }
}
