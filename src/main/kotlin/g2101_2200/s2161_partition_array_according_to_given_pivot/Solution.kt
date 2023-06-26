package g2101_2200.s2161_partition_array_according_to_given_pivot

// #Medium #Array #Two_Pointers #Simulation #2023_06_26_Time_859_ms_(46.15%)_Space_60_MB_(61.54%)

class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val ans = IntArray(nums.size)
        var point = 0
        var equal = 0
        for (i in nums) {
            if (i < pivot) {
                ans[point] = i
                ++point
            } else if (i == pivot) {
                ++equal
            }
        }
        while (equal > 0) {
            ans[point] = pivot
            ++point
            --equal
        }
        for (i in nums) {
            if (i > pivot) {
                ans[point] = i
                ++point
            }
        }
        return ans
    }
}
