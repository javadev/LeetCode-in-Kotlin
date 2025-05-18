package g3501_3600.s3550_smallest_index_with_digit_sum_equal_to_index

// #Easy #2025_05_18_Time_1_ms_(100.00%)_Space_44.87_MB_(100.00%)

class Solution {
    private fun sum(num: Int): Int {
        var num = num
        var s = 0
        while (num > 0) {
            s += num % 10
            num /= 10
        }
        return s
    }

    fun smallestIndex(nums: IntArray): Int {
        for (i in nums.indices) {
            if (i == sum(nums[i])) {
                return i
            }
        }
        return -1
    }
}
