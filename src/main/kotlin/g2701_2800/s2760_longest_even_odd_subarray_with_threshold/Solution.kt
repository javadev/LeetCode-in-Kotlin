package g2701_2800.s2760_longest_even_odd_subarray_with_threshold

// #Easy #Array #Sliding_Window #2023_08_09_Time_285_ms_(95.45%)_Space_46.8_MB_(31.82%)

class Solution {
    fun longestAlternatingSubarray(nums: IntArray, threshold: Int): Int {
        var maxLength = 0
        var i = 0
        while (i < nums.size) {
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                var length = 1
                var j = i + 1
                while (j < nums.size &&
                    nums[j] <= threshold &&
                    nums[j] % 2 != nums[j - 1] % 2
                ) {
                    length++
                    j++
                }
                maxLength = maxLength.coerceAtLeast(length)
                i = j - 1
            }
            i++
        }
        return maxLength
    }
}
