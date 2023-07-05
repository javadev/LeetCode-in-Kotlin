package g2401_2500.s2470_number_of_subarrays_with_lcm_equal_to_k

// #Medium #Array #Math #Number_Theory #2023_07_05_Time_232_ms_(100.00%)_Space_35.6_MB_(100.00%)

class Solution {
    fun subarrayLCM(nums: IntArray, k: Int): Int {
        var ans = 0
        for (i in nums.indices) {
            var lcm = nums[i]
            for (j in i until nums.size) {
                lcm = lcm * nums[j] / gcd(lcm, nums[j])
                if (lcm == k) {
                    ans++
                }
                if (k % lcm != 0) {
                    break
                }
            }
        }
        return ans
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
