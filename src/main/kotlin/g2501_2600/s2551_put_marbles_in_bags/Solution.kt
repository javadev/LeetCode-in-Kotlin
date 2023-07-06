package g2501_2600.s2551_put_marbles_in_bags

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2023_07_06_Time_818_ms_(100.00%)_Space_64.3_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun putMarbles(weights: IntArray, k: Int): Long {
        // Map<Pair<Integer, Integer>, long[]> memo = new HashMap<>();
        // long[] res = dfs(weights, 0, k, memo);
        // return res[1] - res[0];
        if (k == 1 || k == weights.size) return 0
        val min = PriorityQueue<Long>()
        val max = PriorityQueue { a: Long?, b: Long? ->
            java.lang.Long.compare(
                b!!, a!!
            )
        }
        for (i in 0 until weights.size - 1) {
            val sum = weights[i].toLong() + weights[i + 1]
            min.offer(sum)
            max.offer(sum)
            if (min.size == k) min.poll()
            if (max.size == k) max.poll()
        }
        var res: Long = 0
        while (!max.isEmpty()) {
            res += min.poll() - max.poll()!!
        }
        return res
    }
}
