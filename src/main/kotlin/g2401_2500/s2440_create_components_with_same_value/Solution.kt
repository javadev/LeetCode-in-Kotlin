package g2401_2500.s2440_create_components_with_same_value

// #Hard #Array #Math #Depth_First_Search #Tree #Enumeration
// #2023_07_05_Time_751_ms_(100.00%)_Space_60.1_MB_(100.00%)

class Solution {
    private lateinit var nums: IntArray

    fun componentValue(nums: IntArray, edges: Array<IntArray>): Int {
        val n = nums.size
        this.nums = nums
        val graph: Array<MutableList<Int>> = Array(n) { ArrayList<Int>() }
        for (e in edges) {
            graph[e[0]].add(e[1])
            graph[e[1]].add(e[0])
        }
        var sum = 0
        for (i in nums) {
            sum += i
        }
        for (k in n downTo 1) {
            if (sum % k != 0) {
                continue
            }
            val ans = helper(graph, 0, -1, sum / k)
            if (ans == 0) {
                return k - 1
            }
        }
        return 0
    }

    private fun helper(graph: Array<MutableList<Int>>, i: Int, prev: Int, target: Int): Int {
        if (graph[i].size == 1 && graph[i][0] == prev) {
            if (nums[i] > target) {
                return -1
            }
            return if (nums[i] == target) {
                0
            } else nums[i]
        }
        var sum = nums[i]
        for (k in graph[i]) {
            if (k == prev) {
                continue
            }
            val ans = helper(graph, k, i, target)
            if (ans == -1) {
                return -1
            }
            sum += ans
        }
        if (sum > target) {
            return -1
        }
        return if (sum == target) {
            0
        } else sum
    }
}
