package g1801_1900.s1802_maximum_value_at_a_given_index_in_a_bounded_array

// #Medium #Greedy #Binary_Search #Binary_Search_II_Day_17
// #2023_06_19_Time_118_ms_(100.00%)_Space_33.8_MB_(13.82%)

class Solution {
    private fun isPossible(n: Int, index: Int, maxSum: Int, value: Int): Boolean {
        val leftValue = (value - index).coerceAtLeast(0)
        val rightValue = (value - (n - 1 - index)).coerceAtLeast(0)
        val sumBefore = (value + leftValue).toLong() * (value - leftValue + 1) / 2
        val sumAfter = (value + rightValue).toLong() * (value - rightValue + 1) / 2
        return sumBefore + sumAfter - value <= maxSum
    }

    fun maxValue(n: Int, index: Int, maxSum: Int): Int {
        var left = 0
        var right = maxSum - n
        while (left < right) {
            val middle = (left + right + 1) / 2
            if (isPossible(n, index, maxSum - n, middle)) {
                left = middle
            } else {
                right = middle - 1
            }
        }
        return left + 1
    }
}
