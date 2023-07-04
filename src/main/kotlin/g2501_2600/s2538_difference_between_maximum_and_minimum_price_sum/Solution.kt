package g2501_2600.s2538_difference_between_maximum_and_minimum_price_sum

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree
// #2023_07_04_Time_1054_ms_(100.00%)_Space_106.6_MB_(100.00%)

class Solution {
    private lateinit var tree: Array<ArrayList<Int>?>
    private lateinit var price: IntArray
    private var res: Long = 0
    private lateinit var visited: BooleanArray

    fun maxOutput(n: Int, edges: Array<IntArray>, price: IntArray): Long {
        if (n == 1) {
            return 0
        }
        this.price = price
        tree = arrayOfNulls(n)
        for (i in 0 until n) {
            tree[i] = ArrayList()
        }
        for (e in edges) {
            tree[e[0]]?.add(e[1])
            tree[e[1]]?.add(e[0])
        }
        visited = BooleanArray(n)
        visited[0] = true
        dfs(0)
        return res
    }

    // return long[]{longest path with leaf, longest path without leaf}
    private fun dfs(node: Int): LongArray {
        if (tree[node]?.size == 1 && node != 0) {
            return longArrayOf(price[node].toLong(), 0)
        }
        var i0 = -1
        var i1 = -1
        var l0: Long = 0
        var l1: Long = 0
        var s0: Long = 0
        var s1: Long = 0
        for (child in tree[node]!!) {
            if (visited[child]) {
                continue
            }
            visited[child] = true
            val sub = dfs(child)
            if (sub[0] >= l0) {
                s0 = l0
                l0 = sub[0]
                i0 = child
            } else if (sub[0] > s0) {
                s0 = sub[0]
            }
            if (sub[1] >= l1) {
                s1 = l1
                l1 = sub[1]
                i1 = child
            } else if (sub[1] > s1) {
                s1 = sub[1]
            }
        }
        res = if (s0 == 0L) {
            // only one child. case: example 2
            Math.max(res, Math.max(l0, l1 + price[node]))
        } else {
            val path = if (i0 != i1) price[node] + l0 + l1 else price[node] + Math.max(l0 + s1, s0 + l1)
            Math.max(res, path)
        }
        return longArrayOf(l0 + price[node], l1 + price[node])
    }
}
