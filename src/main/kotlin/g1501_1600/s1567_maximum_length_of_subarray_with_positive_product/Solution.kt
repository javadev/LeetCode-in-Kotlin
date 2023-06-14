package g1501_1600.s1567_maximum_length_of_subarray_with_positive_product

// #Medium #Array #Dynamic_Programming #Greedy #Dynamic_Programming_I_Day_6
// #2023_06_14_Time_468_ms_(33.33%)_Space_51.6_MB_(83.33%)

class Solution {
    fun getMaxLen(nums: IntArray): Int {
        var posLen = 0
        var negLen = 0
        var res = 0
        for (num in nums) {
            if (num == 0) {
                posLen = 0
                negLen = 0
            } else if (num > 0) {
                posLen++
                negLen = if (negLen == 0) 0 else negLen + 1
            } else {
                val temp = posLen
                posLen = if (negLen == 0) 0 else negLen + 1
                negLen = temp + 1
            }
            res = Math.max(res, posLen)
        }
        return res
    }
}
