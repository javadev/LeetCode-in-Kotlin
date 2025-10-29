package g3701_3800.s3729_count_distinct_subarrays_divisible_by_k_in_sorted_array

// #Hard #Array #Hash_Table #Prefix_Sum #Weekly_Contest_473
// #2025_10_29_Time_61_ms_(100.00%)_Space_80.76_MB_(100.00%)

class Solution {
    fun numGoodSubarrays(nums: IntArray, k: Int): Long {
        val cnt: MutableMap<Int, Int> = HashMap(nums.size, 1f)
        cnt[0] = 1
        var sum: Long = 0
        var lastStart = 0
        var ans: Long = 0
        for (i in nums.indices) {
            val x = nums[i]
            if (i > 0 && x != nums[i - 1]) {
                var s = sum
                for (t in i - lastStart downTo 1) {
                    cnt.merge((s % k).toInt(), 1) { a: Int, b: Int -> Integer.sum(a, b) }
                    s -= nums[i - 1].toLong()
                }
                lastStart = i
            }
            sum += x.toLong()
            ans += cnt.getOrDefault((sum % k).toInt(), 0).toLong()
        }
        return ans
    }
}
