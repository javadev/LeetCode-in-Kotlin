package g2301_2400.s2389_longest_subsequence_with_limited_sum

// #Easy #Array #Sorting #Greedy #Binary_Search #Prefix_Sum
// #2023_07_02_Time_257_ms_(80.00%)_Space_40_MB_(66.67%)

class Solution {
    fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
        // we can sort the nums because the order of the subsequence does not matter
        nums.sort()
        for (i in 1 until nums.size) {
            nums[i] = nums[i] + nums[i - 1]
        }
        for (i in queries.indices) {
            var j = nums.binarySearch(queries[i])
            if (j < 0) {
                j = -j - 2
            }
            queries[i] = j + 1
        }
        return queries
    }
}
