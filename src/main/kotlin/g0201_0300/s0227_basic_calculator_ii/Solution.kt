package g0201_0300.s0227_basic_calculator_ii

// #Medium #String #Math #Stack #Level_2_Day_18_Stack
// #2022_10_26_Time_383_ms_(62.50%)_Space_39.5_MB_(83.33%)

class Solution {
    fun calculate(s: String): Int {
        var sum = 0
        var tempSum = 0
        var num = 0
        var lastSign = '+'
        for (i in 0 until s.length) {
            val c = s[i]
            if (Character.isDigit(c)) {
                num = num * 10 + c.code - '0'.code
            }
            if (i == s.length - 1 || !Character.isDigit(c) && c != ' ') {
                when (lastSign) {
                    '+' -> {
                        sum += tempSum
                        tempSum = num
                    }
                    '-' -> {
                        sum += tempSum
                        tempSum = -num
                    }
                    '*' -> tempSum *= num
                    '/' -> if (num != 0) {
                        tempSum /= num
                    }
                }
                lastSign = c
                num = 0
            }
        }
        sum += tempSum
        return sum
    }
}
