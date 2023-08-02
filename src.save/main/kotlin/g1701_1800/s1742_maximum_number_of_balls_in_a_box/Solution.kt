package g1701_1800.s1742_maximum_number_of_balls_in_a_box

// #Easy #Hash_Table #Math #Counting #2023_06_16_Time_125_ms_(100.00%)_Space_33_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countBalls(lowLimit: Int, highLimit: Int): Int {
        var maxValue: Int
        val countArray = IntArray(46)
        var currentSum: Int = getDigitSum(lowLimit)
        countArray[currentSum]++
        maxValue = 1
        for (i in lowLimit + 1..highLimit) {
            if (i % 10 == 0) {
                currentSum = getDigitSum(i)
            } else {
                currentSum++
            }
            countArray[currentSum]++
            if (countArray[currentSum] > maxValue) {
                maxValue = countArray[currentSum]
            }
        }
        return maxValue
    }

    private fun getDigitSum(num: Int): Int {
        var num: Int = num
        var currentSum = 0
        while (num > 0) {
            currentSum += num % 10
            num /= 10
        }
        return currentSum
    }
}
