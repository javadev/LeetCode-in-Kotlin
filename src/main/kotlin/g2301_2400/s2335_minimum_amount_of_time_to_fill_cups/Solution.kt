package g2301_2400.s2335_minimum_amount_of_time_to_fill_cups

// #Easy #Array #Greedy #Heap_Priority_Queue
// #2023_07_01_Time_140_ms_(100.00%)_Space_33.7_MB_(88.89%)

class Solution {
    fun fillCups(amount: IntArray): Int {
        amount.sort()
        val sum = amount[0] + amount[1] + amount[2]
        return if (amount[0] + amount[1] < amount[2]) amount[2] else (sum + 1) / 2
    }
}