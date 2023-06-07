package g1401_1500.s1414_find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k

// #Medium #Greedy
class Solution {
    fun findMinFibonacciNumbers(k: Int): Int {
        val list: MutableList<Int> = ArrayList()
        list.add(1)
        list.add(1)
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
