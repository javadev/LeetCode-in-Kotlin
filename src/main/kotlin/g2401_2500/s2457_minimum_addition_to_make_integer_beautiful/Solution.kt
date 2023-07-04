package g2401_2500.s2457_minimum_addition_to_make_integer_beautiful

// #Medium #Math #Greedy
class Solution {
    fun makeIntegerBeautiful(n: Long, target: Int): Long {
        var n = n
        if (sumOfDigits(n) <= target) {
            return 0
        }
        val old = n
        var newNumber: Long = 1
        while (sumOfDigits(n) > target) {
            newNumber = newNumber * 10
            n = n / 10 + 1
        }
        newNumber = n * newNumber
        return newNumber - old
    }

    fun sumOfDigits(n: Long): Long {
        var n = n
        var sum: Long = 0
        while (n > 0) {
            sum = sum + n % 10
            n = n / 10
        }
        return sum
    }
}
