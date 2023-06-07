package g1201_1300.s1250_check_if_it_is_a_good_array

// #Hard #Array #Math #Number_Theory
class Solution {
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else gcd(b, a % b)
    }

    fun isGoodArray(nums: IntArray): Boolean {
        var ans = nums[0]
        for (element in nums) {
            ans = gcd(ans, element)
            if (ans == 1) {
                return true
            }
        }
        return false
    }
}
