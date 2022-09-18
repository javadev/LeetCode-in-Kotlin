package g0001_0100.s0031_next_permutation

// #Medium #Top_100_Liked_Questions #Array #Two_Pointers
// #2022_09_16_Time_219_ms_(89.22%)_Space_38.3_MB_(53.92%)

class Solution {
    fun nextPermutation(nums: IntArray?) {
        if (nums == null || nums.size <= 1) {
            return
        }
        var i = nums.size - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--
        }
        if (i >= 0) {
            var j = nums.size - 1
            while (nums[j] <= nums[i]) {
                j--
            }
            swap(nums, i, j)
        }
        reverse(nums, i + 1, nums.size - 1)
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    private fun reverse(nums: IntArray, i: Int, j: Int) {
        var i = i
        var j = j
        while (i < j) {
            swap(nums, i++, j--)
        }
    }
}
