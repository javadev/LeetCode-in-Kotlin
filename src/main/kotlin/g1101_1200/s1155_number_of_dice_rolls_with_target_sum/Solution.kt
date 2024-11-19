package g1101_1200.s1155_number_of_dice_rolls_with_target_sum

// #Medium #Dynamic_Programming #2023_05_25_Time_158_ms_(80.95%)_Space_37.7_MB_(23.81%)

class Solution {
    private var memo: Array<IntArray> = arrayOf()

    private var k = 0
    private fun dp(diceLeft: Int, targetLeft: Int): Int {
        if (diceLeft == 0) {
            return if (targetLeft == 0) {
                1
            } else {
                0
            }
        }
        if (memo[diceLeft][targetLeft] == -1) {
            var res = 0
            for (i in 1..Math.min(k, targetLeft)) {
                res += dp(diceLeft - 1, targetLeft - i)
                val modulo = 1000000007
                res %= modulo
            }
            memo[diceLeft][targetLeft] = res
        }
        return memo[diceLeft][targetLeft]
    }

    fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
        this.k = k
        memo = Array(n + 1) { IntArray(target + 1) }
        for (i in memo) {
            i.fill(-1)
        }
        return dp(n, target)
    }
}
