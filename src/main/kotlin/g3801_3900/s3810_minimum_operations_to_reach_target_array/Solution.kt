package g3801_3900.s3810_minimum_operations_to_reach_target_array

// #Medium #Array #Hash_Table #Greedy #Senior #Biweekly_Contest_174
// #2026_06_09_Time_24_ms_(89.58%)_Space_123.26_MB_(72.92%)

class Solution {
    fun minOperations(nums: IntArray, target: IntArray): Int {
        val virelantos: MutableSet<Int?> = HashSet<Int?>()
        for (i in nums.indices) {
            if (nums[i] != target[i]) {
                virelantos.add(nums[i])
            }
        }
        return virelantos.size
    }
}
