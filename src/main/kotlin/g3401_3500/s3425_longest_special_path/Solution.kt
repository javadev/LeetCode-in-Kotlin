package g3401_3500.s3425_longest_special_path

// #Hard #Array #Hash_Table #Depth_First_Search #Tree #Sliding_Window
// #2025_03_13_Time_59_ms_(100.00%)_Space_123.56_MB_(55.56%)

import kotlin.math.max

@Suppress("kotlin:S107")
class Solution {
    fun longestSpecialPath(edges: Array<IntArray>, nums: IntArray): IntArray {
        val n = edges.size + 1
        var max = 0
        val adj: Array<MutableList<IntArray>> = Array(n) { ArrayList<IntArray>() }
        for (i in 0..<n) {
            adj[i] = ArrayList<IntArray>()
            max = max(nums[i].toDouble(), max.toDouble()).toInt()
        }
        for (e in edges) {
            adj[e[0]].add(intArrayOf(e[1], e[2]))
            adj[e[1]].add(intArrayOf(e[0], e[2]))
        }
        val dist = IntArray(n)
        val res = intArrayOf(0, Int.Companion.MAX_VALUE)
        val st = IntArray(n + 1)
        val seen = arrayOfNulls<Int>(max + 1)
        dfs(adj, nums, res, dist, seen, st, 0, -1, 0, 0)
        return res
    }

    private fun dfs(
        adj: Array<MutableList<IntArray>>,
        nums: IntArray,
        res: IntArray,
        dist: IntArray,
        seen: Array<Int?>,
        st: IntArray,
        node: Int,
        parent: Int,
        start: Int,
        pos: Int,
    ) {
        var start = start
        val last = seen[nums[node]]
        if (last != null && last >= start) {
            start = last + 1
        }
        seen[nums[node]] = pos
        st[pos] = node
        val len = dist[node] - dist[st[start]]
        val sz = pos - start + 1
        if (res[0] < len || res[0] == len && res[1] > sz) {
            res[0] = len
            res[1] = sz
        }
        for (neighbor in adj[node]) {
            if (neighbor[0] == parent) {
                continue
            }
            dist[neighbor[0]] = dist[node] + neighbor[1]
            dfs(adj, nums, res, dist, seen, st, neighbor[0], node, start, pos + 1)
        }
        seen[nums[node]] = last
    }
}
