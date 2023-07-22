package g0001_0100.s0008_string_to_integer_atoi

// #Medium #Top_Interview_Questions #String #2023_07_03_Time_172_ms_(82.90%)_Space_34.9_MB_(88.08%)

class Solution {
    fun myAtoi(str: String): Int {
        if (str.isEmpty()) {
            return 0
        }
        var i = 0
        var negativeSign = false
        val input = str.toCharArray()
        while (i < input.size && input[i] == ' ') {
            i++
        }
        if (i == input.size) {
            return 0
        } else if (input[i] == '+') {
            i++
        } else if (input[i] == '-') {
            i++
            negativeSign = true
        }
        var num = 0
        while (i < input.size && input[i] <= '9' && input[i] >= '0') {
            // current char
            var tem = input[i] - '0'
            tem = if (negativeSign) -tem else tem
            // avoid invalid number like 038
            if (num == 0 && tem == '0'.code) {
                i++
            } else if (num == Int.MIN_VALUE / 10 && tem <= -8 || num < Int.MIN_VALUE / 10) {
                return Int.MIN_VALUE
            } else if (num == Int.MAX_VALUE / 10 && tem >= 7 || num > Int.MAX_VALUE / 10) {
                return Int.MAX_VALUE
            } else {
                num = num * 10 + tem
                i++
            }
        }
        return num
    }
}
