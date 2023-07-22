package g2001_2100.s2089_find_target_indices_after_sorting_array

// #Easy #Array #Sorting #Binary_Search #2023_06_27_Time_180_ms_(90.48%)_Space_36.5_MB_(100.00%)

class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        var count = 0
        var lessthan = 0
        for (n in nums) {
            if (n == target) {
                count++
            }
            if (n < target) {
                lessthan++
            }
        }
        val result: MutableList<Int> = ArrayList()
        for (i in 0 until count) {
            result.add(lessthan++)
        }
        return result
    }
}
