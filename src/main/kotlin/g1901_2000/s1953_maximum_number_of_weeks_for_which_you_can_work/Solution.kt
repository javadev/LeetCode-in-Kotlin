package g1901_2000.s1953_maximum_number_of_weeks_for_which_you_can_work

// #Medium #Array #Greedy #2023_06_21_Time_461_ms_(100.00%)_Space_57.5_MB_(100.00%)

class Solution {
    fun numberOfWeeks(milestones: IntArray): Long {
        var sum: Long = 0
        var max: Long = 0
        for (m in milestones) {
            sum += m.toLong()
            max = Math.max(max, m.toLong())
        }
        return if (sum - max + 1 >= max) sum else 1 + 2 * (sum - max)
    }
}
