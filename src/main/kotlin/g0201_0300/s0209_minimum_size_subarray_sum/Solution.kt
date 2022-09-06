package g0201_0300.s0209_minimum_size_subarray_sum

// #Medium #Array #Binary_Search #Prefix_Sum #Sliding_Window #Algorithm_II_Day_5_Sliding_Window
// #Binary_Search_II_Day_1 #2022_06_28_Time_1_ms_(100.00%)_Space_50.1_MB_(11.60%)
class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var i = 0
        var j = 0
        var sum = 0
        var min = Int.MAX_VALUE
        while (j < nums.size) {
            sum += nums[j]
            if (sum >= target) {
                while (i <= j) {
                    if (sum - nums[i] >= target) {
                        sum = sum - nums[i]
                        i++
                    } else {
                        break
                    }
                }
                if (j - i + 1 < min) {
                    min = j - i + 1
                }
            }
            j++
        }
        return if (min == Int.MAX_VALUE) {
            0
        } else min
    }
}
