package g2701_2800.s2772_apply_operations_to_make_all_array_elements_equal_to_zero

class Solution {
    fun checkArray(nums: IntArray, k: Int): Boolean {
        var cur = 0
        val n = nums.size
        for (i in 0 until n) {
            if (cur > nums[i]) {
                return false
            }
            nums[i] -= cur
            cur += nums[i]
            if (i >= k - 1) {
                cur -= nums[i - k + 1]
            }
        }
        return cur == 0
    }
}
