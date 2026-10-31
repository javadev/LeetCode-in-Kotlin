package g3801_3900.s3895_count_digit_appearances

// #Medium #Array #Math #Senior #Biweekly_Contest_180
// #2026_08_11_Time_3_ms_(100.00%)_Space_47.13_MB_(17.84%)

class Solution {
    fun countDigitOccurrences(nums: IntArray, digit: Int): Int {
        var ans = 0
        for (num in nums) {
            var num = num
            while (num > 9) {
                if ((num % 10) == digit) {
                    ans++
                }
                num /= 10
            }
            if (num == digit) {
                ans++
            }
        }
        return ans
    }
}
