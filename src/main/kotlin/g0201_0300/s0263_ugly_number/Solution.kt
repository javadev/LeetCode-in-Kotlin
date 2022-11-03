package g0201_0300.s0263_ugly_number

// #Easy #Math #2022_11_02_Time_243_ms_(64.10%)_Space_34.4_MB_(17.95%)

class Solution {
    fun isUgly(n: Int): Boolean {
        if (n < 1) {
            return false
        }
        if (n == 1) {
            return true
        }

        var num = n
        for (divider in arrayOf(2, 3, 5)) {
            while (num % divider == 0) {
                num /= divider
            }
        }

        return num == 1
    }
}
