package g0001_0100.s0009_palindrome_number

// #Easy #Math #Udemy_Integers #2022_09_22_Time_238_ms_(96.24%)_Space_35_MB_(98.02%)

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
