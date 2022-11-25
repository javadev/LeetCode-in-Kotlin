package g0301_0400.s0390_elimination_game

// #Medium #Math #Recursion #2022_11_24_Time_319_ms_(55.56%)_Space_35.5_MB_(33.33%)

class Solution {
    fun lastRemaining(n: Int): Int {
        return if (n == 1) 1 else 2 * (n / 2 - lastRemaining(n / 2) + 1)
    }
}