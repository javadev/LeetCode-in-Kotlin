package g2601_2700.s2614_prime_in_diagonal

// #Easy #Array #Math #Matrix #Number_Theory
// #2023_07_14_Time_465_ms_(100.00%)_Space_60.4_MB_(80.00%)

class Solution {
    fun diagonalPrime(nums: Array<IntArray>): Int {
        var i = 0
        var j = nums[0].size - 1
        var lp = 0
        while (i < nums.size) {
            val n1 = nums[i][i]
            if (n1 > lp && isPrime(n1)) {
                lp = n1
            }
            val n2 = nums[i][j]
            if (n2 > lp && isPrime(n2)) {
                lp = n2
            }
            i++
            j--
        }
        return lp
    }

    private fun isPrime(n: Int): Boolean {
        if (n == 1) {
            return false
        }
        if (n == 2 || n == 3) {
            return true
        }
        var i = 2
        while (i <= Math.sqrt(n.toDouble())) {
            if (n % i == 0) {
                return false
            }
            i++
        }
        return true
    }
}
