package g2801_2900.s2872_maximum_number_of_k_divisible_components

// #Hard #Dynamic_Programming #Depth_First_Search #Tree
// #2023_12_21_Time_780_ms_(100.00%)_Space_79_MB_(100.00%)

class Solution {
    private var ans = 0

    fun maxKDivisibleComponents(n: Int, edges: Array<IntArray>, values: IntArray, k: Int): Int {
        val adj: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        for (edge in edges) {
            val start = edge[0]
            val end = edge[1]
            adj[start].add(end)
            adj[end].add(start)
        }
        val isVis = BooleanArray(n)
        isVis[0] = true
        get(0, -1, adj, isVis, values, k.toLong())
        return ans
    }

    private fun get(
        curNode: Int,
        parent: Int,
        adj: List<MutableList<Int>>,
        isVis: BooleanArray,
        values: IntArray,
        k: Long,
    ): Long {
        var sum = values[curNode].toLong()
        for (ele in adj[curNode]) {
            if (ele != parent && !isVis[ele]) {
                isVis[ele] = true
                sum += get(ele, curNode, adj, isVis, values, k)
            }
        }
        return if (sum % k == 0L) {
            ans++
            0
        } else {
            sum
        }
    }
}
