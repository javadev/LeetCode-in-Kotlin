package g1901_2000.s1927_sum_game

// #Medium #Math #Greedy #Game_Theory #2023_06_20_Time_211_ms_(100.00%)_Space_37.7_MB_(100.00%)

class Solution {
    fun sumGame(num: String): Boolean {
        var count = 0
        var diff = 0
        val l = num.length
        for (i in 0 until num.length) {
            if (num[i] == '?') {
                count += if (i < l / 2) 1 else -1
            } else {
                if (i < l / 2) {
                    diff += num[i].code - '0'.code
                } else {
                    diff -= num[i].code - '0'.code
                }
            }
        }
        return diff * 2 != -9 * count
    }
}
