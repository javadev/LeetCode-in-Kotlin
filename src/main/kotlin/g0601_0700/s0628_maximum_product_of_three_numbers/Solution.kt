package g0601_0700.s0628_maximum_product_of_three_numbers

// #Easy #Array #Math #Sorting #2023_02_09_Time_276_ms_(97.30%)_Space_36.8_MB_(100.00%)

class Solution {
    fun maximumProduct(nums: IntArray): Int {
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var max3 = Int.MIN_VALUE
        for (i in nums) {
            if (i > max1) {
                max3 = max2
                max2 = max1
                max1 = i
            } else if (i > max2) {
                max3 = max2
                max2 = i
            } else if (i > max3) {
                max3 = i
            }
            if (i < min1) {
                min2 = min1
                min1 = i
            } else if (i < min2) {
                min2 = i
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3)
    }
}