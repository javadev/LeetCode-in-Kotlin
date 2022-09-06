package g0201_0300.s0224_basic_calculator

// #Hard #String #Math #Stack #Recursion #2022_07_04_Time_3_ms_(98.92%)_Space_44.6_MB_(43.19%)
class Solution {
    private var i = 0
    fun calculate(s: String): Int {
        val ca = s.toCharArray()
        return helper(ca)
    }

    private fun helper(ca: CharArray): Int {
        var num = 0
        var prenum = 0
        var isPlus = true
        while (i < ca.size) {
            val c = ca[i]
            if (c != ' ') {
                if (c >= '0' && c <= '9') {
                    if (num == 0) {
                        num = c.code - '0'.code
                    } else {
                        num = num * 10 + c.code - '0'.code
                    }
                } else if (c == '+') {
                    prenum += num * if (isPlus) 1 else -1
                    isPlus = true
                    num = 0
                } else if (c == '-') {
                    prenum += num * if (isPlus) 1 else -1
                    num = 0
                    isPlus = false
                } else if (c == '(') {
                    i++
                    prenum += helper(ca) * if (isPlus) 1 else -1
                    isPlus = true
                    num = 0
                } else if (c == ')') {
                    return prenum + num * if (isPlus) 1 else -1
                }
            }
            i++
        }
        return prenum + num * if (isPlus) 1 else -1
    }
}
