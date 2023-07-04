package g2501_2600.s2529_maximum_count_of_positive_integer_and_negative_integer

// #Easy #Array #Binary_Search #Counting
class Solution {
    fun maximumCount(nums: IntArray): Int {
        var plus = 0
        var minus = 0
        for (num in nums) {
            if (num > 0) {
                plus++
            }
            if (num < 0) {
                minus++
            }
        }
        return Math.max(plus, minus)
    }
}
