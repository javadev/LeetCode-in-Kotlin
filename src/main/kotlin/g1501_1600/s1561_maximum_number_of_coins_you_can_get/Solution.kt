package g1501_1600.s1561_maximum_number_of_coins_you_can_get

// #Medium #Array #Math #Sorting #Greedy #Game_Theory
// #2023_06_13_Time_515_ms_(50.00%)_Space_52.6_MB_(50.00%)

class Solution {
    fun maxCoins(piles: IntArray): Int {
        piles.sort()
        var j = 0
        var coins = 0
        var i = piles.size - 2
        while (i > 0) {
            coins += piles[i]
            if (++j == piles.size / 3) {
                return coins
            }
            i -= 2
        }
        return coins
    }
}
