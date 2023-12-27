package g2901_3000.s2913_subarrays_distinct_element_sum_of_squares_i

// #Easy #Array #Hash_Table #2023_12_27_Time_184_ms_(95.74%)_Space_36.9_MB_(97.87%)

class Solution {
    fun sumCounts(nums: List<Int>): Int {
        val n = nums.size
        if (n == 1) {
            return 1
        }
        val numsArr = IntArray(n)
        for (i in 0 until n) {
            numsArr[i] = nums[i]
        }
        val prev = IntArray(n)
        val foundAt = IntArray(101)
        var dupFound = false
        var j = 0
        while (j < n) {
            if (((foundAt[numsArr[j]] - 1).also { prev[j] = it }) >= 0) {
                dupFound = true
            }
            foundAt[numsArr[j]] = ++j
        }
        if (!dupFound) {
            return (((((n + 4) * n + 5) * n) + 2) * n) / 12
        }
        var result = 0
        for (start in n - 1 downTo 0) {
            var distinctCount = 0
            for (i in start until n) {
                if (prev[i] < start) {
                    distinctCount++
                }
                result += distinctCount * distinctCount
            }
        }
        return result
    }
}
