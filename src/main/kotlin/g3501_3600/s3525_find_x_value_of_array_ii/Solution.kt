package g3501_3600.s3525_find_x_value_of_array_ii

// #Hard #2025_04_20_Time_9_ms_(100.00%)_Space_84.76_MB_(100.00%)

class Solution {
    fun resultArray(nums: IntArray, k: Int, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        for (i in queries.indices) {
            val q = queries[i]
            val index = q[0]
            val value = q[1]
            val start = q[2]
            val x = q[3]
            nums[index] = value
            var count = 0
            var currentProduct = 1
            var lProcessed = 0
            for (j in start..<nums.size) {
                currentProduct = (currentProduct * (nums[j] % k)) % k
                lProcessed++
                if (currentProduct == x) {
                    count++
                }
                if (currentProduct == 0) {
                    if (x == 0) {
                        val remaining = (nums.size - start) - lProcessed
                        count += remaining
                    }
                    break
                }
            }
            result[i] = count
        }
        return result
    }
}
