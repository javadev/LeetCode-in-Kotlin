package g0101_0200.s0164_maximum_gap

import java.util.Arrays

class Solution {
    fun maximumGap(nums: IntArray): Int {
        if (nums.size < 2) {
            return 0
        }
        var ret = Int.MIN_VALUE
        Arrays.sort(nums)
        for (i in 0 until nums.size - 1) {
            if (nums[i + 1] - nums[i] > ret) {
                ret = nums[i + 1] - nums[i]
            }
        }
        return ret
    }
}
