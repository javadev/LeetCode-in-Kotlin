package g3701_3800.s3795_minimum_subarray_length_with_distinct_sum_at_least_k

// #Medium #Array #Hash_Table #Sliding_Window #Senior #Biweekly_Contest_173
// #2026_05_22_Time_88_ms_(85.14%)_Space_207.14_MB_(6.02%)

import kotlin.math.min

class Solution {
    fun minLength(nums: IntArray, k: Int): Int {
        for (i in nums) {
            if (i >= k) {
                return 1
            }
        }
        var ans = Int.MAX_VALUE
        val alt = -1
        var i = 0
        var j = 1
        var sum = nums[0]
        if (sum >= k) {
            return 1
        }
        val hm: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        hm.put(nums[0], 1)
        while (i < nums.size && j < nums.size) {
            hm.put(nums[j], hm.getOrDefault(nums[j], 0)!! + 1)
            if (hm.get(nums[j]) == 1) {
                sum += nums[j]
            }
            while (sum >= k) {
                ans = min(ans, j - i + 1)
                hm[nums[i]] = hm.get(nums[i])!! - 1
                if (hm.get(nums[i]) == 0) {
                    sum -= nums[i]
                }
                i++
            }
            j++
        }
        return if (ans != Int.MAX_VALUE) ans else alt
    }
}
