package g3301_3400.s3355_zero_array_transformation_i

// #Medium #Array #Prefix_Sum #2024_11_19_Time_6_ms_(36.84%)_Space_94_MB_(100.00%)

class Solution {
    fun isZeroArray(nums: IntArray, queries: Array<IntArray>): Boolean {
        val n = nums.size
        var sum = 0
        for (num in nums) {
            sum += num
        }
        if (sum == 0) {
            return true
        }
        val diff = IntArray(n + 1)
        for (q in queries) {
            val low = q[0]
            val high = q[1]
            diff[low] -= 1
            if (high + 1 < n) {
                diff[high + 1] += 1
            }
        }
        for (i in 0.rangeUntil(n)) {
            if (i > 0) {
                diff[i] += diff[i - 1]
            }
            nums[i] += diff[i]
            sum += diff[i]
            if (nums[i] > 0) {
                return false
            }
        }
        return sum <= 0
    }
}
