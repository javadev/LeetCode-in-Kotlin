package g3201_3300.s3229_minimum_operations_to_make_array_equal_to_target

// #Hard #Array #Dynamic_Programming #Greedy #Stack #Monotonic_Stack
// #2024_07_23_Time_636_ms_(57.14%)_Space_71.7_MB_(28.57%)

class Solution {
    fun minimumOperations(nums: IntArray, target: IntArray): Long {
        val n = nums.size
        var incr: Long = 0
        var decr: Long = 0
        var ops: Long = 0
        for (i in 0 until n) {
            val diff = target[i] - nums[i]
            if (diff > 0) {
                if (incr < diff) {
                    ops += diff - incr
                }
                incr = diff.toLong()
                decr = 0
            } else if (diff < 0) {
                if (decr < -diff) {
                    ops += -diff - decr
                }
                decr = -diff.toLong()
                incr = 0
            } else {
                decr = 0
                incr = decr
            }
        }
        return ops
    }
}
