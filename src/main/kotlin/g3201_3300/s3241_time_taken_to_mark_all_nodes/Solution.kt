package g3201_3300.s3241_time_taken_to_mark_all_nodes

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Graph
// #2024_08_07_Time_1228_ms_(100.00%)_Space_108.5_MB_(100.00%)

import kotlin.math.max

class Solution {
    private lateinit var head: IntArray
    private lateinit var nxt: IntArray
    private lateinit var to: IntArray
    private lateinit var last: IntArray
    private lateinit var lastNo: IntArray
    private lateinit var second: IntArray
    private lateinit var ans: IntArray

    fun timeTaken(edges: Array<IntArray>): IntArray {
        val n = edges.size + 1
        head = IntArray(n)
        nxt = IntArray(n shl 1)
        to = IntArray(n shl 1)
        head.fill(-1)
        var i = 0
        var j = 2
        while (i < edges.size) {
            val u = edges[i][0]
            val v = edges[i][1]
            nxt[j] = head[u]
            head[u] = j
            to[j] = v
            j++
            nxt[j] = head[v]
            head[v] = j
            to[j] = u
            j++
            i++
        }
        last = IntArray(n)
        lastNo = IntArray(n)
        second = IntArray(n)
        ans = IntArray(n)
        dfs(-1, 0)
        System.arraycopy(last, 0, ans, 0, n)
        dfs2(-1, 0, 0)
        return ans
    }

    private fun dfs2(f: Int, u: Int, preLast: Int) {
        var e = head[u]
        var v: Int
        while (e != -1) {
            v = to[e]
            if (f != v) {
                val pl = if (v == lastNo[u]) {
                    (
                        max(
                            preLast,
                            second[u],
                        ) + (if ((u and 1) == 0) 2 else 1)
                        )
                } else {
                    (
                        max(
                            preLast,
                            last[u],
                        ) + (if ((u and 1) == 0) 2 else 1)
                        )
                }
                ans[v] = max(ans[v], pl)
                dfs2(u, v, pl)
            }
            e = nxt[e]
        }
    }

    private fun dfs(f: Int, u: Int) {
        var e = head[u]
        var v: Int
        while (e != -1) {
            v = to[e]
            if (f != v) {
                dfs(u, v)
                val t = last[v] + (if ((v and 1) == 0) 2 else 1)
                if (last[u] < t) {
                    second[u] = last[u]
                    last[u] = t
                    lastNo[u] = v
                } else if (second[u] < t) {
                    second[u] = t
                }
            }
            e = nxt[e]
        }
    }
}
