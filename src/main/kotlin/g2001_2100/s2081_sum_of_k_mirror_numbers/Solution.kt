package g2001_2100.s2081_sum_of_k_mirror_numbers

// #Hard #Math #Enumeration #2023_06_27_Time_455_ms_(100.00%)_Space_39.9_MB_(100.00%)

class Solution {
    fun kMirror(k: Int, n: Int): Long {
        val result: MutableList<Long> = ArrayList()
        var len = 1
        while (result.size < n) {
            backtrack(result, CharArray(len++), k, n, 0)
        }
        var sum: Long = 0
        for (num in result) {
            sum += num
        }
        return sum
    }

    private fun backtrack(result: MutableList<Long>, arr: CharArray, k: Int, n: Int, index: Int) {
        if (result.size == n) {
            return
        }
        if (index >= (arr.size + 1) / 2) {
            // Number in base-10
            val number = String(arr).toLong(k)
            if (isPalindrome(number)) {
                result.add(number)
            }
            return
        }
        // Generate base-k palindrome number in arr.length without leading zeros
        for (i in 0 until k) {
            if (index == 0 && i == 0) {
                // Leading zeros
                continue
            }
            val c: Char = (i + '0'.code).toChar()
            arr[index] = c
            arr[arr.size - 1 - index] = c
            backtrack(result, arr, k, n, index + 1)
        }
    }

    private fun isPalindrome(number: Long): Boolean {
        val strNum = number.toString()
        var left = 0
        var right = strNum.length - 1
        while (left < right) {
            if (strNum[left] == strNum[right]) {
                left++
                right--
            } else {
                return false
            }
        }
        return true
    }
}
