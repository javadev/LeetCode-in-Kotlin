package g3401_3500.s3411_maximum_subarray_with_equal_products

// #Easy #Array #Math #Sliding_Window #Enumeration #Number_Theory
// #2025_01_07_Time_7_ms_(60.71%)_Space_36.33_MB_(92.86%)

import kotlin.math.max

class Solution {
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    private fun lcm(a: Int, b: Int): Int {
        return (a / gcd(a, b)) * b
    }

    fun maxLength(nums: IntArray): Int {
        val n = nums.size
        var maxL = 0
        for (i in 0..<n) {
            var currGCD = nums[i]
            var currLCM = nums[i]
            var currPro = nums[i]
            for (j in i + 1..<n) {
                currPro *= nums[j]
                currGCD = gcd(currGCD, nums[j])
                currLCM = lcm(currLCM, nums[j])
                if (currPro == currLCM * currGCD) {
                    maxL = max(maxL.toDouble(), (j - i + 1).toDouble()).toInt()
                }
            }
        }
        return maxL
    }
}
