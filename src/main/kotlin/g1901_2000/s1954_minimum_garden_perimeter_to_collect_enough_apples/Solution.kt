package g1901_2000.s1954_minimum_garden_perimeter_to_collect_enough_apples

// #Medium #Math #Binary_Search #2023_06_21_Time_132_ms_(100.00%)_Space_33_MB_(100.00%)

class Solution {
    fun minimumPerimeter(neededApples: Long): Long {
        var l: Long = 1
        var r: Long = 1000000
        var res = l
        while (l <= r) {
            val m = l + (r - l) / 2
            val isPossible = check(m, neededApples)
            if (isPossible) {
                res = m
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return res * 8
    }

    private fun check(len: Long, neededApples: Long): Boolean {
        val sum = len * (len + 1) / 2
        val applesPerQuadrant = 2 * len * sum
        val totalCount = 4 * sum + 4 * applesPerQuadrant
        return totalCount >= neededApples
    }
}
