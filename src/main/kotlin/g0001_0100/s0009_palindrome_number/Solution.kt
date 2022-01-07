package g0001_0100.s0009_palindrome_number

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
