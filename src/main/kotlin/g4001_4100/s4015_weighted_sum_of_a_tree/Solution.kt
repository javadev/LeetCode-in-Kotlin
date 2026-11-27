package g4001_4100.s4015_weighted_sum_of_a_tree

// #Medium #Array #Depth_First_Search #Tree #Senior #Weekly_Contest_514
// #2026_11_19_Time_5_ms_(100.00%)_Space_107.29_MB_(94.38%)

import kotlin.math.max

class Solution {
    fun weightedSum(parent: IntArray, nums: IntArray): Long {
        val n = parent.size
        val depth = IntArray(n)
        depth[0] = 1
        for (i in 1..<n) {
            if (depth[i] != 0) {
                continue
            }
            var currDepth = getDepth(parent, depth, i)
            var curr = i
            while (depth[curr] == 0) {
                depth[curr] = currDepth
                curr = parent[curr]
                currDepth -= 1
            }
        }
        var res: Long = 0
        var height = 0
        for (i in 0..<n) {
            height = max(height, depth[i])
        }
        for (i in 0..<n) {
            res += (height - depth[i] + 1).toLong() * nums[i]
        }
        return res
    }

    private fun getDepth(parent: IntArray, currDepth: IntArray, node: Int): Int {
        var node = node
        var add = 0
        while (currDepth[node] == 0) {
            node = parent[node]
            add += 1
        }
        return currDepth[node] + add
    }
}
