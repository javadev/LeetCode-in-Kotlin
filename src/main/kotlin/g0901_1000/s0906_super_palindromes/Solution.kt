package g0901_1000.s0906_super_palindromes

// #Hard #Math #Enumeration #2023_04_14_Time_153_ms_(100.00%)_Space_33.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun superpalindromesInRange(left: String, right: String): Int {
        val l = left.toLong()
        val r = right.toLong()
        var cnt = 0
        var cur: Long = 1
        while (true) {
            val p1 = getPalindromeIncLastDigit(cur)
            val p2 = getPalindromeExcLastDigit(cur)
            val sq1 = p1 * p1
            val sq2 = p2 * p2
            if (sq2 > r) {
                break
            }
            if (sq1 in l..r && isPalindrome(sq1)) {
                cnt++
            }
            if (sq2 >= l && isPalindrome(sq2)) {
                cnt++
            }
            cur++
        }
        return cnt
    }

    private fun isPalindrome(`val`: Long): Boolean {
        var `val` = `val`
        var construct: Long = 0
        if (`val` % 10 == 0L && `val` >= 10) {
            return false
        }
        while (construct < `val`) {
            construct = construct * 10 + `val` % 10
            `val` /= 10
        }
        return construct == `val` || construct / 10 == `val`
    }

    private fun getPalindromeIncLastDigit(`val`: Long): Long {
        var `val` = `val`
        var copy = `val`
        while (copy != 0L) {
            `val` = `val` * 10 + copy % 10
            copy /= 10
        }
        return `val`
    }

    private fun getPalindromeExcLastDigit(`val`: Long): Long {
        var `val` = `val`
        var copy = `val` / 10
        while (copy != 0L) {
            `val` = `val` * 10 + copy % 10
            copy /= 10
        }
        return `val`
    }
}
