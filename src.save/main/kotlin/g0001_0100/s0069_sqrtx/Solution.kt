package g0001_0100.s0069_sqrtx

// #Easy #Top_Interview_Questions #Math #Binary_Search #Binary_Search_I_Day_4
// #2023_07_10_Time_140_ms_(94.72%)_Space_33.5_MB_(66.67%)

class Solution {
    fun mySqrt(x: Int): Int {
        var start = 1
        var end = x / 2
        var sqrt = start + (end - start) / 2
        if (x == 0) {
            return 0
        }
        while (start <= end) {
            if (sqrt == x / sqrt) {
                return sqrt
            } else if (sqrt > x / sqrt) {
                end = sqrt - 1
            } else if (sqrt < x / sqrt) {
                start = sqrt + 1
            }
            sqrt = start + (end - start) / 2
        }
        return if (sqrt > x / sqrt) {
            sqrt - 1
        } else {
            sqrt
        }
    }
}
