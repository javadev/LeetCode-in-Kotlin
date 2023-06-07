package g1401_1500.s1414_find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k

// #Medium #Greedy #2023_06_07_Time_165_ms_(100.00%)_Space_35.1_MB_(100.00%)

class Solution {
    fun findMinFibonacciNumbers(k: Int): Int {
        val list: MutableList<Int> = mutableListOf(1, 1)
        var prev = 1
        var curr = 1
        while (prev <= k) {
            val n = prev + curr
            prev = curr
            curr = n
            list.add(n)
        }
        var count = 0
        var num = k
        for (i in list.indices.reversed()) {
            if (list[i] <= num) {
                count++
                num = num - list[i]
            }
        }
        return count
    }
}
