package g2601_2700.s2640_find_the_score_of_all_prefixes_of_an_array

// #Medium #Array #Prefix_Sum #2023_07_18_Time_587_ms_(100.00%)_Space_58.4_MB_(100.00%)

class Solution {
    fun findPrefixScore(nums: IntArray): LongArray {
        var max = Integer.MIN_VALUE
        var sum = 0L
        val res = LongArray(nums.size)
        for (i in 0 until nums.size) {
            val curr = nums[i]
            max = maxOf(max, curr)
            sum += max + curr
            res[i] = sum
        }
        return res
    }
}
