package g2701_2800.s2731_movement_of_robots

// #Medium #Array #Sorting #Prefix_Sum #Brainteaser
// #2023_08_03_Time_414_ms_(100.00%)_Space_61.7_MB_(92.00%)

class Solution {
    fun sumDistance(nums: IntArray, s: String, d: Int): Int {
        val n = nums.size
        val mod = 1e9.toInt() + 7
        for (i in 0 until n) nums[i] += if (s[i] == 'R') d else -d
        nums.sort()
        var res: Long = 0
        for (i in 0 until n) res = (res + (1L + i + i - n) * nums[i]) % mod
        return (res + mod).toInt() % mod
    }
}
