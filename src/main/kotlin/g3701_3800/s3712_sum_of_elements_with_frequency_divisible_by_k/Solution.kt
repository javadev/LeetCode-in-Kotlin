package g3701_3800.s3712_sum_of_elements_with_frequency_divisible_by_k

// #Easy #Array #Hash_Table #Counting #Weekly_Contest_471
// #2025_10_14_Time_2_ms_(95.65%)_Space_42.93_MB_(91.30%)

import kotlin.math.max

class Solution {
    fun sumDivisibleByK(nums: IntArray, k: Int): Int {
        var max = 0
        var sum = 0
        for (num in nums) {
            max = max(num, max)
        }
        val cnt = IntArray(max + 1)
        for (num in nums) {
            cnt[num]++
        }
        for (i in 1..<cnt.size) {
            if (cnt[i] != 0 && cnt[i] % k == 0) {
                sum += i * cnt[i]
            }
        }
        return sum
    }
}
