package g0501_0600.s0509_fibonacci_number

// #Easy #Dynamic_Programming #Math #Recursion #Memoization #Dynamic_Programming_I_Day_1
// #Level_1_Day_10_Dynamic_Programming #Udemy_Dynamic_Programming
// #2023_01_10_Time_139_ms_(82.72%)_Space_32.6_MB_(92.35%)

class Solution {
    private val memo = IntArray(31)

    fun fib(n: Int): Int {
        if (n == 0) {
            return 0
        }
        if (n == 1) {
            return 1
        }
        if (memo[n] != 0) {
            return memo[n]
        }
        memo[n] = fib(n - 1) + fib(n - 2)
        return memo[n]
    }
}
