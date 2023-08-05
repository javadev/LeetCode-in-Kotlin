package g2701_2800.s2733_neither_minimum_nor_maximum

// #Easy #Array #Sorting #2023_08_05_Time_286_ms_(100.00%)_Space_44.2_MB_(92.79%)

class Solution {
    fun findNonMinOrMax(nums: IntArray): Int {
        var mn = 999
        var mx: Int = -1
        nums.forEach {
            mn = kotlin.math.min(it, mn)
            mx = kotlin.math.max(it, mx)
        }
        nums.forEach {
            if (it != mn && it != mx)return it
        }
        return -1
    }
}
