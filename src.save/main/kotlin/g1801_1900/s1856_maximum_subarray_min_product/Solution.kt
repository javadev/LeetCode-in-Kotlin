package g1801_1900.s1856_maximum_subarray_min_product

// #Medium #Array #Stack #Prefix_Sum #Monotonic_Stack
// #2023_06_22_Time_517_ms_(66.67%)_Space_57.4_MB_(66.67%)

class Solution {
    fun maxSumMinProduct(nums: IntArray): Int {
        val n = nums.size
        val mod = (1e9 + 7).toInt()
        if (n == 1) {
            return (nums[0].toLong() * nums[0].toLong() % mod).toInt()
        }
        val left = IntArray(n)
        left[0] = -1
        for (i in 1 until n) {
            var p = i - 1
            while (p >= 0 && nums[p] >= nums[i]) {
                p = left[p]
            }
            left[i] = p
        }
        val right = IntArray(n)
        right[n - 1] = n
        for (i in n - 2 downTo 0) {
            var p = i + 1
            while (p < n && nums[p] >= nums[i]) {
                p = right[p]
            }
            right[i] = p
        }
        var res = 0L
        val preSum = LongArray(n)
        preSum[0] = nums[0].toLong()
        for (i in 1 until n) {
            preSum[i] = preSum[i - 1] + nums[i]
        }
        for (i in 0 until n) {
            val sum = if (left[i] == -1) preSum[right[i] - 1] else preSum[right[i] - 1] - preSum[left[i]]
            val cur = nums[i] * sum
            res = Math.max(cur, res)
        }
        return (res % mod).toInt()
    }
}
