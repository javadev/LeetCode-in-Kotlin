package g1901_2000.s1997_first_day_where_you_have_been_in_all_the_rooms

// #Medium #Array #Dynamic_Programming
class Solution {
    fun firstDayBeenInAllRooms(nextVisit: IntArray): Int {
        val dp = IntArray(nextVisit.size)
        val m = 1000000007
        for (i in 1 until dp.size) {
            val steps = 2 * dp[i - 1] - dp[nextVisit[i - 1]] + 2
            dp[i] = if (steps < 0) (steps + m) % m else steps % m
        }
        return dp[dp.size - 1]
    }
}
