package g1101_1200.s1154_day_of_the_year

// #Easy #String #Math

class Solution {
    fun dayOfYear(date: String): Int {
        val monthDays = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val dateArr = date.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val year = dateArr[0].toInt()
        val month = dateArr[1].toInt()
        val day = dateArr[2].toInt()
        var dayCount = 0
        val leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0
        for (i in 1 until month) {
            dayCount += monthDays[i]
        }
        dayCount += day
        if (leapYear && month > 2) {
            dayCount++
        }
        return dayCount
    }
}
