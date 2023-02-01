package g0401_0500.s0464_can_i_win

// #Medium #Dynamic_Programming #Math #Bit_Manipulation #Bitmask #Memoization #Game_Theory
// #2022_12_28_Time_213_ms_(100.00%)_Space_38.8_MB_(100.00%)

class Solution {
    fun canIWin(maxChoosableInteger: Int, desiredTotal: Int): Boolean {
        if (desiredTotal <= maxChoosableInteger) {
            return true
        }
        return if (1.0 * maxChoosableInteger * (1 + maxChoosableInteger) / 2 < desiredTotal) {
            false
        } else canWin(0, arrayOfNulls(1 shl maxChoosableInteger), desiredTotal, maxChoosableInteger)
    }

    private fun canWin(state: Int, dp: Array<Boolean?>, desiredTotal: Int, maxChoosableInteger: Int): Boolean {
        // state is the bitmap representation of the current state of choosable integers left
        // dp[state] represents whether the current player can win the game at state
        if (dp[state] != null) {
            return dp[state]!!
        }
        for (i in 1..maxChoosableInteger) {
            // current number to pick
            val cur = 1 shl i - 1
            if (cur and state == 0 &&
                (
                    i >= desiredTotal ||
                        !canWin(state or cur, dp, desiredTotal - i, maxChoosableInteger)
                    )
            ) {
                // i is greater than the desired total
                // or the other player cannot win after the current player picks i
                dp[state] = true
                return dp[state]!!
            }
        }
        dp[state] = false
        return dp[state]!!
    }
}
