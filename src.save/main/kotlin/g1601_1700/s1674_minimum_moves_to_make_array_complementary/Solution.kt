package g1601_1700.s1674_minimum_moves_to_make_array_complementary

// #Medium #Array #Hash_Table #Prefix_Sum #2023_06_15_Time_522_ms_(100.00%)_Space_50.1_MB_(100.00%)

class Solution {
    fun minMoves(nums: IntArray, limit: Int): Int {
        val delta = IntArray(2 * limit + 2)
        val n = nums.size
        for (i in 0 until n / 2) {
            val a = nums[i]
            val b = nums[n - 1 - i]
            delta[2] += 2
            delta[Math.min(a, b) + 1]--
            delta[a + b]--
            delta[a + b + 1]++
            delta[Math.max(a, b) + limit + 1]++
        }
        var res = 2 * n
        var curr = 0
        for (i in 2..2 * limit) {
            curr += delta[i]
            res = Math.min(res, curr)
        }
        return res
    }
}
