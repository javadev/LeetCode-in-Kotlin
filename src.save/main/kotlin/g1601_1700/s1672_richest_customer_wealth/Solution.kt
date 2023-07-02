package g1601_1700.s1672_richest_customer_wealth

// #Easy #Array #Matrix #Programming_Skills_I_Day_6_Array
// #2023_06_15_Time_155_ms_(94.54%)_Space_36.6_MB_(82.18%)

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = Int.MIN_VALUE
        for (account in accounts) {
            var sum = 0
            for (i in account) {
                sum += i
            }
            max = Math.max(max, sum)
        }
        return max
    }
}
