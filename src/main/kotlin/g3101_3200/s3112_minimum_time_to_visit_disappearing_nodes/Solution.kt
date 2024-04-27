package g3101_3200.s3112_minimum_time_to_visit_disappearing_nodes

// #Medium #Array #Heap_Priority_Queue #Graph #Shortest_Path
// #2024_04_27_Time_828_ms_(94.44%)_Space_114.8_MB_(100.00%)

class Solution {
    fun minimumTime(n: Int, edges: Array<IntArray>, disappear: IntArray): IntArray {
        val dist = IntArray(n)
        dist.fill(Int.MAX_VALUE)
        var exit = false
        var src: Int
        var dest: Int
        var cost: Int
        dist[0] = 0
        var i = 0
        while (i < n && !exit) {
            exit = true
            for (edge in edges) {
                src = edge[0]
                dest = edge[1]
                cost = edge[2]
                if (dist[src] != -1 && dist[src] != Int.MAX_VALUE &&
                    dist[src] < disappear[src] && dist[src] + cost < dist[dest]
                ) {
                    exit = false
                    dist[dest] = dist[src] + cost
                }
                if (dist[dest] != -1 && dist[dest] != Int.MAX_VALUE &&
                    dist[dest] < disappear[dest] && dist[dest] + cost < dist[src]
                ) {
                    exit = false
                    dist[src] = dist[dest] + cost
                }
            }
            ++i
        }
        i = 0
        while (i < dist.size) {
            if (dist[i] == Int.MAX_VALUE || dist[i] >= disappear[i]) {
                dist[i] = -1
            }
            ++i
        }
        return dist
    }
}
