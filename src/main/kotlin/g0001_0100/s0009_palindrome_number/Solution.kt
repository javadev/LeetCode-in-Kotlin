package g0001_0100.s0009_palindrome_number

// #Easy #Math #2022_03_22_Time_208_ms_(94.88%)_Space_35.9_MB_(90.14%)

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var rev = 0
        var localX = x
        while (localX > 0) {
            rev *= 10
            rev += localX % 10
            localX /= 10
        }
        return rev == x
    }
}
