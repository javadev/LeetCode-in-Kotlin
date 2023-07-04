package g2401_2500.s2455_average_value_of_even_numbers_that_are_divisible_by_three

// #Easy #Array #Math
class Solution {
    fun averageValue(nums: IntArray): Int {
        var count = 0
        var sum = 0
        for (num in nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                count++
                sum += num
            }
        }
        return if (count == 0) {
            0
        } else sum / count
    }
}
