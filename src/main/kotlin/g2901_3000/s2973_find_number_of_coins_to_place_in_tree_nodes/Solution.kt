package g2901_3000.s2973_find_number_of_coins_to_place_in_tree_nodes

// #Hard #Dynamic_Programming #Sorting #Depth_First_Search #Tree #Heap_Priority_Queue
// #2024_01_19_Time_1134_ms_(90.91%)_Space_73.7_MB_(90.91%)

import java.util.PriorityQueue
import kotlin.math.max

class Solution {
    private lateinit var result: LongArray

    fun placedCoins(edges: Array<IntArray>, cost: IntArray): LongArray {
        val n = cost.size
        val g: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until n) {
            g.add(ArrayList())
        }
        for (e in edges) {
            g[e[0]].add(e[1])
            g[e[1]].add(e[0])
        }
        result = LongArray(n)
        dp(g, cost, 0, -1)
        return result
    }

    private class PQX {
        var min: PriorityQueue<Int>? = null
        var max: PriorityQueue<Int>? = null
    }

    private fun dp(g: List<MutableList<Int>>, cost: IntArray, i: Int, p: Int): PQX {
        if (i >= g.size) {
            val pqx = PQX()
            pqx.max = PriorityQueue { a: Int, b: Int -> b - a }
            pqx.min = PriorityQueue(Comparator.comparingInt { a: Int? -> a!! })
            return pqx
        }
        val next: List<Int> = g[i]
        var pq = PriorityQueue { a: Int, b: Int -> b - a }
        var pq2 = PriorityQueue(Comparator.comparingInt { a: Int? -> a!! })
        if (cost[i] > 0) {
            pq.add(cost[i])
        } else {
            pq2.add(cost[i])
        }
        for (ne in next) {
            if (ne != p) {
                val r = dp(g, cost, ne, i)
                while (r.min!!.isNotEmpty()) {
                    val a = r.min!!.poll()
                    pq2.add(a)
                }
                while (r.max!!.isNotEmpty()) {
                    val a = r.max!!.poll()
                    pq.add(a)
                }
            }
        }
        if (pq.size + pq2.size < 3) {
            result[i] = 1
        } else {
            val a = if (pq.isNotEmpty()) pq.poll() else 0
            val b = if (pq.isNotEmpty()) pq.poll() else 0
            val c = if (pq.isNotEmpty()) pq.poll() else 0
            val aa = if (pq2.isNotEmpty()) pq2.poll() else 0
            val bb = if (pq2.isNotEmpty()) pq2.poll() else 0
            result[i] = max(0, (a.toLong() * b * c))
            result[i] = max(result[i], max(0, (a.toLong() * aa * bb)))
            pq = PriorityQueue { x: Int, y: Int -> y - x }
            pq.add(a)
            pq.add(b)
            pq.add(c)
            pq2 = PriorityQueue(Comparator.comparingInt { x: Int? -> x!! })
            pq2.add(aa)
            pq2.add(bb)
        }
        val pqx = PQX()
        pqx.min = pq2
        pqx.max = pq
        return pqx
    }
}
