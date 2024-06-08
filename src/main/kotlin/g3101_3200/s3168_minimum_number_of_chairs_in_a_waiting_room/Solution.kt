package g3101_3200.s3168_minimum_number_of_chairs_in_a_waiting_room

// #Easy #String #Simulation #2024_06_08_Time_148_ms_(86.52%)_Space_35_MB_(8.99%)

import kotlin.math.max

class Solution {
    fun minimumChairs(s: String): Int {
        var count = 0
        var ans = Int.MIN_VALUE
        for (ch in s.toCharArray()) {
            if (ch == 'E') {
                count++
                ans = max(ans, count)
            } else {
                count--
            }
        }
        return ans
    }
}
