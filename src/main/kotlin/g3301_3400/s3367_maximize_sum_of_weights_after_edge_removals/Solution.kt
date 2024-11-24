package g3301_3400.s3367_maximize_sum_of_weights_after_edge_removals

// #Hard #2024_11_24_Time_220_ms_(100.00%)_Space_154.5_MB_(100.00%)

import java.util.PriorityQueue
import kotlin.math.max

class Solution {
    fun maximizeSumOfWeights(edges: Array<IntArray>, k: Int): Long {
        val map = HashMap<Int?, ArrayList<IntArray>?>()
        for (edge in edges) {
            map.computeIfAbsent(edge[0]) { _: Int? -> ArrayList<IntArray>() }!!
                .add(intArrayOf(edge[1], edge[2]))
            map.computeIfAbsent(edge[1]) { _: Int? -> ArrayList<IntArray>() }!!
                .add(intArrayOf(edge[0], edge[2]))
        }
        return maximizeSumOfWeights(0, -1, k, map)[0]
    }

    private fun maximizeSumOfWeights(
        v: Int,
        from: Int,
        k: Int,
        map: HashMap<Int?, ArrayList<IntArray>?>,
    ): LongArray {
        var sum: Long = 0
        val queue = PriorityQueue<Long>()
        for (i in map[v]!!) {
            if (i[0] != from) {
                val next = maximizeSumOfWeights(i[0], v, k, map)
                next[1] += i[1].toLong()
                sum = sum + max(next[0], next[1])
                if (next[0] < next[1]) {
                    queue.offer(next[1] - next[0])
                    sum = sum - (if (queue.size > k) queue.poll() else 0)
                }
            }
        }
        return longArrayOf(sum, sum - (if (queue.size < k) 0 else queue.peek())!!)
    }
}
