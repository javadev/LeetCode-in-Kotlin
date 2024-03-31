package g3001_3100.s3066_minimum_operations_to_exceed_threshold_value_ii

// #Medium #Array #Heap_Priority_Queue #Simulation
// #2024_03_31_Time_543_ms_(98.11%)_Space_73.7_MB_(86.79%)

class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        val n = nums.size
        var steps = 0
        nums.sort()
        val extra: MutableList<Int> = ArrayList()
        var i = 0
        var j = 0
        while ((i < n && nums[i] < k) || (j < extra.size && extra[j] < k)) {
            val min = if (i < n && (j >= extra.size || extra[j] > nums[i])) {
                nums[i++]
            } else {
                extra[j++]
            }
            val max = if (i < n && (j >= extra.size || extra[j] > nums[i])) {
                nums[i++]
            } else {
                extra[j++]
            }
            steps++
            var res = min.toLong()
            res = 2 * res + max
            if (res > Int.MAX_VALUE) {
                extra.add(Int.MAX_VALUE)
            } else {
                extra.add(res.toInt())
            }
        }
        return steps
    }
}
