package g1001_1100.s1054_distant_barcodes

// #Medium #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Counting
// #2023_05_30_Time_622_ms_(75.00%)_Space_102.5_MB_(75.00%)

import java.util.PriorityQueue

class Solution {
    fun rearrangeBarcodes(barcodes: IntArray): IntArray {
        val map = barcodes.groupBy { it }.mapValues { it.value.size }
        val pq = PriorityQueue<Pair<Int, Int>> { a, b -> b.second - a.second }
        map.forEach { kv -> pq.offer(kv.toPair()) }
        val result = IntArray(barcodes.size)
        var ind = 0
        while (pq.isNotEmpty()) {
            val remainingBcs = mutableListOf<Pair<Int, Int>>()
            for (i in 0 until 2) {
                if (pq.isNotEmpty()) {
                    val max = pq.poll()
                    result[ind++] = max.first
                    if (max.second - 1 != 0) {
                        remainingBcs.add(Pair(max.first, max.second - 1))
                    }
                }
            }
            remainingBcs.forEach { bc -> pq.offer(bc) }
        }
        return result
    }
}
