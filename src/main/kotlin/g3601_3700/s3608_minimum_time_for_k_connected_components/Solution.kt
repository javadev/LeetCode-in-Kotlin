package g3601_3700.s3608_minimum_time_for_k_connected_components

// #Medium #Sorting #Binary_Search #Graph #Union_Find
// #2025_07_07_Time_31_ms_(100.00%)_Space_114.78_MB_(100.00%)

class Solution {
    fun minTime(n: Int, edges: Array<IntArray>, k: Int): Int {
        var maxTime = 0
        for (e in edges) {
            if (e[2] > maxTime) {
                maxTime = e[2]
            }
        }
        var lo = 0
        var hi = maxTime
        var ans = maxTime
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (countComponents(n, edges, mid) >= k) {
                ans = mid
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        return ans
    }

    private fun countComponents(n: Int, edges: Array<IntArray>, t: Int): Int {
        val parent = IntArray(n)
        val size = IntArray(n)
        for (i in 0..<n) {
            parent[i] = i
            size[i] = 1
        }
        var comps = n
        for (e in edges) {
            if (e[2] > t) {
                var u = find(parent, e[0])
                var v = find(parent, e[1])
                if (u != v) {
                    if (size[u] < size[v]) {
                        val tmp = u
                        u = v
                        v = tmp
                    }
                    parent[v] = u
                    size[u] += size[v]
                    comps--
                }
            }
        }
        return comps
    }

    private fun find(parent: IntArray, x: Int): Int {
        var x = x
        while (parent[x] != x) {
            parent[x] = parent[parent[x]]
            x = parent[x]
        }
        return x
    }
}
