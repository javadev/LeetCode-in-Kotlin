package g1401_1500.s1482_minimum_number_of_days_to_make_m_bouquets

// #Medium #Array #Binary_Search #Binary_Search_II_Day_7
// #2023_06_13_Time_538_ms_(50.00%)_Space_53_MB_(83.33%)

class Solution {
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        if (bloomDay.size < m.toLong() * k) return -1
        var minDay = Int.MAX_VALUE
        var maxDay = 0
        for (day in bloomDay) {
            if (day > maxDay) {
                maxDay = day
            }
            if (day < minDay) {
                minDay = day
            }
        }
        var left = minDay
        var right = maxDay
        while (left < right) {
            val mid = left + (right - left) / 2
            if (canMake(bloomDay, m, k, mid)) {
                // search in the left
                right = mid
            } else {
                left = mid + 1
            }
        }
        return right
    }

    private fun canMake(bloomDay: IntArray, m: Int, k: Int, day: Int): Boolean {
        var count = 0
        var bouquets = 0
        for (i in bloomDay.indices) {
            if (bloomDay[i] > day) {
                count = 0
            } else {
                count++
                if (count == k) {
                    bouquets++
                    count = 0
                }
            }
        }
        return bouquets >= m
    }
}
