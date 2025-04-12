package g3101_3200.s3161_block_placement_queries

// #Hard #Array #Binary_Search #Segment_Tree #Binary_Indexed_Tree
// #2025_03_16_Time_100_ms_(100.00%)_Space_144.97_MB_(43.75%)

import kotlin.math.max

class Solution {
    fun getResults(queries: Array<IntArray>): List<Boolean> {
        val m = queries.size
        val pos = IntArray(m + 1)
        var size = 0
        pos[size++] = 0
        var max = 0
        for (q in queries) {
            max = max(max.toDouble(), q[1].toDouble()).toInt()
            if (q[0] == 1) {
                pos[size++] = q[1]
            }
        }
        pos.sort(0, size)
        max++
        val left = UnionFind(max + 1)
        val right = UnionFind(max + 1)
        val bit = BIT(max)
        initializePositions(size, pos, bit, left, right, max)
        return listOf<Boolean>(*getBooleans(queries, m, size, left, right, bit))
    }

    private fun initializePositions(
        size: Int,
        pos: IntArray,
        bit: BIT,
        left: UnionFind,
        right: UnionFind,
        max: Int,
    ) {
        for (i in 1..<size) {
            val pre = pos[i - 1]
            val cur = pos[i]
            bit.update(cur, cur - pre)
            for (j in pre + 1..<cur) {
                left.parent[j] = pre
                right.parent[j] = cur
            }
        }
        for (j in pos[size - 1] + 1..<max) {
            left.parent[j] = pos[size - 1]
            right.parent[j] = max
        }
    }

    private fun getBooleans(
        queries: Array<IntArray>,
        m: Int,
        size: Int,
        left: UnionFind,
        right: UnionFind,
        bit: BIT,
    ): Array<Boolean> {
        val ans = Array<Boolean>(m - size + 1) { false }
        var index = ans.size - 1
        for (i in m - 1 downTo 0) {
            val q = queries[i]
            val x = q[1]
            val pre = left.find(x - 1)
            if (q[0] == 1) {
                val next = right.find(x + 1)
                left.parent[x] = pre
                right.parent[x] = next
                bit.update(next, next - pre)
            } else {
                val maxGap = max(bit.query(pre), x - pre)
                ans[index--] = maxGap >= q[2]
            }
        }
        return ans
    }

    private class BIT(var n: Int) {
        var tree: IntArray = IntArray(n)

        fun update(i: Int, v: Int) {
            var i = i
            while (i < n) {
                tree[i] = max(tree[i], v)
                i += i and -i
            }
        }

        fun query(i: Int): Int {
            var i = i
            var result = 0
            while (i > 0) {
                result = max(result, tree[i])
                i = i and i - 1
            }
            return result
        }
    }

    private class UnionFind(n: Int) {
        val parent: IntArray = IntArray(n)

        init {
            for (i in 1..<n) {
                parent[i] = i
            }
        }

        fun find(x: Int): Int {
            if (parent[x] != x) {
                parent[x] = find(parent[x])
            }
            return parent[x]
        }
    }
}
