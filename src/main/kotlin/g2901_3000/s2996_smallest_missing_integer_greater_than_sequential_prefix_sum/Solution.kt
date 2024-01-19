package g2901_3000.s2996_smallest_missing_integer_greater_than_sequential_prefix_sum

// #Easy #Array #Hash_Table #Sorting #2024_01_19_Time_174_ms_(83.33%)_Space_37.4_MB_(71.43%)

class Solution {
    fun missingInteger(nums: IntArray): Int {
        val n = nums.size
        var sum = nums[0]
        for (i in 1 until n) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i]
            } else {
                break
            }
        }
        nums.sort()
        for (no in nums) {
            if (no == sum) {
                sum++
            }
        }
        return sum
    }
}
