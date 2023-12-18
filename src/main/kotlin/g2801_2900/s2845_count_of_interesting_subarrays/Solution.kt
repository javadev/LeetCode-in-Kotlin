package g2801_2900.s2845_count_of_interesting_subarrays

// #Medium #Array #Hash_Table #Prefix_Sum #2023_12_18_Time_703_ms_(100.00%)_Space_71.8_MB_(100.00%)

class Solution {
    fun countInterestingSubarrays(nums: List<Int>, modulo: Int, k: Int): Long {
        var prefixCnt = 0
        val freq: MutableMap<Int, Int> = HashMap()
        freq[0] = 1
        var interestingSubarrays: Long = 0
        for (num in nums) {
            if (num % modulo == k) {
                prefixCnt++
            }
            val expectedPrefix = (prefixCnt - k + modulo) % modulo
            interestingSubarrays += freq.getOrDefault(expectedPrefix, 0).toLong()
            freq[prefixCnt % modulo] = freq.getOrDefault(prefixCnt % modulo, 0) + 1
        }
        return interestingSubarrays
    }
}
