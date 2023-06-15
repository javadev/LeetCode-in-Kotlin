package g1601_1700.s1681_minimum_incompatibility

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2023_06_15_Time_162_ms_(100.00%)_Space_36_MB_(100.00%)

class Solution {
    private class Node {
        var visited: BooleanArray = BooleanArray(17)
        var size = 0
        var min = 20
        var max = 0
    }

    private lateinit var nodes: Array<Node?>
    private var size = 0
    private var result = 1000000
    private var currentSum = 0

    fun minimumIncompatibility(nums: IntArray, k: Int): Int {
        size = nums.size / k
        nodes = arrayOfNulls(k)
        for (i in 0 until k) {
            nodes[i] = Node()
        }
        nums.sort()
        currentSum = 0
        solve(nums, 0)
        return if (result == 1000000) -1 else result
    }

    private fun solve(nums: IntArray, idx: Int) {
        if (idx == nums.size) {
            result = currentSum
            return
        }
        var minSize = size
        var prevMin: Int
        var prevMax: Int
        var diff: Int
        for (node in nodes) {
            if (node!!.size == minSize || node.visited[nums[idx]]) {
                continue
            }
            minSize = node.size
            prevMin = node.min
            prevMax = node.max
            diff = prevMax - prevMin
            node.min = Math.min(node.min, nums[idx])
            node.max = Math.max(node.max, nums[idx])
            node.size++
            node.visited[nums[idx]] = true
            currentSum += if (prevMin == 20) {
                node.max - node.min
            } else {
                node.max - node.min - diff
            }
            if (currentSum < result) {
                solve(nums, idx + 1)
            }
            currentSum -= if (prevMin == 20) {
                node.max - node.min
            } else {
                node.max - node.min - diff
            }
            node.visited[nums[idx]] = false
            node.size--
            node.min = prevMin
            node.max = prevMax
        }
    }
}
