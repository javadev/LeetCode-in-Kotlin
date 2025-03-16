package g3401_3500.s3488_closest_equal_element_queries

// #Medium #2025_03_16_Time_93_ms_(100.00%)_Space_99.42_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun solveQueries(nums: IntArray, queries: IntArray): List<Int> {
        val sz = nums.size
        val indices: MutableMap<Int, MutableList<Int>> = HashMap<Int, MutableList<Int>>()
        for (i in 0..<sz) {
            indices.computeIfAbsent(nums[i]) { _: Int -> ArrayList<Int>() }.add(i)
        }
        for (arr in indices.values) {
            val m = arr.size
            if (m == 1) {
                nums[arr[0]] = -1
                continue
            }
            for (i in 0..<m) {
                val j: Int = arr[i]
                val f: Int = arr[(i + 1) % m]
                val b: Int = arr[(i - 1 + m) % m]
                val forward = min(((sz - j - 1) + f + 1), abs((j - f)))
                val backward = min(abs((b - j)), (j + (sz - b)))
                nums[j] = min(backward, forward)
            }
        }
        val res: MutableList<Int> = ArrayList<Int>()
        for (q in queries) {
            res.add(nums[q])
        }
        return res
    }
}
