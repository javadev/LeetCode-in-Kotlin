package g3101_3200.s3153_sum_of_digit_differences_of_all_pairs

// #Medium #Array #Hash_Table #Math #Counting
// #2024_05_25_Time_491_ms_(95.74%)_Space_61.5_MB_(48.94%)

class Solution {
    fun sumDigitDifferences(nums: IntArray): Long {
        var result: Long = 0
        while (nums[0] > 0) {
            val counts = IntArray(10)
            for (i in nums.indices) {
                val digit = nums[i] % 10
                nums[i] = nums[i] / 10
                result += (i - counts[digit]).toLong()
                counts[digit]++
            }
        }
        return result
    }
}
