package g1101_1200.s1185_day_of_the_week

// #Easy #Math #2023_05_25_Time_127_ms_(50.00%)_Space_34.4_MB_(75.00%)

class Solution {
    fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
        var counter = 0
        for (i in 1971 until year) {
            counter += if (isLeapYear(i)) {
                366
            } else {
                365
            }
        }
        for (i in 1 until month) {
            counter += dayOfMonth(i)
        }
        for (i in 1..day) {
            counter += 1
        }
        if (isLeapYear(year) && month > 2) {
            counter++
        }
        return when (counter % 7) {
            1 -> "Friday"
            2 -> "Saturday"
            3 -> "Sunday"
            4 -> "Monday"
            5 -> "Tuesday"
            6 -> "Wednesday"
            else -> "Thursday"
        }
    }

    private fun isLeapYear(year: Int): Boolean {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
    }

    private fun dayOfMonth(month: Int): Int {
        return when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            else -> 28
        }
    }
}
