package g0501_0600.s0507_perfect_number

// #Easy #Math #2023_01_06_Time_172_ms_(81.82%)_Space_34.1_MB_(18.18%)

class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var s = 1
        for (sq in Math.sqrt(num.toDouble()).toInt() downTo 2) {
            if (num % sq == 0) {
                s += sq + num / sq
            }
        }
        return num != 1 && s == num
    }
}
