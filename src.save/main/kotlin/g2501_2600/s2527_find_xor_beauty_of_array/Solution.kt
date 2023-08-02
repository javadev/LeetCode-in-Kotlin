package g2501_2600.s2527_find_xor_beauty_of_array

// #Medium #Array #Math #Bit_Manipulation #2023_07_04_Time_434_ms_(100.00%)_Space_64.2_MB_(100.00%)

class Solution {
    fun xorBeauty(nums: IntArray): Int {
        var i = 1
        while (i < nums.size) {
            nums[0] = nums[0] xor nums[i]
            i++
        }
        return nums[0]
    }
}
