package g0301_0400.s0367_valid_perfect_square

// #Easy #Math #Binary_Search #Binary_Search_I_Day_3
// #2022_11_19_Time_137_ms_(94.55%)_Space_32.8_MB_(87.27%)

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        if (num == 0) {
            // If num is 0 return false
            return false
        }
        // long datatype can holds huge number.
        var start: Long = 0
        var end = num.toLong()
        var mid: Long
        while (start <= end) {
            // until start is lesser or equal to end do this
            // Finding middle value
            mid = start + (end - start) / 2
            if (mid * mid == num.toLong()) {
                // if mid*mid == num return true
                return true
            } else if (mid * mid < num) {
                // if num is greater than mid*mid then make start = mid + 1
                start = mid + 1
            } else if (mid * mid > num) {
                // if num is lesser than mid*mid then make end = mid - 1
                end = mid - 1
            }
        }
        return false
    }
}
