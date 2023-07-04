package g2401_2500.s2485_find_the_pivot_integer

// #Easy #Math #Prefix_Sum
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
