package g3301_3400.s3340_check_balanced_string

// #Easy #String #2024_11_05_Time_1_ms_(100.00%)_Space_34.9_MB_(84.38%)

class Solution {
    fun isBalanced(num: String): Boolean {
        var diff = 0
        var sign = 1
        val n = num.length
        for (i in 0 until n) {
            diff += sign * (num[i].code - '0'.code)
            sign = -sign
        }
        return diff == 0
    }
}
