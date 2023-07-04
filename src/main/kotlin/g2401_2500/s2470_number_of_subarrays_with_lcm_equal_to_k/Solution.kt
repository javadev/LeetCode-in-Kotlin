package g2401_2500.s2470_number_of_subarrays_with_lcm_equal_to_k

// #Medium #Array #Math #Number_Theory
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
