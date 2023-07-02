package g2301_2400.s2358_maximum_number_of_groups_entering_a_competition

// #Medium #Array #Math #Greedy #Binary_Search
// #2023_07_02_Time_441_ms_(100.00%)_Space_53_MB_(100.00%)

class Solution {
    fun maximumGroups(grades: IntArray): Int {
        val len = grades.size
        return (-1 + Math.sqrt(1.0 + 8 * len)).toInt() / 2
    }
}
