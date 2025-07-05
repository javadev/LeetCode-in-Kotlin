package g0001_0100.s0009_palindrome_number

// #Easy #Math #Udemy_Integers #Top_Interview_150_Math #Big_O_Time_O(log10(x))_Space_O(1)
// #2023_07_03_Time_217_ms_(95.34%)_Space_36.1_MB_(98.21%)

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
