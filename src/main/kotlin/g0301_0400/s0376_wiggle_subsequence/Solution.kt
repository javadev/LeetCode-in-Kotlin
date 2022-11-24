package g0301_0400.s0376_wiggle_subsequence

// #Medium #Array #Dynamic_Programming #Greedy #Dynamic_Programming_I_Day_18
// #2022_11_22_Time_162_ms_(88.89%)_Space_33.6_MB_(100.00%)

class Solution {
    fun wiggleMaxLength(nums: IntArray): Int {
        var lt = 1
        var gt = 1
        for (i in 1 until nums.size) {
            if (nums[i - 1] < nums[i]) {
                lt = gt + 1
            } else if (nums[i - 1] > nums[i]) {
                gt = lt + 1
            }
        }
        return Math.max(lt, gt)
    }
}
