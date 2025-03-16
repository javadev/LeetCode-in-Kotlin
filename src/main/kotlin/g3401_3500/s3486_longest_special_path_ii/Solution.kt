package g3401_3500.s3486_longest_special_path_ii

// #Hard #2025_03_16_Time_255_ms_(100.00%)_Space_125.42_MB_(100.00%)

@Suppress("kotlin:S107")
class Solution {
    fun longestSpecialPath(edges: Array<IntArray>, nums: IntArray): IntArray {
        val ans = intArrayOf(0, 1)
        val graph: MutableMap<Int, MutableList<IntArray>> = HashMap<Int, MutableList<IntArray>>()
        for (edge in edges) {
            val a = edge[0]
            val b = edge[1]
            val c = edge[2]
            graph.computeIfAbsent(a) { _: Int -> ArrayList<IntArray>() }
                .add(intArrayOf(b, c))
            graph.computeIfAbsent(b) { _: Int -> ArrayList<IntArray>() }
                .add(intArrayOf(a, c))
        }
        val costs: MutableList<Int> = ArrayList<Int>()
        val last: MutableMap<Int, Int> = HashMap<Int, Int>()
        dfs(0, 0, -1, ArrayList<Int>(mutableListOf<Int>(0, 0)), nums, graph, costs, last, ans)
        return ans
    }

    private fun dfs(
        node: Int,
        currCost: Int,
        prev: Int,
        left: MutableList<Int>,
        nums: IntArray,
        graph: MutableMap<Int, MutableList<IntArray>>,
        costs: MutableList<Int>,
        last: MutableMap<Int, Int>,
        ans: IntArray,
    ) {
        val nodeColorIndexPrev: Int = last.getOrDefault(nums[node], -1)
        last.put(nums[node], costs.size)
        costs.add(currCost)
        val diff = currCost - costs[left[0]]
        val length = costs.size - left[0]
        if (diff > ans[0] || (diff == ans[0] && length < ans[1])) {
            ans[0] = diff
            ans[1] = length
        }
        for (next in graph.getOrDefault(node, ArrayList<IntArray>())) {
            val nextNode = next[0]
            val nextCost = next[1]
            if (nextNode == prev) {
                continue
            }
            val nextLeft: MutableList<Int> = ArrayList<Int>(left)
            if (last.containsKey(nums[nextNode])) {
                nextLeft.add(last[nums[nextNode]]!! + 1)
            }
            nextLeft.sortWith(Comparator.naturalOrder<Int?>())
            while (nextLeft.size > 2) {
                nextLeft.removeAt(0)
            }
            dfs(nextNode, currCost + nextCost, node, nextLeft, nums, graph, costs, last, ans)
        }
        last.put(nums[node], nodeColorIndexPrev)
        costs.removeAt(costs.size - 1)
    }
}
