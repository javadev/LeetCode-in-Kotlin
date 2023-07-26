package g2601_2700.s2672_number_of_adjacent_elements_with_the_same_color

// #Medium #Array #2023_07_26_Time_1208_ms_(100.00%)_Space_116_MB_(25.00%)

class Solution {
    fun colorTheArray(n: Int, queries: Array<IntArray>): IntArray {
        val nums = IntArray(n)
        val res = IntArray(queries.size)
        var count = 0
        for ((i, q) in queries.withIndex()) {
            val (e, c) = q
            if (e > 0 && nums[e] != 0 && nums[e - 1] == nums[e]) count--
            if (e < n - 1 && nums[e] != 0 && nums[e + 1] == nums[e]) count--
            nums[e] = c
            if (e > 0 && nums[e] != 0 && nums[e - 1] == nums[e]) count++
            if (e < n - 1 && nums[e] != 0 && nums[e + 1] == nums[e]) count++
            res[i] = count
        }
        return res
    }
}
