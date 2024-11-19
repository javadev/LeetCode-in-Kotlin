package g2801_2900.s2865_beautiful_towers_i

// #Medium #Array #Stack #Monotonic_Stack #2023_12_21_Time_232_ms_(75.00%)_Space_38.8_MB_(75.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun `fun`(maxHeights: List<Int>, pickId: Int): Long {
        var ans = maxHeights[pickId].toLong()
        var min = maxHeights[pickId].toLong()
        for (i in pickId - 1 downTo 0) {
            min = min(min.toDouble(), maxHeights[i].toDouble()).toLong()
            ans += min
        }
        min = maxHeights[pickId].toLong()
        for (i in pickId + 1 until maxHeights.size) {
            min = min(min.toDouble(), maxHeights[i].toDouble()).toLong()
            ans += min
        }
        return ans
    }

    fun maximumSumOfHeights(maxHeights: List<Int>): Long {
        val n = maxHeights.size
        var ans: Long = 0
        for (i in 0 until n) {
            if (i == 0 || i == n - 1 || (
                    maxHeights[i] >= maxHeights[i - 1] &&
                        maxHeights[i] >= maxHeights[i + 1]
                    )
            ) {
                ans = max(ans.toDouble(), `fun`(maxHeights, i).toDouble()).toLong()
            }
        }
        return ans
    }
}
