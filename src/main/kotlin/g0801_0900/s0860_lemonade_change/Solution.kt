package g0801_0900.s0860_lemonade_change

// #Easy #Array #Greedy #Programming_Skills_II_Day_17
// #2023_04_03_Time_413_ms_(86.96%)_Space_47.3_MB_(65.22%)

class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var countFive = 0
        var countTen = 0
        for (bill in bills) {
            if (bill == 5) {
                countFive++
            } else if (bill == 10) {
                if (countFive == 0) {
                    return false
                }
                countFive--
                countTen++
            } else if (bill == 20) {
                if (countFive > 0 && countTen > 0) {
                    countFive--
                    countTen--
                } else if (countFive >= 3) {
                    countFive -= 3
                } else {
                    return false
                }
            }
        }
        return true
    }
}
