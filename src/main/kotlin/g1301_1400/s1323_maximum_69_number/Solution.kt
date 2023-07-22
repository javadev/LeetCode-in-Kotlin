package g1301_1400.s1323_maximum_69_number

// #Easy #Math #Greedy #2023_06_06_Time_118_ms_(90.00%)_Space_35.1_MB_(30.00%)

class Solution {
    fun maximum69Number(num: Int): Int {
        val chars = num.toString().toCharArray()
        var foundSix = false
        for (i in chars.indices) {
            if (chars[i] == '6') {
                chars[i] = '9'
                foundSix = true
                break
            }
        }
        return if (foundSix) chars.joinToString("").toInt() else num
    }
}
