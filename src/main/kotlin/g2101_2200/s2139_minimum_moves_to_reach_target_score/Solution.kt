package g2101_2200.s2139_minimum_moves_to_reach_target_score

// #Medium #Math #Greedy #2023_06_25_Time_123_ms_(100.00%)_Space_33.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minMoves(target: Int, maxDoubles: Int): Int {
        var target = target
        var maxDoubles = maxDoubles
        var count = 0
        while (target > 1) {
            if (maxDoubles > 0 && target % 2 == 0) {
                maxDoubles--
                target /= 2
            } else {
                if (maxDoubles == 0) {
                    count = count + target - 1
                    return count
                } else {
                    target -= 1
                }
            }
            count++
        }
        return count
    }
}
