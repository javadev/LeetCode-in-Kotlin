package g1201_1300.s1201_ugly_number_iii

// #Medium #Math #Binary_Search #Number_Theory #Binary_Search_II_Day_20
// #2023_06_09_Time_136_ms_(100.00%)_Space_33.1_MB_(100.00%)

class Solution {
    private fun getLcm(a: Long, b: Long): Long {
        var mx = a
        var mn = b
        if (a < b) {
            mx = b
            mn = a
        }
        while (mn != 0L) {
            val tmp = mn
            mn = mx % mn
            mx = tmp
        }
        return a * b / mx
    }

    fun nthUglyNumber(n: Int, a: Int, b: Int, c: Int): Int {
        val ab = getLcm(a.toLong(), b.toLong())
        val ac = getLcm(a.toLong(), c.toLong())
        val bc = getLcm(b.toLong(), c.toLong())
        val abc = getLcm(a.toLong(), bc)
        var left: Long = 1
        var right: Long = 2000000001
        if (a != 0 && b != 0 && c != 0 && bc != 0L) {
            while (left < right) {
                val mid = left + (right - left) / 2
                if (mid / a + mid / b + mid / c - mid / ab - mid / ac - mid / bc + mid / abc >= n) {
                    right = mid
                } else {
                    left = mid + 1
                }
            }
        }
        return left.toInt()
    }
}
