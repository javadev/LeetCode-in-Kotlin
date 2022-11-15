package g0301_0400.s0334_increasing_triplet_subsequence

// #Medium #Top_Interview_Questions #Array #Greedy #Data_Structure_II_Day_5_Array
// #2022_11_15_Time_672_ms_(60.61%)_Space_128.6_MB_(5.23%)

class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        if (nums.size == 1) {
            return false
        }

        var big: Int = nums.lastIndex
        var medium: Int? = null

        for (i in nums.lastIndex - 1 downTo 0) {
            if (nums[i] > nums[big]) {
                big = i
                continue
            } else if ((medium != null && nums[i] > nums[medium!!] && nums[i] < nums[big]) || (medium == null && nums[i] < nums[big)) {
                medium = i
                continue
            } else if (medium != null && nums[i] < nums[medium]) {
                return true
            }
        }

        return false
    }
}
