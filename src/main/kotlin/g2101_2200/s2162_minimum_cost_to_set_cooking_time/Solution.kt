package g2101_2200.s2162_minimum_cost_to_set_cooking_time

// #Medium #Math #Enumeration #2023_06_26_Time_134_ms_(100.00%)_Space_32.8_MB_(100.00%)

class Solution {
    fun minCostSetTime(startAt: Int, moveCost: Int, pushCost: Int, targetSeconds: Int): Int {
        val mins = targetSeconds / 60
        val secs = targetSeconds % 60
        return Math.min(
            cost(mins, secs, startAt, moveCost, pushCost),
            cost(mins - 1, secs + 60, startAt, moveCost, pushCost),
        )
    }

    private fun cost(mins: Int, secs: Int, startAt: Int, moveCost: Int, pushCost: Int): Int {
        if (mins > 99 || secs > 99 || mins < 0 || secs < 0) {
            return Int.MAX_VALUE
        }
        val s = Integer.toString(mins * 100 + secs)
        var curr = (startAt + '0'.code).toChar()
        var res = 0
        for (i in 0 until s.length) {
            if (s[i] == curr) {
                res += pushCost
            } else {
                res += pushCost + moveCost
                curr = s[i]
            }
        }
        return res
    }
}
