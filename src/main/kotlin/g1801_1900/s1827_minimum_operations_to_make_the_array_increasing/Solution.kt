package g1801_1900.s1827_minimum_operations_to_make_the_array_increasing

// #Easy #Array #Greedy #2023_06_21_Time_208_ms_(100.00%)_Space_38.9_MB_(77.78%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        var minsOps = 0
        for (i in 1 until nums.size) {
            if (nums[i] <= nums[i - 1]) {
                minsOps += nums[i - 1] - nums[i] + 1
                nums[i] = nums[i - 1] + 1
            }
        }
        return minsOps
    }
}
