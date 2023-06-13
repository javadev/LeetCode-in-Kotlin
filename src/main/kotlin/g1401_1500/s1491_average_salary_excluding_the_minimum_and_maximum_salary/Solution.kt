package g1401_1500.s1491_average_salary_excluding_the_minimum_and_maximum_salary

// #Easy #Array #Sorting #Programming_Skills_I_Day_1_Basic_Data_Type
// #2023_06_13_Time_165_ms_(27.87%)_Space_33.9_MB_(98.81%)

class Solution {
    fun average(salary: IntArray): Double {
        val n = salary.size
        var min = salary[0]
        var max = salary[0]
        var sum = salary[0]
        for (i in 1 until n) {
            if (salary[i] < min) {
                min = salary[i]
            } else if (salary[i] > max) {
                max = salary[i]
            }
            sum += salary[i]
        }
        return (sum - min - max).toDouble() / (n - 2)
    }
}
