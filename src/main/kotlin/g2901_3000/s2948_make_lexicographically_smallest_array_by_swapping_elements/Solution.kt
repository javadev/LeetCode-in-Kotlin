package g2901_3000.s2948_make_lexicographically_smallest_array_by_swapping_elements

// #Medium #Array #Sorting #Union_Find #2024_01_16_Time_928_ms_(94.59%)_Space_77.9_MB_(21.62%)

import kotlin.math.abs

class Solution {
    fun lexicographicallySmallestArray(nums: IntArray, limit: Int): IntArray {
        val n = nums.size
        val nodes = Array(n) { i -> Node(i, nums[i]) }
        nodes.sortWith { a: Node, b: Node ->
            Integer.signum(
                a.value - b.value
            )
        }
        var group = 1
        nodes[0].group = group
        for (i in 1 until n) {
            if (abs(nodes[i].value - nodes[i - 1].value) <= limit) {
                nodes[i].group = group
            } else {
                nodes[i].group = ++group
            }
        }
        val groupBase = IntArray(group + 1)
        for (i in n - 1 downTo 0) {
            groupBase[nodes[i].group] = i
        }
        val groupIndex = IntArray(n)
        for (node in nodes) {
            groupIndex[node.id] = node.group
        }
        val ans = IntArray(n)
        for (i in 0 until n) {
            val index = groupBase[groupIndex[i]]
            ans[i] = nodes[index].value
            groupBase[groupIndex[i]]++
        }
        return ans
    }

    private class Node(var id: Int, var value: Int) {
        var group: Int = 0
    }
}
