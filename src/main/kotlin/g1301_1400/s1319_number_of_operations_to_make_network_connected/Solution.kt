package g1301_1400.s1319_number_of_operations_to_make_network_connected

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_8_Standard_Traversal #2023_06_05_Time_379_ms_(83.33%)_Space_65_MB_(66.67%)

import java.util.Arrays

@Suppress("NAME_SHADOWING")
class Solution {
    private var disconnectedComputers = 0
    private lateinit var parent: IntArray
    private lateinit var rank: IntArray

    fun makeConnected(totalNumberOfComputers: Int, connections: Array<IntArray>): Int {
        if (connections.size < totalNumberOfComputers - 1) {
            return IMPOSSIBLE_TO_CONNECT
        }
        disconnectedComputers = totalNumberOfComputers
        rank = IntArray(totalNumberOfComputers)
        parent = IntArray(totalNumberOfComputers)
        Arrays.setAll(parent) { intFromZero: Int ->
            var intFromZero = intFromZero
            intFromZero++
        }
        for (connection in connections) {
            unionFind(connection[0], connection[1])
        }
        return disconnectedComputers - 1
    }

    private fun unionFind(first: Int, second: Int) {
        val parentFirst = findParent(first)
        val parentSecond = findParent(second)
        if (parentFirst != parentSecond) {
            joinByRank(parentFirst, parentSecond)
            disconnectedComputers--
        }
    }

    private fun findParent(index: Int): Int {
        if (parent[index] != index) {
            parent[index] = findParent(parent[index])
        }
        return parent[index]
    }

    private fun joinByRank(first: Int, second: Int) {
        if (rank[first] < rank[second]) {
            parent[first] = second
        } else if (rank[second] < rank[first]) {
            parent[second] = first
        } else {
            parent[first] = second
            rank[second]++
        }
    }

    companion object {
        private const val IMPOSSIBLE_TO_CONNECT = -1
    }
}
