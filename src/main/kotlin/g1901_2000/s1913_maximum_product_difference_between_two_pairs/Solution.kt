package g1901_2000.s1913_maximum_product_difference_between_two_pairs

// #Easy #Array #Sorting
class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        nums.sort()
        val len = nums.size
        return nums[len - 1] * nums[len - 2] - nums[0] * nums[1]
    }
}
