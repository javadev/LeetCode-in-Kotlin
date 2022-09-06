package g0201_0300.s0227_basic_calculator_ii

// #Medium #Top_Interview_Questions #String #Math #Stack #Level_2_Day_18_Stack
// #2022_07_04_Time_8_ms_(95.32%)_Space_43.6_MB_(79.36%)
@Suppress("kotlin:S108")
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
            // i == s.length() - 1 will make sure that after last num is
            // made and there is nothing to read anything from 's', the final computation is done
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
                    else -> {}
                }
                lastSign = c
                num = 0
            }
        }
        // finally, add tempSum to sum
        sum += tempSum
        return sum
    }
}
