package g1001_1100.s1040_moving_stones_until_consecutive_ii

// #Medium #Array #Math #Sorting #Two_Pointers
// #2023_05_26_Time_287_ms_(50.00%)_Space_50.2_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun numMovesStonesII(a: IntArray): IntArray? {
        Arrays.sort(a)
        var i = 0
        val n = a.size
        var low = n
        val high = (a[n - 1] - n + 2 - a[1]).coerceAtLeast(a[n - 2] - a[0] - n + 2)
        for (j in 0 until n) {
            while (a[j] - a[i] >= n) ++i
            low = if (j - i + 1 == n - 1 && a[j] - a[i] == n - 2) low.coerceAtMost(2)
            else low.coerceAtMost(n - (j - i + 1))
        }
        return intArrayOf(low, high)
    }
}
