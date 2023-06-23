package g2101_2200.s2139_minimum_moves_to_reach_target_score

// #Medium #Math #Greedy
@Suppress("NAME_SHADOWING")
class Solution {
    fun minMoves(target: Int, maxDoubles: Int): Int {
        var target = target
        var maxDoubles = maxDoubles
        var count = 0
        while (target > 1) {
            if (maxDoubles > 0 && target % 2 == 0) {
                maxDoubles--
                target = target / 2
            } else {
                if (maxDoubles == 0) {
                    count = count + target - 1
                    return count
                } else {
                    target = target - 1
                }
            }
            count++
        }
        return count
    }
}
