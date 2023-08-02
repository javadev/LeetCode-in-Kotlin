package g0001_0100.s0081_search_in_rotated_sorted_array_ii

// #Medium #Array #Binary_Search #Binary_Search_II_Day_12
// #2023_07_10_Time_170_ms_(96.30%)_Space_36.5_MB_(96.30%)

class Solution {
    fun search(nums: IntArray, target: Int): Boolean {
        return binary(nums, 0, nums.size - 1, target)
    }

    private fun binary(a: IntArray, i: Int, j: Int, t: Int): Boolean {
        if (i > j) {
            return false
        }
        val mid = (i + j) / 2
        if (a[mid] == t) {
            return true
        }
        val c1 = binary(a, i, mid - 1, t)
        val c2 = binary(a, mid + 1, j, t)
        return c1 || c2
    }
}
