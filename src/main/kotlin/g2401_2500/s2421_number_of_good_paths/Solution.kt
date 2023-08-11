package g2401_2500.s2421_number_of_good_paths

// #Hard #Array #Tree #Graph #Union_Find #2023_07_04_Time_909_ms_(100.00%)_Space_65.8_MB_(100.00%)

class Solution {
    fun numberOfGoodPaths(vals: IntArray, edges: Array<IntArray>): Int {
        val n = vals.size
        val parent = IntArray(n)
        val maxElement = IntArray(n)
        val count = IntArray(n)
        for (i in 0 until n) {
            parent[i] = i
            maxElement[i] = vals[i]
            count[i] = 1
        }
        edges.sortWith(compareBy { a: IntArray -> vals[a[0]].coerceAtLeast(vals[a[1]]) })
        var ans = n
        for (it in edges) {
            val a = findParent(parent, it[0])
            val b = findParent(parent, it[1])
            if (maxElement[a] != maxElement[b]) {
                if (maxElement[a] > maxElement[b]) {
                    parent[b] = a
                } else {
                    parent[a] = b
                }
            } else {
                parent[b] = a
                ans += count[a] * count[b]
                count[a] += count[b]
            }
        }
        return ans
    }

    private fun findParent(parent: IntArray, a: Int): Int {
        if (a == parent[a]) {
            return a
        }
        parent[a] = findParent(parent, parent[a])
        return parent[a]
    }
}
