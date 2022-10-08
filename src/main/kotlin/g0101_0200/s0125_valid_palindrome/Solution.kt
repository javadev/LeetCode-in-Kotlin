package g0101_0200.s0125_valid_palindrome

// #Easy #Top_Interview_Questions #String #Two_Pointers #Udemy_Two_Pointers
// #2022_10_08_Time_353_ms_(52.06%)_Space_39.2_MB_(73.02%)

class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        var res = true
        while (res) {
            // Iterates through string to find first char which is alphanumeric.
            // Done to ignore non-alphanumeric characters.
            // Starts from 0 to j-1.
            while (i < j && isNotAlphaNumeric(s[i])) {
                i++
            }
            // Similarly from j-1 to 0.
            while (i < j && isNotAlphaNumeric(s[j])) {
                j--
            }
            // Checks if i is greater than or equal to j.
            // The main loop only needs to loop n / 2 times hence this condition (where n is string
            // length).
            if (i >= j) {
                break
            }
            // Assigning found indices to variables.
            // The upperToLower function is used to convert characters, if upper case, to lower
            // case.
            // If already lower case, it'll return as it is.
            val left = upperToLower(s[i])
            val right = upperToLower(s[j])
            // If both variables are not same, result becomes false, and breaks out of the loop at
            // next iteration.
            if (left != right) {
                res = false
            }
            i++
            j--
        }
        return res
    }

    private fun isNotAlphaNumeric(c: Char): Boolean {
        return (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')
    }

    private fun isUpper(c: Char): Boolean {
        return c >= 'A' && c <= 'Z'
    }

    private fun upperToLower(c: Char): Char {
        var c = c
        if (isUpper(c)) {
            c += 32
        }
        return c
    }
}
