package g2601_2700.s2659_make_array_empty

// #Hard #Array #Sorting #Greedy #Binary_Search #Ordered_Set #Segment_Tree #Binary_Indexed_Tree
// #2023_07_21_Time_728_ms_(100.00%)_Space_71_MB_(100.00%)

class Solution {
    fun countOperationsToEmptyArray(nums: IntArray): Long {
        val sortNums = Array(nums.size) { IntArray(2) }
        for (i in nums.indices) {
            sortNums[i][0] = nums[i]
            sortNums[i][1] = i
        }
        sortNums.sortBy { it[0] }
        var res = 0L + nums.size
        for (i in 1..sortNums.lastIndex) {
            if (sortNums[i - 1][1] > sortNums[i][1]) {
                res += nums.size - i
            }
        }
        return res
    }
}
