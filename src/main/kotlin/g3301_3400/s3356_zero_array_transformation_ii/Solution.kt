package g3301_3400.s3356_zero_array_transformation_ii

// #Medium #Array #Binary_Search #Prefix_Sum #2024_11_19_Time_5_ms_(100.00%)_Space_132.4_MB_(46.67%)

class Solution {
    fun minZeroArray(nums: IntArray, queries: Array<IntArray>): Int {
        val diff = IntArray(nums.size)
        var idx = 0
        var d = 0
        for (i in nums.indices) {
            d += diff[i]
            while (nums[i] + d > 0 && idx < queries.size) {
                val q = queries[idx]
                if (i >= q[0] && i <= q[1]) {
                    d -= q[2]
                }
                diff[q[0]] -= q[2]
                if (q[1] + 1 < nums.size) {
                    diff[q[1] + 1] += q[2]
                }
                idx++
            }
            if (nums[i] + d > 0) {
                return -1
            }
        }
        return idx
    }
}
