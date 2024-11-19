package g2401_2500.s2447_number_of_subarrays_with_gcd_equal_to_k

// #Medium #Array #Math #Number_Theory #2023_07_05_Time_180_ms_(100.00%)_Space_36.2_MB_(100.00%)

class Solution {
    private fun sol(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else {
            sol(b, a % b)
        }
    }

    fun subarrayGCD(nums: IntArray, k: Int): Int {
        val n = nums.size
        var cnt = 0
        for (i in 0 until n) {
            var gcd = 0
            for (j in i until n) {
                gcd = sol(gcd, nums[j])
                if (gcd == k) {
                    cnt++
                }
                if (gcd < k) {
                    break
                }
            }
        }
        return cnt
    }
}
