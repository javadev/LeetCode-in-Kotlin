package g0501_0600.s0594_longest_harmonious_subsequence

// #Easy #Array #Hash_Table #Sorting #2023_02_01_Time_331_ms_(100.00%)_Space_40.2_MB_(96.15%)

import java.util.Arrays

class Solution {
    fun findLHS(nums: IntArray): Int {
        Arrays.sort(nums)
        var max = 0
        var lastN = 0
        var curN = 1
        var cur = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] > cur) {
                if (lastN > 0 && curN > 0 && lastN + curN > max) {
                    max = lastN + curN
                }
                // if diff more than 1, don't count
                lastN = if (nums[i] - cur == 1) curN else 0
                curN = 1
                cur = nums[i]
            } else {
                curN++
            }
        }
        if (lastN > 0 && curN > 0 && lastN + curN > max) {
            max = lastN + curN
        }
        return max
    }
}
