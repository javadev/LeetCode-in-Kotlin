package g0801_0900.s0877_stone_game

// #Medium #Array #Dynamic_Programming #Math #Game_Theory
// #2023_04_08_Time_136_ms_(88.24%)_Space_33.9_MB_(52.94%)

class Solution {
    fun stoneGame(piles: IntArray): Boolean {
        var low = 0
        var high = piles.size - 1
        var alice = 0
        var bob = 0
        while (low < high) {
            alice += piles[low].coerceAtLeast(piles[high])
            bob += piles[low].coerceAtMost(piles[high])
            low++
            high--
        }
        return alice > bob
    }
}
