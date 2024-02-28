package g3001_3100.s3012_minimize_length_of_array_using_operations

// #Medium #Array #Math #Greedy #Number_Theory
// #2024_02_28_Time_533_ms_(86.36%)_Space_63.5_MB_(86.36%)

class Solution {
    fun minimumArrayLength(nums: IntArray): Int {
        var min = nums[0]
        var max = nums[0]
        for (i in nums) {
            if (i < min) {
                min = i
            }
            if (i > max) {
                max = i
            }
        }
        val n = nums.size
        if (n == 1) {
            return 1
        }
        if (max % min != 0) {
            return 1
        }
        var count = 0
        for (i in nums) {
            if (i % min != 0 && i % min < min) {
                return 1
            }
            if (i == min) {
                count++
            }
        }
        return (count + 1) / 2
    }
}
