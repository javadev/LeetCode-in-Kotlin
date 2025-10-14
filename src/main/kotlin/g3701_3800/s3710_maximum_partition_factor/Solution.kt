package g3701_3800.s3710_maximum_partition_factor

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Graph #Union_Find
// #Biweekly_Contest_167 #2025_10_14_Time_55_ms_(100.00%)_Space_53.06_MB_(87.50%)

import kotlin.math.abs

class Solution {
    fun maxPartitionFactor(points: Array<IntArray>): Int {
        val n = points.size
        if (n == 2) {
            return 0
        }
        val dist = Array<IntArray>(n) { IntArray(n) }
        var maxDist = 0
        for (i in 0..<n) {
            for (j in i + 1..<n) {
                val d =
                    abs(points[i][0] - points[j][0]) + abs(points[i][1] - points[j][1])
                dist[j][i] = d
                dist[i][j] = dist[j][i]
                if (d > maxDist) {
                    maxDist = d
                }
            }
        }
        var low = 0
        var high = maxDist
        while (low < high) {
            val mid = low + (high - low + 1) / 2
            if (isFeasible(dist, mid)) {
                low = mid
            } else {
                high = mid - 1
            }
        }
        return low
    }

    private fun isFeasible(dist: Array<IntArray>, t: Int): Boolean {
        val n = dist.size
        val color = IntArray(n)
        color.fill(-1)
        val queue = IntArray(n)
        for (i in 0..<n) {
            if (color[i] != -1) {
                continue
            }
            var head = 0
            var tail = 0
            queue[tail++] = i
            color[i] = 0
            while (head < tail) {
                val u = queue[head++]
                for (v in 0..<n) {
                    if (u == v || dist[u][v] >= t) {
                        continue
                    }
                    if (color[v] == -1) {
                        color[v] = color[u] xor 1
                        queue[tail++] = v
                    } else if (color[v] == color[u]) {
                        return false
                    }
                }
            }
        }
        return true
    }
}
