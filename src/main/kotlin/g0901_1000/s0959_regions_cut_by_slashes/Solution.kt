package g0901_1000.s0959_regions_cut_by_slashes

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2023_05_03_Time_180_ms_(100.00%)_Space_37.2_MB_(50.00%)

class Solution {
    private var regions = 0
    private lateinit var parent: IntArray
    fun regionsBySlashes(grid: Array<String>): Int {
        val n = grid.size
        regions = n * n * 4
        unionFind(regions)
        for (row in grid.indices) {
            val str = grid[row]
            val ch = str.toCharArray()
            for ((col, c) in ch.withIndex()) {
                val index = row * n * 4 + col * 4
                when (c) {
                    '/' -> {
                        union(index, index + 3)
                        union(index + 1, index + 2)
                    }
                    ' ' -> {
                        union(index, index + 1)
                        union(index + 1, index + 2)
                        union(index + 2, index + 3)
                    } else -> {
                        union(index, index + 1)
                        union(index + 2, index + 3)
                    }
                }
                if (row != n - 1) {
                    union(index + 2, index + 4 * n)
                }
                if (col != n - 1) {
                    union(index + 1, index + 7)
                }
            }
        }
        return regions
    }

    private fun unionFind(n: Int) {
        parent = IntArray(n)
        for (i in 0 until n) {
            parent[i] = i
        }
    }

    private fun union(p: Int, q: Int) {
        if (connected(p, q)) {
            return
        }
        --regions
        val i = root(p)
        val j = root(q)
        if (i > j) {
            parent[i] = j
        } else {
            parent[j] = i
        }
    }

    private fun connected(p: Int, q: Int): Boolean {
        return root(p) == root(q)
    }

    private fun root(index: Int): Int {
        var index = index
        while (index != parent[index]) {
            parent[index] = parent[parent[index]]
            index = parent[index]
        }
        return index
    }
}
