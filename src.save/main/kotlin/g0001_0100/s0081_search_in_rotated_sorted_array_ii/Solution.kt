package g0001_0100.s0081_search_in_rotated_sorted_array_ii

// #Medium #Array #Binary_Search #Binary_Search_II_Day_12
// #2022_09_25_Time_352_ms_(42.31%)_Space_37.5_MB_(88.46%)

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
