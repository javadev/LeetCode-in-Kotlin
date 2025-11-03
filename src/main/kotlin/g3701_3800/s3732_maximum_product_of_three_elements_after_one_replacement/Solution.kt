package g3701_3800.s3732_maximum_product_of_three_elements_after_one_replacement

// #Medium #Weekly_Contest_474 #2025_11_03_Time_6_ms_(100.00%)_Space_75.20_MB_(76.92%)

import kotlin.math.abs

class Solution {
    fun maxProduct(nums: IntArray): Long {
        var a: Long = 0
        var b: Long = 0
        for (x in nums) {
            val ax = abs(x).toLong()
            if (ax >= a) {
                b = a
                a = ax
            } else if (ax > b) {
                b = ax
            }
        }
        return 100000L * a * b
    }
}
