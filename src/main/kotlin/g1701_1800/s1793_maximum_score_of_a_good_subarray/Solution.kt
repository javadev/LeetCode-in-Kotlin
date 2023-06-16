package g1701_1800.s1793_maximum_score_of_a_good_subarray

// #Hard #Array #Binary_Search #Two_Pointers #Stack #Monotonic_Stack
class Solution {
    fun maximumScore(nums: IntArray, k: Int): Int {
        var i = k
        var j = k
        var res = nums[k]
        var min = nums[k]
        var goLeft: Boolean
        while (i >= 1 || j < nums.size - 1) {
            // sub array [i...j] is already traversed. Either goLeft or goRight to increase the
            // sequence
            goLeft = if (i == 0) {
                false
            } else if (j == nums.size - 1) {
                true
            } else {
                nums[j + 1] <= nums[i - 1]
            }
            min = if (goLeft) Math.min(min, nums[i - 1]) else Math.min(min, nums[j + 1])
            if (goLeft) {
                while (i >= 1 && min <= nums[i - 1]) {
                    i--
                }
            } else {
                while (j < nums.size - 1 && min <= nums[j + 1]) {
                    j++
                }
            }
            res = Math.max(res, min * (j - i + 1))
        }
        return res
    }
}
