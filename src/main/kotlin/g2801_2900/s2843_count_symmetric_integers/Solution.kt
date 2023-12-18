package g2801_2900.s2843_count_symmetric_integers

// #Easy #Math #Enumeration #2023_12_18_Time_203_ms_(88.24%)_Space_37_MB_(64.71%)

class Solution {
    fun countSymmetricIntegers(low: Int, high: Int): Int {
        var count = 0
        for (i in low..high) {
            if (isSymmetric(i)) {
                count++
            }
        }
        return count
    }

    private fun isSymmetric(num: Int): Boolean {
        val str = num.toString()
        val n = str.length
        if (n % 2 != 0) {
            return false
        }
        var leftSum = 0
        var rightSum = 0
        var i = 0
        var j = n - 1
        while (i < j) {
            leftSum += str[i].code - '0'.code
            rightSum += str[j].code - '0'.code
            i++
            j--
        }
        return leftSum == rightSum
    }
}
