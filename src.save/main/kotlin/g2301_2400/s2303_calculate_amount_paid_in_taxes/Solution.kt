package g2301_2400.s2303_calculate_amount_paid_in_taxes

// #Easy #Array #Simulation #2023_06_29_Time_213_ms_(100.00%)_Space_40.4_MB_(100.00%)

class Solution {
    fun calculateTax(brackets: Array<IntArray>, income: Int): Double {
        // you can remove this line
        if (income == 0) {
            return 0.0
        }
        var sum = 0.0
        var prev = 0.0
        for (bracket in brackets) {
            val salary = bracket[0].coerceAtMost(income).toDouble()
            val tax = bracket[1].toDouble()
            sum += (salary - prev) * tax
            prev = salary
        }
        return sum / 100
    }
}
