package g1401_1500.s1493_longest_subarray_of_1s_after_deleting_one_element

// #Medium #Dynamic_Programming #Math #Sliding_Window
// #2023_06_13_Time_288_ms_(73.85%)_Space_46.3_MB_(70.77%)

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var s = 0
        var e = 0
        var max = Int.MIN_VALUE
        var extraZero = false
        var allOne = true
        while (e < nums.size) {
            if (nums[e] == 1) {
                e++
            } else if (!extraZero) {
                allOne = false
                extraZero = true
                e++
            } else {
                allOne = false
                max = Math.max(max, e - s - 1)
                while (nums[s] != 0) {
                    s++
                }
                s++
                extraZero = false
            }
        }
        if (nums[e - 1] == 1) {
            max = Math.max(max, e - s - 1)
        }
        if (allOne) {
            return nums.size - 1
        }
        return if (max == Int.MIN_VALUE) 0 else max
    }
}
