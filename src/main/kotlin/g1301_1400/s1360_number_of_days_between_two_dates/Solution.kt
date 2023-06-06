package g1301_1400.s1360_number_of_days_between_two_dates

// #Easy #String #Math
class Solution {
    fun daysBetweenDates(date1: String, date2: String): Int {
        val strings1 = date1.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val strings2 = date2.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        return Math.abs(
            julianDay(strings1[0].toInt(), strings1[1].toInt(), strings1[2].toInt()) -
                julianDay(strings2[0].toInt(), strings2[1].toInt(), strings2[2].toInt())
        )
    }

    private fun julianDay(year: Int, month: Int, day: Int): Int {
        val a = (14 - month) / 12
        val y = year + 4800 - a
        val m = month + 12 * a - 3
        return day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045
    }
}
