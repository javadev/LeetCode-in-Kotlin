package g2701_2800.s2750_ways_to_split_array_into_good_subarrays

// #Medium #Array #Dynamic_Programming #Math
// #2023_08_09_Time_916_ms_(100.00%)_Space_71.5_MB_(76.32%)

class Solution {
    fun numberOfGoodSubarraySplits(nums: IntArray): Int {
        val res: MutableList<Int> = ArrayList()
        val modulo = 1000000007L
        for (i in nums.indices) {
            if (nums[i] == 1) res.add(i)
        }
        var ans: Long = 0
        if (res.size > 0) ans = 1
        var kanishk = ans
        for (i in res.size - 2 downTo 0) {
            val leftInd = res[i]
            val rightInd = res[i + 1]
            val df = rightInd - leftInd
            val mul = df.toLong() % modulo * kanishk % modulo % modulo
            kanishk = mul
            ans = mul
        }
        return ans.toInt()
    }
}
