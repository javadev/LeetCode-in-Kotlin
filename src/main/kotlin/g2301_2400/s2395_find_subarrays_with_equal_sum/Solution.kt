package g2301_2400.s2395_find_subarrays_with_equal_sum

// #Easy #Array #Hash_Table #2023_07_02_Time_143_ms_(100.00%)_Space_34.2_MB_(100.00%)

class Solution {
    fun findSubarrays(nums: IntArray): Boolean {
        val set: MutableSet<Int> = HashSet()
        for (i in 1 until nums.size) {
            if (!set.add(nums[i] + nums[i - 1])) {
                return true
            }
        }
        return false
    }
}
