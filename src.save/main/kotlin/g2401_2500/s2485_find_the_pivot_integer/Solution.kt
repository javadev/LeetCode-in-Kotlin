package g2401_2500.s2485_find_the_pivot_integer

// #Easy #Math #Prefix_Sum #2023_07_05_Time_134_ms_(100.00%)_Space_32.7_MB_(88.89%)

class Solution {
    fun pivotInteger(n: Int): Int {
        if (n == 0 || n == 1) {
            return n
        }
        var sum = 0
        for (i in 1..n) {
            sum += i
        }
        var ad = 0
        for (i in 1..n) {
            ad += i - 1
            sum -= i
            if (sum == ad) {
                return i
            }
        }
        return -1
    }
}
