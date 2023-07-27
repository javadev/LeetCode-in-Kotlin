package g2601_2700.s2678_number_of_senior_citizens

// #Easy #Array #String #2023_07_27_Time_163_ms_(96.30%)_Space_36.8_MB_(70.37%)

class Solution {
    fun countSeniors(details: Array<String>): Int =
        details.filter { it.substring(11, 13).toInt() > 60 }.size
}
