package g1601_1700.s1672_richest_customer_wealth

// #Easy #Array #Matrix #Programming_Skills_I_Day_6_Array
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
