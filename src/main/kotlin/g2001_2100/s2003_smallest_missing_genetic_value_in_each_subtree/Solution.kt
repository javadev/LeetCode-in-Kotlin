package g2001_2100.s2003_smallest_missing_genetic_value_in_each_subtree

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Union_Find
// #2023_06_23_Time_984_ms_(100.00%)_Space_78.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun smallestMissingValueSubtree(parents: IntArray, nums: IntArray): IntArray {
        val ans = IntArray(parents.size)
        val all = arrayOfNulls<Node>(parents.size)
        var max = 0
        for (i in nums.indices) {
            all[i] = Node(i, nums[i])
            max = max.coerceAtLeast(nums[i])
        }
        for (i in 1 until parents.size) {
            all[parents[i]]!!.nodes.add(all[i])
        }
        solve(all[0], ans, UF(++max, nums))
        return ans
    }

    private fun solve(root: Node?, ans: IntArray, uf: UF) {
        var max = 1
        for (child in root!!.nodes) {
            solve(child, ans, uf)
            uf.union(root.`val`, child!!.`val`)
            max = ans[child.idx].coerceAtLeast(max)
        }
        while (max <= ans.size && uf.isConnected(max, root.`val`)) {
            ++max
        }
        ans[root.idx] = max
    }

    private class Node internal constructor(var idx: Int, var `val`: Int) {
        var nodes: MutableList<Node?> = ArrayList()
    }

    private class UF internal constructor(n: Int, nums: IntArray) {
        var rank: IntArray
        var parent: IntArray

        init {
            rank = IntArray(n)
            parent = IntArray(n)
            for (m in nums) {
                parent[m] = m
            }
        }

        private fun find(x: Int): Int {
            if (x == parent[x]) {
                return x
            }
            parent[x] = find(parent[x])
            return parent[x]
        }

        fun union(x: Int, y: Int) {
            var x = x
            var y = y
            x = find(x)
            y = find(y)
            if (rank[x] > rank[y]) {
                parent[y] = x
            } else {
                parent[x] = y
                if (rank[x] == rank[y]) {
                    rank[y]++
                }
            }
        }

        fun isConnected(x: Int, y: Int): Boolean {
            return find(x) == find(y)
        }
    }
}
