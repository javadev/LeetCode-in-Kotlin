package g0601_0700.s0689_maximum_sum_of_3_non_overlapping_subarrays

// #Hard #Array #Dynamic_Programming #2023_02_20_Time_248_ms_(100.00%)_Space_37.6_MB_(100.00%)

class Solution {
    fun maxSumOfThreeSubarrays(nums: IntArray, k: Int): IntArray {
        val len = nums.size
        if (len < 3 * k) {
            return intArrayOf()
        }
        val res = IntArray(3)
        val left = Array(2) { IntArray(len) }
        val right = Array(2) { IntArray(len) }
        var s = 0
        for (i in 0 until k) {
            s += nums[i]
        }
        left[0][k - 1] = s
        run {
            var i = k
            while (i + 2 * k <= len) {
                s = s + nums[i] - nums[i - k]
                if (s > left[0][i - 1]) {
                    left[0][i] = s
                    left[1][i] = i - k + 1
                } else {
                    left[0][i] = left[0][i - 1]
                    left[1][i] = left[1][i - 1]
                }
                i++
            }
        }
        s = 0
        for (i in len - 1 downTo len - k) {
            s += nums[i]
        }
        right[0][len - k] = s
        right[1][len - k] = len - k
        for (i in len - k - 1 downTo 0) {
            s = s + nums[i] - nums[i + k]
            if (s >= right[0][i + 1]) {
                right[0][i] = s
                right[1][i] = i
            } else {
                right[0][i] = right[0][i + 1]
                right[1][i] = right[1][i + 1]
            }
        }
        var mid = 0
        for (i in k until 2 * k) {
            mid += nums[i]
        }
        var max = 0
        var i = k
        while (i + 2 * k <= len) {
            val total = left[0][i - 1] + right[0][i + k] + mid
            if (total > max) {
                res[0] = left[1][i - 1]
                res[1] = i
                res[2] = right[1][i + k]
                max = total
            }
            mid = mid + nums[i + k] - nums[i]
            i++
        }
        return res
    }
}
