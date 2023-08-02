package g2401_2500.s2412_minimum_money_required_before_transactions

// #Hard #Array #Sorting #Greedy #2023_07_03_Time_965_ms_(100.00%)_Space_90.5_MB_(100.00%)

class Solution {
    fun minimumMoney(transactions: Array<IntArray>): Long {
        var max = 0
        var sum: Long = 0
        for (transaction in transactions) {
            val diff = transaction[1] - transaction[0]
            if (diff < 0) {
                sum -= diff.toLong()
                transaction[0] += diff
            }
            max = max.coerceAtLeast(transaction[0])
        }
        return max + sum
    }
}
