package g1701_1800.s1743_restore_the_array_from_adjacent_pairs

import java.util.function.Function

// #Medium #Array #Hash_Table
class Solution {
    fun restoreArray(adjacentPairs: Array<IntArray>?): IntArray {
        if (adjacentPairs == null || adjacentPairs.size == 0) {
            return IntArray(0)
        }
        if (adjacentPairs.size == 1) {
            return adjacentPairs.get(0)
        }
        val graph: MutableMap<Int, MutableList<Int>> = HashMap()
        for (pair: IntArray in adjacentPairs) {
            graph.computeIfAbsent(pair.get(0), Function<Int, MutableList<Int>>({ k: Int? -> ArrayList() })).add(pair.get(1))
            graph.computeIfAbsent(pair.get(1), Function<Int, MutableList<Int>>({ k: Int? -> ArrayList() })).add(pair.get(0))
        }
        val res = IntArray(graph.size)
        for (entry: Map.Entry<Int, List<Int>> in graph.entries) {
            if (entry.value.size == 1) {
                res[0] = entry.key
                break
            }
        }
        res[1] = graph.get(res.get(0))!!.get(0)
        for (i in 2 until res.size) {
            for (cur: Int in graph.get(res.get(i - 1))!!) {
                if (cur != res.get(i - 2)) {
                    res[i] = cur
                    break
                }
            }
        }
        return res
    }
}
