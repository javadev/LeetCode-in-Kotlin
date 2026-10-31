package g3801_3900.s3867_sum_of_gcd_of_formed_pairs

// #Medium #Array #Math #Sorting #Two_Pointers #Simulation #Number_Theory #Senior
// #Biweekly_Contest_178 #2026_07_28_Time_53_ms_(92.50%)_Space_107.82_MB_(83.19%)

import kotlin.math.max

class Solution {
    fun gcdSum(nums: IntArray): Long {
        val prefixGcd = IntArray(nums.size)
        var max = -1
        for (i in nums.indices) {
            max = max(max, nums[i])
            prefixGcd[i] = gcd(max, nums[i])
        }
        prefixGcd.sort()
        var sum: Long = 0
        var i = 0
        var j = nums.size - 1
        while (i < j) {
            sum += gcd(prefixGcd[i], prefixGcd[j]).toLong()
            i++
            j--
        }
        return sum
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val temp = b
            b = a % b
            a = temp
        }
        return a
    }
}
