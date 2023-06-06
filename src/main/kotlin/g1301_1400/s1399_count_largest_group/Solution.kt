package g1301_1400.s1399_count_largest_group

// #Easy #Hash_Table #Math #2023_06_06_Time_136_ms_(100.00%)_Space_32.9_MB_(100.00%)

class Solution {
    fun countLargestGroup(n: Int): Int {
        var largest = 0
        val map = IntArray(37)
        var sumOfDigit = 0
        for (i in 1..n) {
            if (i % 10 == 0) {
                // reset and start a new sum
                sumOfDigit = getSumOfDigits(i)
            } else {
                sumOfDigit++
            }
            val `val` = ++map[sumOfDigit]
            largest = if (`val` > largest) `val` else largest
        }
        return countLargestGroup(largest, map)
    }

    private fun countLargestGroup(largest: Int, arr: IntArray): Int {
        var count = 0
        for (`val` in arr) {
            if (`val` == largest) {
                count++
            }
        }
        return count
    }

    private fun getSumOfDigits(num: Int): Int {
        var num = num
        var sum = 0
        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        return sum
    }
}
