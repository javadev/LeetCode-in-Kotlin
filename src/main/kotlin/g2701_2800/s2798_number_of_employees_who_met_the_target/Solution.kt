package g2701_2800.s2798_number_of_employees_who_met_the_target

// #Easy #Array #Enumeration #2023_08_06_Time_153_ms_(92.50%)_Space_35_MB_(71.25%)

class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var count = 0
        for (i in hours) {
            if (i >= target) {
                count++
            }
        }
        return count
    }
}
