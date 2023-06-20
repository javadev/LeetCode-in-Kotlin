package g1901_2000.s1952_three_divisors

// #Easy #Math
class Solution {
    fun isThree(n: Int): Boolean {
        var divisors = 0
        for (i in 1..n) {
            if (n % i == 0) {
                divisors++
            }
        }
        return divisors == 3
    }
}
