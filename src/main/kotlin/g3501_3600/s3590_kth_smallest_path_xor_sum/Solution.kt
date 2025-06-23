package g3501_3600.s3590_kth_smallest_path_xor_sum

// #Hard #Array #Depth_First_Search #Tree #Ordered_Set
// #2025_06_23_Time_395_ms_(100.00%)_Space_129.21_MB_(100.00%)

import java.util.TreeSet
import java.util.function.ToIntFunction

class Solution {
    private class OrderStatisticSet {
        private val set = TreeSet<Int>()
        private val list = ArrayList<Int>()

        fun insert(x: Int) {
            if (set.add(x)) {
                var pos = list.binarySearch(x)
                if (pos < 0) {
                    pos = -(pos + 1)
                }
                list.add(pos, x)
            }
        }

        fun insertAll(other: OrderStatisticSet) {
            for (`val` in other.list) {
                this.insert(`val`)
            }
        }

        fun size(): Int {
            return set.size
        }

        // Returns the k-th smallest element (0-based)
        fun findByOrder(k: Int): Int {
            return list[k]
        }
    }

    private lateinit var adj: MutableList<MutableList<Int>>
    private lateinit var xors: IntArray
    private lateinit var subtreeSize: IntArray
    private lateinit var postorderIndex: IntArray
    private lateinit var nodeSets: Array<OrderStatisticSet>
    private lateinit var queries: MutableList<IntArray>
    private lateinit var result: IntArray
    private var time = 0
    private var queryPtr = 0

    fun kthSmallest(parent: IntArray, vals: IntArray, rawQueries: Array<IntArray>): IntArray {
        val n = parent.size
        adj = ArrayList<MutableList<Int>>()
        for (i in 0..<n) {
            adj.add(ArrayList<Int>())
        }
        xors = IntArray(n)
        subtreeSize = IntArray(n)
        postorderIndex = IntArray(n)
        nodeSets = Array<OrderStatisticSet>(n) { OrderStatisticSet() }
        // Build tree from parent array
        for (i in 1..<n) {
            adj[parent[i]].add(i)
        }
        // Compute XOR and subtree sizes
        computeSubtreeInfo(0, vals[0], vals)
        // Pack queries with original indices
        queries = ArrayList<IntArray>()
        for (i in rawQueries.indices) {
            queries.add(intArrayOf(rawQueries[i][0], rawQueries[i][1], i))
        }
        queries.sortWith(Comparator.comparingInt(ToIntFunction { a: IntArray -> postorderIndex[a[0]] }))
        result = IntArray(queries.size)
        dfs(0)
        return result
    }

    private fun computeSubtreeInfo(node: Int, currentXor: Int, vals: IntArray) {
        xors[node] = currentXor
        var size = 1
        for (child in adj[node]) {
            computeSubtreeInfo(child, currentXor xor vals[child], vals)
            size += subtreeSize[child]
        }
        subtreeSize[node] = size
        postorderIndex[node] = time++
    }

    private fun dfs(node: Int) {
        var largestChild = -1
        var maxSize = -1
        for (child in adj[node]) {
            dfs(child)
            if (subtreeSize[child] > maxSize) {
                maxSize = subtreeSize[child]
                largestChild = child
            }
        }
        if (largestChild == -1) {
            nodeSets[node] = OrderStatisticSet()
        } else {
            nodeSets[node] = nodeSets[largestChild]
        }
        nodeSets[node].insert(xors[node])
        for (child in adj[node]) {
            if (child == largestChild) {
                continue
            }
            nodeSets[node].insertAll(nodeSets[child])
        }
        while (queryPtr < queries.size && queries[queryPtr][0] == node) {
            val k = queries[queryPtr][1]
            val queryId = queries[queryPtr][2]
            if (nodeSets[node].size() >= k) {
                result[queryId] = nodeSets[node].findByOrder(k - 1)
            } else {
                result[queryId] = -1
            }
            queryPtr++
        }
    }
}
