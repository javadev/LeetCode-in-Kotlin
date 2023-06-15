package g1701_1800.s1716_calculate_money_in_leetcode_bank

// #Easy #Math
class Solution {
    fun totalMoney(n: Int): Int {
        var n = n
        var mondayMoney = 1
        var total = 0
        while (n > 0) {
            var weekDays = 0
            var base = mondayMoney
            while (weekDays < 7 && n > 0) {
                total += base
                base++
                weekDays++
                n--
            }
            mondayMoney++
        }
        return total
    }
}
