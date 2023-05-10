package g0901_1000.s0985_sum_of_even_numbers_after_queries

// #Medium #Array #Simulation #2023_05_10_Time_497_ms_(71.43%)_Space_117.9_MB_(71.43%)

class Solution {
    fun sumEvenAfterQueries(nums: IntArray, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        var res = 0
        for (num in nums) {
            res += if (num and 1 == 0) num else 0
        }
        for ((k, query) in queries.withIndex()) {
            res -= if (nums[query[1]] and 1 == 0) nums[query[1]] else 0
            nums[query[1]] += query[0]
            if (nums[query[1]] and 1 == 0) {
                res += nums[query[1]]
            }
            result[k] = res
        }
        return result
    }
}
