package g3901_4000.s3927_minimize_array_sum_using_divisible_replacements

// #Medium #Array #Hash_Table #Math #Greedy #Number_Theory #Staff #Weekly_Contest_501
// #2026_09_29_Time_11_ms_(96.83%)_Space_130.23_MB_(43.65%)

class Solution {
    fun minArraySum(nums: IntArray): Long {
        var max = 0
        var sum: Long = 0
        for (num in nums) {
            if (num == 1) {
                return nums.size.toLong()
            }
            if (num > max) {
                max = num
            }
        }
        val min = IntArray(max + 1)
        for (num in nums) {
            min[num] = num
        }
        for (num in nums) {
            if (min[num] < num) {
                continue
            }
            var i = num
            while (i <= max) {
                if (num < min[i]) {
                    min[i] = num
                }
                i += num
            }
        }
        for (num in nums) {
            sum += min[num].toLong()
        }
        return sum
    }
}
