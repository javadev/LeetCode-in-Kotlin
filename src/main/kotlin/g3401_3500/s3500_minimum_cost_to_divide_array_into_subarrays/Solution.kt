package g3401_3500.s3500_minimum_cost_to_divide_array_into_subarrays

// #Hard #2025_03_30_Time_200_ms_(100.00%)_Space_88.62_MB_(_%)

class Solution {
    fun minimumCost(nums: IntArray, cost: IntArray, k: Int): Long {
        val n = nums.size
        val prefixNums = LongArray(n)
        var total: Long = 0
        for (i in 0..<n) {
            total += nums[i].toLong()
            prefixNums[i] = total
        }
        val prefixCost = LongArray(n + 1)
        total = 0
        for (i in 0..<n) {
            total += cost[i].toLong()
            prefixCost[i + 1] = total
        }
        val memo: Array<LongArray> = Array<LongArray>(n) { LongArray(n + 1) }
        for (row in memo) {
            row.fill(-1)
        }
        val bestSplit = IntArray(n)
        bestSplit.fill(-1)
        return rec(0, 1, nums, prefixNums, prefixCost, k, memo, bestSplit)
    }

    private fun rec(
        index: Int,
        i: Int,
        nums: IntArray,
        prefixNums: LongArray,
        prefixCost: LongArray,
        k: Int,
        memo: Array<LongArray>,
        bestSplit: IntArray,
    ): Long {
        val n = nums.size
        if (index == n) {
            return 0
        }
        if (memo[index][i] != -1L) {
            return memo[index][i]
        }
        if (bestSplit[index] != -1) {
            val j = bestSplit[index]
            val `val` =
                (
                    (prefixNums[j] + k.toLong() * i) * (prefixCost[j + 1] - prefixCost[index]) +
                        rec(j + 1, i + 1, nums, prefixNums, prefixCost, k, memo, bestSplit)
                    )
            memo[index][i] = `val`
            return `val`
        }
        var best = Long.Companion.MAX_VALUE
        var bestIndex = -1
        for (j in index..<n) {
            val `val` =
                (
                    (prefixNums[j] + k.toLong() * i) * (prefixCost[j + 1] - prefixCost[index]) +
                        rec(j + 1, i + 1, nums, prefixNums, prefixCost, k, memo, bestSplit)
                    )
            if (`val` < best) {
                best = `val`
                bestIndex = j
            }
        }
        bestSplit[index] = bestIndex
        memo[index][i] = best
        return best
    }
}
