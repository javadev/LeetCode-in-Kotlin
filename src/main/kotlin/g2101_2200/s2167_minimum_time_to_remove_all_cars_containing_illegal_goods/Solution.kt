package g2101_2200.s2167_minimum_time_to_remove_all_cars_containing_illegal_goods

// #Hard #String #Dynamic_Programming
class Solution {
    fun minimumTime(s: String): Int {
        val n = s.length
        val sum = IntArray(n + 1)
        for (i in 0 until n) {
            sum[i + 1] = sum[i] + (s[i].code - '0'.code)
        }
        if (sum[n] == 0) {
            return 0
        }
        var res = s.length
        var min = Int.MAX_VALUE
        for (end in 0 until n) {
            min = Math.min(min, end - 2 * sum[end] + n - 1)
            res = Math.min(res, min + 2 * sum[end + 1] - end)
        }
        return res
    }
}
