package g0701_0800.s0793_preimage_size_of_factorial_zeroes_function

// #Hard #Math #Binary_Search #2023_03_14_Time_114_ms_(100.00%)_Space_33.1_MB_(57.14%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun preimageSizeFZF(k: Int): Int {
        var left: Long = 0
        var right = 5L * (k + 1)
        while (left < right - 1) {
            val mid = left + (right - left) / 2
            val cnt = countZeros(mid)
            if (cnt == k) {
                return 5
            } else if (cnt < k) {
                left = mid
            } else {
                right = mid
            }
        }
        return if (countZeros(left) == k || countZeros(right) == k) 5 else 0
    }

    private fun countZeros(n: Long): Int {
        var n = n
        var rst: Long = 0
        while (n > 0) {
            rst += n / 5
            n /= 5
        }
        return rst.toInt()
    }
}
