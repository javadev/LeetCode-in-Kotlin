package g2301_2400.s2348_number_of_zero_filled_subarrays

// #Medium #Array #Math
class Solution {
    fun zeroFilledSubarray(nums: IntArray): Long {
        var cnt = 0L
        var local = 0L
        for (n in nums) {
            if (n == 0) {
                cnt += ++local
            } else {
                local = 0
            }
        }
        return cnt
    }
}
