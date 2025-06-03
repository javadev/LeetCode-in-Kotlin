package g3501_3600.s3566_partition_array_into_two_equal_product_subsets

// #Medium #Array #Bit_Manipulation #Recursion #Enumeration
// #2025_06_01_Time_1_ms_(100.00%)_Space_42.26_MB_(100.00%)

class Solution {
    fun checkEqualPartitions(nums: IntArray, target: Long): Boolean {
        for (num in nums) {
            if (target % num != 0L) {
                return false
            }
        }
        var pro: Long = 1
        for (n in nums) {
            pro *= n
        }
        return pro == target * target
    }
}
