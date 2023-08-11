package g1801_1900.s1822_sign_of_the_product_of_an_array

// #Easy #Array #Math #Programming_Skills_I_Day_4_Loop
// #2023_06_20_Time_170_ms_(92.51%)_Space_37.4_MB_(90.60%)

class Solution {
    fun arraySign(nums: IntArray): Int {
        var negativeCount = 0
        for (num in nums) {
            if (num == 0) {
                return 0
            } else if (num < 0) {
                negativeCount++
            }
        }
        return if (negativeCount % 2 == 0) 1 else -1
    }
}
