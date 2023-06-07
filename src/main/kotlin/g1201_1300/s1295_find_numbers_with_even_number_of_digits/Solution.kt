package g1201_1300.s1295_find_numbers_with_even_number_of_digits

// #Easy #Array

class Solution {
    fun findNumbers(nums: IntArray): Int {
        // initialising variable to hold number of digits and numbers having even number of digits
        var digitCount = 0
        var evendigitCount = 0
        // traversing through the array
        for (num in nums) {
            var number = num
            while (number != 0) {
                // counting digits for each number
                digitCount++
                number /= 10
            }
            // incrementing variable for numbers having even number of digits
            if (digitCount % 2 == 0) {
                evendigitCount++
            }
            // reassigning the value to reset digits for next number in iteration
            digitCount = 0
        }
        return evendigitCount
    }
}
