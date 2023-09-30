package g0001_0100.s0031_next_permutation

// #Medium #Top_100_Liked_Questions #Array #Two_Pointers #Big_O_Time_O(n)_Space_O(1)
// #2023_07_05_Time_205_ms_(48.21%)_Space_36.6_MB_(87.50%)

class Solution {
    fun nextPermutation(nums: IntArray) {
        var i = nums.size - 2
        while (i >= 0 && nums[i + 1] <= nums[i]) { i-- }
        if (i >= 0) {
            var j = nums.size - 1
            while (j >= i + 1 && nums[i] >= nums[j]) { j-- }
            nums[i] = nums[j].also { nums[j] = nums[i] }
        }
        var l = i + 1
        var r = nums.size - 1
        while (l < r) {
            nums[l] = nums[r].also { nums[r] = nums[l] }
            l++
            r--
        }
    }
}
