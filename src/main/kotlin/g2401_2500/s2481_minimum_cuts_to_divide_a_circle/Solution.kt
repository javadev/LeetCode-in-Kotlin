package g2401_2500.s2481_minimum_cuts_to_divide_a_circle

// #Easy #Math #Geometry
class Solution {
    fun numberOfCuts(n: Int): Int {
        if (n == 1) {
            return 0
        }
        return if (n % 2 > 0) n else n / 2
    }
}
