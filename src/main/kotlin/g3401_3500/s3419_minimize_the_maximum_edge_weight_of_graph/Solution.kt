package g3401_3500.s3419_minimize_the_maximum_edge_weight_of_graph

// #Medium #Depth_First_Search #Breadth_First_Search #Binary_Search #Graph #Shortest_Path
// #2025_01_14_Time_88_ms_(100.00%)_Space_115.26_MB_(83.33%)

import java.util.LinkedList
import java.util.Queue
import kotlin.math.max

@Suppress("unused")
class Solution {
    fun minMaxWeight(n: Int, edges: Array<IntArray>, threshold: Int): Int {
        val reversedG: Array<MutableList<IntArray>> = Array<MutableList<IntArray>>(n) { ArrayList<IntArray>() }
        for (i in edges) {
            val a = i[0]
            val b = i[1]
            val w = i[2]
            reversedG[b].add(intArrayOf(a, w))
        }
        val distance = IntArray(n)
        distance.fill(Int.Companion.MAX_VALUE)
        distance[0] = 0
        if (reversedG[0].isEmpty()) {
            return -1
        }
        val que: Queue<Int> = LinkedList<Int>()
        que.add(0)
        while (que.isNotEmpty()) {
            val cur: Int = que.poll()!!
            for (next in reversedG[cur]) {
                val node = next[0]
                val w = next[1]
                val nextdis = max(w, distance[cur])
                if (nextdis < distance[node]) {
                    distance[node] = nextdis
                    que.add(node)
                }
            }
        }
        var ans = 0
        for (i in 0..<n) {
            if (distance[i] == Int.Companion.MAX_VALUE) {
                return -1
            }
            ans = max(ans, distance[i])
        }
        return ans
    }
}
