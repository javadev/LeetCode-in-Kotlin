package g1401_1500.s1482_minimum_number_of_days_to_make_m_bouquets

// #Medium #Array #Binary_Search #Binary_Search_II_Day_7
class Solution {
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        val n = bloomDay.size
        if (m * k > n) {
            return -1
        }
        var left = 1
        var right = 1
        for (day in bloomDay) {
            right = Math.max(right, day)
        }
        while (left < right) {
            val guess = (left + right) / 2
            val judgeResult = judge(bloomDay, m, k, guess)
            if (!judgeResult) {
                left = guess + 1
            } else if (!judge(bloomDay, m, k, guess - 1)) {
                return guess
            } else {
                right = guess
            }
        }
        return left
    }

    private fun judge(bloomDay: IntArray, m: Int, k: Int, guess: Int): Boolean {
        var bouquets = 0
        var cnt = 0
        for (j in bloomDay) {
            if (j <= guess) {
                cnt++
                if (cnt == k) {
                    cnt = 0
                    bouquets++
                    if (bouquets >= m) {
                        return true
                    }
                }
            } else {
                cnt = 0
            }
        }
        return false
    }
}
