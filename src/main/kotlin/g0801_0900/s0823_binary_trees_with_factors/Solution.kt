package g0801_0900.s0823_binary_trees_with_factors

// #Medium #Array #Hash_Table #Dynamic_Programming
// #2023_03_25_Time_298_ms_(100.00%)_Space_45.1_MB_(100.00%)dsecx

class Solution {
    private val dp: MutableMap<Int, Long> = HashMap()
    private val nums: MutableMap<Int, Int> = HashMap()
    fun numFactoredBinaryTrees(arr: IntArray): Int {
        arr.sort()
        for (i in arr.indices) {
            nums[arr[i]] = i
        }
        var ans: Long = 0
        for (i in arr.indices.reversed()) {
            ans = (ans % MOD + recursion(arr, arr[i], i) % MOD) % MOD
        }
        return ans.toInt()
    }

    private fun recursion(arr: IntArray, v: Int, idx: Int): Long {
        if (dp.containsKey(v)) {
            return dp[v]!!
        }
        var ret: Long = 1
        for (i in 0 until idx) {
            val child = arr[i]
            if (v % child == 0 && nums.containsKey(v / child)) {
                ret += (
                    (
                        recursion(arr, child, nums[arr[i]]!!) %
                            MOD
                            * recursion(arr, v / child, nums[v / child]!!) %
                            MOD
                        ) %
                        MOD
                    )
            }
        }
        dp[v] = ret
        return ret
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
