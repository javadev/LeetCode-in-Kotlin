package g1901_2000.s1913_maximum_product_difference_between_two_pairs

// #Easy #Array #Sorting #2023_06_20_Time_261_ms_(100.00%)_Space_39.3_MB_(80.00%)

class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        nums.sort()
        val len = nums.size
        return nums[len - 1] * nums[len - 2] - nums[0] * nums[1]
    }
}
