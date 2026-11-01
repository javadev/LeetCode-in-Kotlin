package g3801_3900.s3873_maximum_points_activated_with_one_addition

// #Hard #Array #Hash_Table #Union_Find #Senior_Staff #Weekly_Contest_493
// #2026_07_28_Time_36_ms_(97.50%)_Space_210.60_MB_(92.50%)

class Solution {
    fun maxActivated(points: Array<IntArray>): Int = maxEnergized(points)

    private fun maxEnergized(relays: Array<IntArray>): Int {
        val n = relays.size
        val parent = IntArray(n)
        val size = IntArray(n)
        for (i in 0..<n) {
            parent[i] = i
            size[i] = 1
        }
        val firstInCol: MutableMap<Int, Int> = HashMap<Int, Int>(n * 2)
        val firstInRow: MutableMap<Int, Int> = HashMap<Int, Int>(n * 2)
        for (i in 0..<n) {
            val col = relays[i][0]
            val row = relays[i][1]
            val c = firstInCol.putIfAbsent(col, i)
            if (c != null) {
                union(parent, size, c, i)
            }
            val r = firstInRow.putIfAbsent(row, i)
            if (r != null) {
                union(parent, size, r, i)
            }
        }
        var best1 = 0
        var best2 = 0
        for (i in 0..<n) {
            if (find(parent, i) == i) {
                val s = size[i]
                if (s >= best1) {
                    best2 = best1
                    best1 = s
                } else if (s > best2) {
                    best2 = s
                }
            }
        }
        return best1 + best2 + 1
    }

    private fun find(parent: IntArray, x: Int): Int {
        var x = x
        var root = x
        while (parent[root] != root) {
            root = parent[root]
        }
        while (parent[x] != root) {
            val next = parent[x]
            parent[x] = root
            x = next
        }
        return root
    }

    private fun union(parent: IntArray, size: IntArray, a: Int, b: Int) {
        var ra = find(parent, a)
        var rb = find(parent, b)
        if (ra == rb) {
            return
        }
        if (size[ra] < size[rb]) {
            val t = ra
            ra = rb
            rb = t
        }
        parent[rb] = ra
        size[ra] += size[rb]
    }
}
