package g2901_3000.s2945_find_maximum_non_decreasing_array_length

// #Hard #Array #Dynamic_Programming #Binary_Search #Stack #Monotonic_Stack #Queue #Monotonic_Queue
// #2023_12_31_Time_636_ms_(87.50%)_Space_64_MB_(87.50%)

class Solution {
    fun findMaximumLength(nums: IntArray): Int {
        val n = nums.size
        val que = IntArray(n + 1)
        var write = 0
        var read = 0
        val prefixSum = LongArray(n + 1)
        val sums = LongArray(n + 1)
        val count = IntArray(n + 1)
        for (i in 1..n) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1]
            while (read < write && prefixSum[i] >= sums[read + 1]) {
                read++
            }
            val j = que[read]
            val subarraySum = prefixSum[i] - prefixSum[j]
            count[i] = count[j] + 1
            val sum = prefixSum[i] + subarraySum
            while (sum <= sums[write]) {
                write--
            }
            que[++write] = i
            sums[write] = sum
        }
        return count[n]
    }
}
