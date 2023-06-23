package g2001_2100.s2029_stone_game_ix

// #Medium #Array #Math #Greedy #Counting #Game_Theory
// #2023_06_23_Time_574_ms_(100.00%)_Space_53.4_MB_(100.00%)

class Solution {
    fun stoneGameIX(stones: IntArray): Boolean {
        var zero = 0
        var one = 0
        var two = 0
        for (i in stones) {
            if (i % 3 == 0) {
                zero++
            } else if (i % 3 == 1) {
                one++
            } else if (i % 3 == 2) {
                two++
            }
        }
        if (one == 0 && two == 0) {
            return false
        }
        val max = Math.max(one, two)
        val min = Math.min(one, two)
        if (zero % 2 == 0) {
            return min != 0
        }
        return if (zero % 2 == 1) {
            max - 2 > min
        } else false
    }
}
