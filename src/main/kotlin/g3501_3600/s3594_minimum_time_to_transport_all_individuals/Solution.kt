package g3501_3600.s3594_minimum_time_to_transport_all_individuals

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Heap_Priority_Queue #Graph #Bitmask
// #Shortest_Path #2025_06_23_Time_213_ms_(100.00%)_Space_58.80_MB_(100.00%)

import java.util.PriorityQueue
import java.util.function.ToDoubleFunction
import kotlin.math.floor
import kotlin.math.max

class Solution {
    fun minTime(n: Int, k: Int, m: Int, time: IntArray, mul: DoubleArray): Double {
        if (k == 1 && n > 1) {
            return -1.0
        }
        val full = (1 shl n) - 1
        val max = full + 1
        val maxt = IntArray(max)
        for (ma in 1..full) {
            val lsb = Integer.numberOfTrailingZeros(ma)
            maxt[ma] = max(maxt[ma xor (1 shl lsb)], time[lsb])
        }
        val dis = Array<Array<DoubleArray>>(max) { Array<DoubleArray>(m) { DoubleArray(2) } }
        for (ma in 0..<max) {
            for (st in 0..<m) {
                dis[ma][st].fill(INF)
            }
        }
        val pq =
            PriorityQueue<DoubleArray>(
                Comparator.comparingDouble<DoubleArray>(ToDoubleFunction { a: DoubleArray -> a[0] }),
            )
        dis[0][0][0] = 0.0
        pq.add(doubleArrayOf(0.0, 0.0, 0.0, 0.0))
        while (!pq.isEmpty()) {
            val cur = pq.poll()
            val far = cur[0]
            val ma = cur[1].toInt()
            val st = cur[2].toInt()
            val fl = cur[3].toInt()
            if (far > dis[ma][st][fl]) {
                continue
            }
            if (ma == full && fl == 1) {
                return far
            }
            if (fl == 0) {
                val rem = full xor ma
                var i = rem
                while (i > 0) {
                    if (Integer.bitCount(i) > k) {
                        i = (i - 1) and rem
                        continue
                    }
                    val t = maxt[i] * mul[st]
                    val nxtt = far + t
                    val nxts = (st + (floor(t).toInt() % m)) % m
                    val m1 = ma or i
                    if (nxtt < dis[m1][nxts][1]) {
                        dis[m1][nxts][1] = nxtt
                        pq.offer(doubleArrayOf(nxtt, m1.toDouble(), nxts.toDouble(), 1.0))
                    }
                    i = (i - 1) and rem
                }
            } else {
                var i = ma
                while (i > 0) {
                    val lsb = Integer.numberOfTrailingZeros(i)
                    val t = time[lsb] * mul[st]
                    val nxtt = far + t
                    val nxts = (st + (floor(t).toInt() % m)) % m
                    val m2 = ma xor (1 shl lsb)

                    if (nxtt < dis[m2][nxts][0]) {
                        dis[m2][nxts][0] = nxtt
                        pq.offer(doubleArrayOf(nxtt, m2.toDouble(), nxts.toDouble(), 0.0))
                    }
                    i = i and i - 1
                }
            }
        }
        return -1.0
    }

    companion object {
        private const val INF = 1e18
    }
}
