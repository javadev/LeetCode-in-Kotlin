package g1701_1800.s1743_restore_the_array_from_adjacent_pairs

// #Medium #Array #Hash_Table #2023_06_16_Time_1018_ms_(100.00%)_Space_110.7_MB_(75.00%)

class Solution {
    fun restoreArray(adjacentPairs: Array<IntArray>): IntArray {
        if (adjacentPairs.isEmpty()) {
            return IntArray(0)
        }
        if (adjacentPairs.size == 1) {
            return adjacentPairs[0]
        }
        val graph: MutableMap<Int, MutableList<Int>> = HashMap()
        for (pair: IntArray in adjacentPairs) {
            graph.computeIfAbsent(pair[0]) { _: Int? -> ArrayList() }.add(pair[1])
            graph.computeIfAbsent(pair[1]) { _: Int? -> ArrayList() }.add(pair[0])
        }
        val res = IntArray(graph.size)
        for (entry: Map.Entry<Int, List<Int>> in graph.entries) {
            if (entry.value.size == 1) {
                res[0] = entry.key
                break
            }
        }
        res[1] = graph[res[0]]!![0]
        for (i in 2 until res.size) {
            for (cur: Int in graph[res[i - 1]]!!) {
                if (cur != res[i - 2]) {
                    res[i] = cur
                    break
                }
            }
        }
        return res
    }
}
