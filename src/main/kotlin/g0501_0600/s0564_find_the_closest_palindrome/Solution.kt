package g0501_0600.s0564_find_the_closest_palindrome

// #Hard #String #Math #2023_01_21_Time_179_ms_(100.00%)_Space_33.7_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun nearestPalindromic(n: String): String {
        if (n.length == 1) {
            return (n.toInt() - 1).toString()
        }
        val num = n.toLong()
        val offset = Math.pow(10.0, (n.length / 2).toDouble()).toInt()
        val first =
            if (isPalindrome(n)) palindromeGenerator(num + offset, n.length) else palindromeGenerator(num, n.length)
        val second = if (first < num) palindromeGenerator(num + offset, n.length) else palindromeGenerator(
            num - offset,
            n.length
        )
        if (first + second == 2 * num) {
            return if (first < second) first.toString() else second.toString()
        }
        return if (Math.abs(num - first) > Math.abs(num - second)) second.toString() else first.toString()
    }

    private fun palindromeGenerator(num: Long, length: Int): Long {
        var num = num
        if (num < 10) {
            return 9
        }
        val numOfDigits = num.toString().length
        if (numOfDigits > length) {
            return Math.pow(10.0, (numOfDigits - 1).toDouble()).toLong() + 1
        } else if (numOfDigits < length) {
            return Math.pow(10.0, numOfDigits.toDouble()).toLong() - 1
        }
        num = num - num % Math.pow(10.0, (numOfDigits / 2).toDouble()).toLong()
        var temp = num
        for (j in 0 until numOfDigits / 2) {
            val digit = Math.pow(10.0, (numOfDigits - j - 1).toDouble()).toLong()
            num += (temp / digit * Math.pow(10.0, j.toDouble())).toInt().toLong()
            temp = temp % digit
        }
        return num
    }

    private fun isPalindrome(str: String): Boolean {
        for (i in 0 until str.length / 2) {
            if (str[i] != str[str.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}
