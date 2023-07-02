package g2301_2400.s2358_maximum_number_of_groups_entering_a_competition

// #Medium #Array #Math #Greedy #Binary_Search
class Solution {
    fun maximumGroups(grades: IntArray): Int {
        val len = grades.size
        return (-1 + Math.sqrt(1.0 + 8 * len)).toInt() / 2
    }
}
