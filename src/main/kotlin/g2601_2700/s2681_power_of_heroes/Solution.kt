package g2601_2700.s2681_power_of_heroes

// #Hard #Array #Math #Sorting #Prefix_Sum #2023_07_27_Time_454_ms_(85.71%)_Space_57.2_MB_(85.71%)

class Solution {
    private val mod = 1_000_000_007L
    fun sumOfPower(nums: IntArray): Int {
        nums.sort()
        var sumOfMin = 0L
        var res = 0L
        for (num in nums) {
            val max = (num.toLong() * num.toLong()) % mod
            val mySumOfMin = (sumOfMin + num) % mod
            res = (res + max * mySumOfMin) % mod
            sumOfMin = (sumOfMin + mySumOfMin) % mod
        }
        return res.toInt()
    }
}
