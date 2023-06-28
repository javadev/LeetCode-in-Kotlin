package g2201_2300.s2259_remove_digit_from_number_to_maximize_result

// #Easy #String #Greedy #Enumeration
class Solution {
    fun removeDigit(number: String, digit: Char): String {
        var number = number
        var index = 0
        val n = number.length
        for (i in 0 until n) {
            if (number[i] == digit) {
                index = i
                if (i < n - 1 && digit < number[i + 1]) {
                    break
                }
            }
        }
        number = number.substring(0, index) + number.substring(index + 1)
        return number
    }
}
