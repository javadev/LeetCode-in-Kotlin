package g2801_2900.s2860_happy_students

// #Medium #Array #Sorting #Enumeration #2023_12_21_Time_512_ms_(100.00%)_Space_56.2_MB_(50.00%)

import java.util.Collections

class Solution {
    fun countWays(nums: List<Int>): Int {
        Collections.sort(nums)
        var cnt = 0
        val n = nums.size
        if (nums[0] != 0) {
            cnt++
        }
        for (i in 0 until n - 1) {
            if (nums[i] < (i + 1) && (nums[i + 1] > (i + 1))) {
                cnt++
            }
        }
        if (n > nums[n - 1]) {
            cnt++
        }
        return cnt
    }
}
