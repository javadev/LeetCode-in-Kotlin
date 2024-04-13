package g3101_3200.s3108_minimum_cost_walk_in_weighted_graph

// #Hard #Array #Bit_Manipulation #Graph #Union_Find
// #2024_04_13_Time_791_ms_(100.00%)_Space_139.3_MB_(26.67%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumCost(n: Int, edges: Array<IntArray>, query: Array<IntArray>): IntArray {
        val parent = IntArray(n)
        val bitwise = IntArray(n)
        val size = IntArray(n)
        var i = 0
        while (i < n) {
            parent[i] = i
            size[i] = 1
            bitwise[i] = -1
            i++
        }
        val len = edges.size
        i = 0
        while (i < len) {
            val node1 = edges[i][0]
            val node2 = edges[i][1]
            val weight = edges[i][2]
            val parent1 = findParent(node1, parent)
            val parent2 = findParent(node2, parent)
            if (parent1 == parent2) {
                bitwise[parent1] = bitwise[parent1] and weight
            } else {
                var bitwiseVal: Int
                val check1 = bitwise[parent1] == -1
                val check2 = bitwise[parent2] == -1
                bitwiseVal = if (check1 && check2) {
                    weight
                } else if (check1) {
                    weight and bitwise[parent2]
                } else if (check2) {
                    weight and bitwise[parent1]
                } else {
                    weight and bitwise[parent1] and bitwise[parent2]
                }
                if (size[parent1] >= size[parent2]) {
                    parent[parent2] = parent1
                    size[parent1] += size[parent2]
                    bitwise[parent1] = bitwiseVal
                } else {
                    parent[parent1] = parent2
                    size[parent2] += size[parent1]
                    bitwise[parent2] = bitwiseVal
                }
            }
            i++
        }
        val queryLen = query.size
        val result = IntArray(queryLen)
        i = 0
        while (i < queryLen) {
            val start = query[i][0]
            val end = query[i][1]
            val parentStart = findParent(start, parent)
            val parentEnd = findParent(end, parent)
            if (start == end) {
                result[i] = 0
            } else if (parentStart == parentEnd) {
                result[i] = bitwise[parentStart]
            } else {
                result[i] = -1
            }
            i++
        }
        return result
    }

    private fun findParent(node: Int, parent: IntArray): Int {
        var node = node
        while (parent[node] != node) {
            node = parent[node]
        }
        return node
    }
}
