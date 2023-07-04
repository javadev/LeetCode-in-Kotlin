package g2401_2500.s2419_longest_subarray_with_maximum_bitwise_and

// #Medium #Array #Bit_Manipulation #Brainteaser
// #2023_07_04_Time_487_ms_(100.00%)_Space_53_MB_(100.00%)

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var maxVal = 0
        var res = 0
        var i = 0
        while (i < nums.size) {
            val n = nums[i]
            if (n < maxVal) {
                i++
                continue
            }
            if (n > maxVal) {
                maxVal = n
                res = 0
            }
            var j = i + 1
            while (j < nums.size && nums[j] == n) {
                j++
            }
            res = res.coerceAtLeast(j - i)
            i = j - 1
            i++
        }
        return res
    }
}
