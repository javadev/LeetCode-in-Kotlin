package g1701_1800.s1766_tree_of_coprimes

// #Hard #Math #Depth_First_Search #Breadth_First_Search #Tree
// #2023_06_18_Time_991_ms_(100.00%)_Space_89.3_MB_(100.00%)

@Suppress("kotlin:S107")
class Solution {
    private fun dfs(
        v2n: IntArray,
        v2d: IntArray,
        depth: Int,
        parent: Int,
        node: Int,
        ans: IntArray,
        nums: IntArray,
        neighbors: Array<ArrayList<Int>>,
    ) {
        var d = Int.MIN_VALUE
        var n = -1
        val v = nums[node]
        for (i in 1..50) {
            if (v2n[i] != -1 && v2d[i] > d && gcd(i, v) == 1) {
                d = v2d[i]
                n = v2n[i]
            }
        }
        ans[node] = n
        val v2NOld = v2n[v]
        val v2DOld = v2d[v]
        v2n[v] = node
        v2d[v] = depth
        for (child in neighbors[node]) {
            if (child == parent) {
                continue
            }
            dfs(v2n, v2d, depth + 1, node, child, ans, nums, neighbors)
        }
        v2n[v] = v2NOld
        v2d[v] = v2DOld
    }

    private fun gcd(x: Int, y: Int): Int {
        return if (x == 0) y else gcd(y % x, x)
    }

    fun getCoprimes(nums: IntArray, edges: Array<IntArray>): IntArray {
        val n = nums.size
        val neighbors: Array<ArrayList<Int>> = Array(n) { ArrayList() }
        for (i in 0 until n) {
            neighbors[i] = ArrayList()
        }
        for (edge in edges) {
            neighbors[edge[0]].add(edge[1])
            neighbors[edge[1]].add(edge[0])
        }
        val ans = IntArray(n)
        val v2n = IntArray(51)
        val v2d = IntArray(51)
        v2n.fill(-1)
        dfs(v2n, v2d, 0, -1, 0, ans, nums, neighbors)
        return ans
    }
}
