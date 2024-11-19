package g2401_2500.s2409_count_days_spent_together

// #Easy #String #Math #2023_07_03_Time_143_ms_(60.00%)_Space_34.9_MB_(40.00%)

class Solution {
    private val dates = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    fun countDaysTogether(
        arriveAlice: String,
        leaveAlice: String,
        arriveBob: String,
        leaveBob: String,
    ): Int {
        if (leaveAlice < arriveBob || leaveBob < arriveAlice) {
            return 0
        }
        val end = if (leaveAlice <= leaveBob) leaveAlice else leaveBob
        val start = if (arriveAlice <= arriveBob) arriveBob else arriveAlice
        val starts = start.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val ends = end.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val startMonth = Integer.valueOf(starts[0])
        val endMonth = Integer.valueOf(ends[0])
        var res = 0
        if (startMonth == endMonth) {
            res += Integer.valueOf(ends[1]) - Integer.valueOf(starts[1]) + 1
            return res
        }
        for (i in startMonth..endMonth) {
            res += when (i) {
                endMonth -> Integer.valueOf(ends[1])
                startMonth -> dates[i] - Integer.valueOf(starts[1]) + 1
                else -> dates[i]
            }
        }
        return res
    }
}
