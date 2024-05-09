package g1401_1500.s1491_average_salary_excluding_the_minimum_and_maximum_salary

// #Easy #Array #Sorting #Programming_Skills_I_Day_1_Basic_Data_Type
// #2024_05_09_Time_137_ms_(91.67%)_Space_34.3_MB_(58.33%)

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
