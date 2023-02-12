package g0601_0700.s0650_2_keys_keyboard

// #Medium #Dynamic_Programming #Math #2023_02_12_Time_115_ms_(100.00%)_Space_32.7_MB_(66.67%)

class Solution {
    fun minSteps(n: Int): Int {
        var count = 1
        var cost = 0
        var addValue = 1
        while (count < n) {
            cost++
            count += addValue
            if (n % count == 0) {
                cost++
                addValue = count
            }
        }
        return cost
    }
}
