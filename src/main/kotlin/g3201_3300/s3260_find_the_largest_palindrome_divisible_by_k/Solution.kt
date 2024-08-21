package g3201_3300.s3260_find_the_largest_palindrome_divisible_by_k

// #Hard #String #Dynamic_Programming #Math #Greedy #Number_Theory
// #2024_08_21_Time_211_ms_(100.00%)_Space_38.8_MB_(66.67%)

class Solution {
    fun largestPalindrome(n: Int, k: Int): String {
        val sc = CharArray(n)
        if (k == 1 || k == 3 || k == 9) {
            sc.fill('9')
        } else if (k == 7) {
            if (n == 1) {
                return "7"
            } else if (n == 2) {
                return "77"
            }
            val mod = n % 12
            checkValues(n, mod, sc)
        } else if (k == 2) {
            sc.fill('9')
            sc[0] = '8'
            sc[n - 1] = '8'
        } else if (k == 4) {
            sc.fill('8')
            var i = 2
            var j = n - 3
            while (i <= j) {
                sc[i] = '9'
                sc[j] = '9'
                ++i
                --j
            }
        } else if (k == 5) {
            sc.fill('9')
            sc[0] = '5'
            sc[n - 1] = '5'
        } else if (k == 6) {
            val number = getString(n, sc)
            if (number != null) {
                return number
            }
        } else if (k == 8) {
            sc.fill('8')
            var i = 3
            var j = n - 4
            while (i <= j) {
                sc[i] = '9'
                sc[j] = '9'
                ++i
                --j
            }
        }
        return String(sc)
    }

    private fun checkValues(n: Int, mod: Int, sc: CharArray) {
        if (mod == 6 || mod == 0) {
            sc.fill('9')
        } else if (mod == 3) {
            sc.fill('9')
            sc[n / 2] = '5'
        } else if (mod == 4 || mod == 5 || mod == 1 || mod == 2) {
            sc.fill('7')
            var i = 0
            var j = n - 1
            while (i + 1 < j) {
                sc[i] = '9'
                sc[j] = '9'
                ++i
                --j
            }
        } else if (mod == 7 || mod == 8 || mod == 10 || mod == 11) {
            sc.fill('4')
            var i = 0
            var j = n - 1
            while (i + 1 < j) {
                sc[i] = '9'
                sc[j] = '9'
                ++i
                --j
            }
        } else if (mod == 9) {
            sc.fill('9')
            sc[n / 2] = '6'
        }
    }

    private fun getString(n: Int, sc: CharArray): String? {
        if (n == 1) {
            return "6"
        } else if (n == 2) {
            return "66"
        } else {
            if (n % 2 == 1) {
                sc.fill('9')
                sc[0] = '8'
                sc[n - 1] = '8'
                sc[n / 2] = '8'
            } else {
                sc.fill('9')
                sc[0] = '8'
                sc[n - 1] = '8'
                sc[n / 2] = '7'
                sc[n / 2 - 1] = '7'
            }
        }
        return null
    }
}
