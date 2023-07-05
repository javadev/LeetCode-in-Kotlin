package g2401_2500.s2401_longest_nice_subarray

// #Medium #Array #Bit_Manipulation #Sliding_Window
// #2023_07_03_Time_507_ms_(100.00%)_Space_54.7_MB_(100.00%)

class Solution {
    fun longestNiceSubarray(nums: IntArray): Int {
        var ans = 1
        var left = 0
        var right = 0
        while (right < nums.size) {
            for (i in right - 1 downTo left) {
                if (nums[i] and nums[right] != 0) {
                    left = i + 1
                    break
                }
                if (i == left) {
                    ans = ans.coerceAtLeast(right - left + 1)
                }
            }
            right++
        }
        return ans
    }
}
