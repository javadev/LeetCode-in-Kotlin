package g3001_3100.s3099_harshad_number

// #Easy #Math #2024_04_20_Time_119_ms_(82.67%)_Space_33.2_MB_(45.33%)

class Solution {
    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
        var sum = 0
        var digit: Int
        var temp = x
        while (temp != 0) {
            digit = temp % 10
            sum += digit
            temp /= 10
        }
        if (sum != 0 && x % sum == 0) {
            return sum
        }
        return -1
    }
}
