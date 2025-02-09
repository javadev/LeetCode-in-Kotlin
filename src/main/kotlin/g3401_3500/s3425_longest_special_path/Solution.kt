package g3401_3500.s3425_longest_special_path

// #Hard #Array #Hash_Table #Depth_First_Search #Tree #Sliding_Window
// #2025_01_19_Time_106_ms_(100.00%)_Space_187.68_MB_(100.00%)

class Solution {
    private lateinit var adj: Array<ArrayList<IntArray>>
    private lateinit var nums: IntArray
    private lateinit var dist: IntArray
    private lateinit var lastOccur: IntArray
    private lateinit var pathStack: ArrayList<Int>
    private var minIndex = 0
    private var maxLen = 0
    private var minNodesForMaxLen = 0

    fun longestSpecialPath(edges: Array<IntArray>, nums: IntArray): IntArray {
        val n = nums.size
        this.nums = nums
        adj = Array<ArrayList<IntArray>>(n) { ArrayList<IntArray>() }
        for (i in 0..<n) {
            adj[i] = ArrayList<IntArray>()
        }
        for (e in edges) {
            val u = e[0]
            val v = e[1]
            val w = e[2]
            adj[u].add(intArrayOf(v, w))
            adj[v].add(intArrayOf(u, w))
        }
        dist = IntArray(n)
        buildDist(0, -1, 0)
        var maxVal = 0
        for (`val` in nums) {
            if (`val` > maxVal) {
                maxVal = `val`
            }
        }
        lastOccur = IntArray(maxVal + 1)
        lastOccur.fill(-1)
        pathStack = ArrayList<Int>()
        minIndex = 0
        maxLen = 0
        minNodesForMaxLen = Int.Companion.MAX_VALUE
        dfs(0, -1)
        return intArrayOf(maxLen, minNodesForMaxLen)
    }

    private fun buildDist(u: Int, parent: Int, currDist: Int) {
        dist[u] = currDist
        for (edge in adj[u]) {
            val v = edge[0]
            val w = edge[1]
            if (v == parent) {
                continue
            }
            buildDist(v, u, currDist + w)
        }
    }

    private fun dfs(u: Int, parent: Int) {
        val stackPos = pathStack.size
        pathStack.add(u)
        val `val` = nums[u]
        val oldPos = lastOccur[`val`]
        val oldMinIndex = minIndex
        lastOccur[`val`] = stackPos
        if (oldPos >= minIndex) {
            minIndex = oldPos + 1
        }
        if (minIndex <= stackPos) {
            val ancestor = pathStack[minIndex]
            val pathLength = dist[u] - dist[ancestor]
            val pathNodes = stackPos - minIndex + 1
            if (pathLength > maxLen) {
                maxLen = pathLength
                minNodesForMaxLen = pathNodes
            } else if (pathLength == maxLen && pathNodes < minNodesForMaxLen) {
                minNodesForMaxLen = pathNodes
            }
        }
        for (edge in adj[u]) {
            val v = edge[0]
            if (v == parent) {
                continue
            }
            dfs(v, u)
        }
        pathStack.removeAt(pathStack.size - 1)
        lastOccur[`val`] = oldPos
        minIndex = oldMinIndex
    }
}
