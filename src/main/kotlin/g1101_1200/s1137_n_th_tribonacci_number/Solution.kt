package g1101_1200.s1137_n_th_tribonacci_number

// #Easy #Dynamic_Programming #Math #Memoization #LeetCode_75_DP/1D #Dynamic_Programming_I_Day_1
// #2023_05_31_Time_122_ms_(69.35%)_Space_33.6_MB_(64.52%)

class Solution {
    fun tribonacci(n: Int): Int {
        return if (n == 0) {
            0
        } else if (n <= 2) {
            1
        } else {
            var tn = 0
            var tn1 = 1
            var tn2 = 1
            var tmp = 0
            for (i in 3..n) {
                tmp = tn + tn1 + tn2
                tn = tn1
                tn1 = tn2
                tn2 = tmp
            }
            tmp
        }
    }
}
