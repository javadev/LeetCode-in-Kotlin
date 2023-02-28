package g0301_0400.s0343_integer_break

// #Medium #Dynamic_Programming #Math #Algorithm_II_Day_18_Dynamic_Programming
// #Dynamic_Programming_I_Day_21 #2022_11_17_Time_218_ms_(63.89%)_Space_33.5_MB_(66.67%)

class Solution {
    fun integerBreak(n: Int): Int {
        if (n <= 1) return 0
        if (n == 2) return 1
        if (n == 3) return 2

        var threes = n / 3

        // if there's just 1 remaining, it's better to use 2 x 2's instead of 3 and 1:
        if (n - threes * 3 == 1) threes--
        val twos = (n - threes * 3) / 2

        val threeProd = Math.pow(3.0, threes.toDouble()).toInt()
        val twoProd = Math.pow(2.0, twos.toDouble()).toInt()
        if (threeProd == 0) return twoProd
        if (twoProd == 0) return threeProd

        return twoProd * threeProd
    }
}
