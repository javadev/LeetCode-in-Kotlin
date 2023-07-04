package g2501_2600.s2544_alternating_digit_sum

// #Easy #Math
class Solution {
    fun alternateDigitSum(n: Int): Int {
        val s = Integer.toString(n)
        val arr = s.toCharArray()
        var res = 0
        for (i in arr.indices) {
            res += Math.pow(-1.0, i.toDouble()).toInt() * (arr[i].code - '0'.code)
        }
        return res
    }
}
