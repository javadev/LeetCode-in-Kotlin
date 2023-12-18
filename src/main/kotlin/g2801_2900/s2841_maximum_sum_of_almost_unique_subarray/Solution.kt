package g2801_2900.s2841_maximum_sum_of_almost_unique_subarray

// #Medium #Array #Hash_Table #Sliding_Window
// #2023_12_18_Time_387_ms_(100.00%)_Space_46.9_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxSum(nums: List<Int>, m: Int, k: Int): Long {
        val hash = HashMap<Int, Int>()
        var count = 0
        var ans: Long = 0
        var left = 0
        var cur: Long = 0
        for (i in nums.indices) {
            cur += nums[i].toLong()
            if (hash.containsKey(nums[i])) {
                hash[nums[i]] = hash.getValue(nums[i]) + 1
            } else {
                hash[nums[i]] = 1
                count++
            }
            if (i - left + 1 == k) {
                if (count >= m) {
                    ans = max(ans.toDouble(), cur.toDouble()).toLong()
                }
                if (hash[nums[left]]!! > 1) {
                    hash[nums[left]] = hash.getValue(nums[left]) - 1
                } else {
                    count--
                    hash.remove(nums[left])
                }
                cur -= nums[left].toLong()
                left++
            }
        }
        return ans
    }
}
