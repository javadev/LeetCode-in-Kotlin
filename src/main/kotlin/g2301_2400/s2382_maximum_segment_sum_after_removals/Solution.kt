package g2301_2400.s2382_maximum_segment_sum_after_removals

// #Hard #Array #Prefix_Sum #Union_Find #Ordered_Set
@Suppress("NAME_SHADOWING")
class Solution {
    private class UF(n: Int) {
        var root: IntArray
        var sum: LongArray

        init {
            this.root = IntArray(n)
            this.root.fill(-1)
            sum = LongArray(n)
        }

        fun insert(x: Int, value: Int) {
            if (root[x] != -1 || sum[x] != 0L) {
                return
            }
            this.root[x] = x
            sum[x] = value.toLong()
        }

        fun find(x: Int): Int {
            var x = x
            while (root[x] != x) {
                val fa = root[x]
                val ga = root[fa]
                root[x] = ga
                x = fa
            }
            return x
        }

        fun union(x: Int, y: Int) {
            val rx = find(x)
            val ry = find(y)
            if (x == y) {
                return
            }
            root[rx] = ry
            sum[ry] += sum[rx]
        }

        fun has(x: Int): Boolean {
            return root[x] != -1 || sum[x] != 0L
        }
    }

    fun maximumSegmentSum(nums: IntArray, removeQueries: IntArray): LongArray {
        val n = removeQueries.size
        val ret = LongArray(n)
        var max = 0L
        val uf = UF(n)
        for (i in n - 1 downTo 0) {
            val u = removeQueries[i]
            uf.insert(u, nums[u])
            var v = u - 1
            while (v <= u + 1) {
                if (v >= 0 && v < n && uf.has(v)) {
                    uf.union(v, u)
                }
                v += 2
            }
            ret[i] = max
            val ru = uf.find(u)
            max = Math.max(max, uf.sum[ru])
        }
        return ret
    }
}
