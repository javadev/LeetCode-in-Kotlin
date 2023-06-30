package g2301_2400.s2317_maximum_xor_after_operations

// #Medium #Array #Math #Bit_Manipulation #2023_06_30_Time_373_ms_(100.00%)_Space_50_MB_(100.00%)

class Solution {
    fun maximumXOR(nums: IntArray): Int {
        var max = 0
        for (n in nums) {
            max = max or n
        }
        return max
    }
}
