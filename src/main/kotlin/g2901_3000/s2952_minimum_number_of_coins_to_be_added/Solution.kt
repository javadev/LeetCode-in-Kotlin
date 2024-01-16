package g2901_3000.s2952_minimum_number_of_coins_to_be_added

// #Medium #Array #Sorting #Greedy #2024_01_16_Time_439_ms_(87.10%)_Space_59.3_MB_(61.29%)

class Solution {
    fun minimumAddedCoins(coins: IntArray, target: Int): Int {
        var res = 0
        var num = 0
        var i = 0
        coins.sort()
        while (num < target) {
            if (i < coins.size && coins[i] <= num + 1) {
                num += coins[i]
                i++
            } else {
                res += 1
                num += num + 1
            }
        }
        return res
    }
}
