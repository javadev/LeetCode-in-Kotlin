package g3501_3600.s3517_smallest_palindromic_rearrangement_i

// #Medium #String #Sorting #Counting_Sort #2025_04_14_Time_49_ms_(100.00%)_Space_52.03_MB_(100.00%)

class Solution {
    fun smallestPalindrome(s: String): String {
        val n = s.length
        val m = n / 2
        if (n == 1 || n == 2) {
            return s
        }
        val fArr = s.substring(0, m).toCharArray()
        fArr.sort()
        var f = String(fArr)
        val rev = StringBuilder(f).reverse()
        if (n % 2 == 1) {
            f += s[m]
        }
        return f + rev
    }
}
