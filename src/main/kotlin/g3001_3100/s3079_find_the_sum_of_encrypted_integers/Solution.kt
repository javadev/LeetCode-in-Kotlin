package g3001_3100.s3079_find_the_sum_of_encrypted_integers

// #Easy #Array #Math #2024_04_16_Time_172_ms_(80.60%)_Space_36.6_MB_(89.55%)

import kotlin.math.max

@Suppress("NAME_SHADOWING")
class Solution {
    private fun encrypt(x: Int): Int {
        var x = x
        var nDigits = 0
        var max = 0
        while (x > 0) {
            max = max(max, (x % 10))
            x /= 10
            nDigits++
        }
        var ans = 0
        for (i in 0 until nDigits) {
            ans = ans * 10 + max
        }
        return ans
    }

    fun sumOfEncryptedInt(nums: IntArray): Int {
        var ret = 0
        for (num in nums) {
            ret += encrypt(num)
        }
        return ret
    }
}
