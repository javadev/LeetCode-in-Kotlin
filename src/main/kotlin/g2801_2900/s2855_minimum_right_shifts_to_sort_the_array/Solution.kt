package g2801_2900.s2855_minimum_right_shifts_to_sort_the_array

// #Easy #Array #2023_12_18_Time_169_ms_(75.00%)_Space_36.7_MB_(50.00%)

@Suppress("kotlin:S6510")
class Solution {
    fun minimumRightShifts(nums: List<Int>): Int {
        var i = 1
        while (i < nums.size) {
            if (nums[i] < nums[i - 1]) {
                break
            }
            i++
        }
        if (nums.size == i) {
            return 0
        } else {
            var k = i + 1
            while (k < nums.size) {
                if (nums[k] <= nums[k - 1]) {
                    break
                }
                k++
            }
            if (k == nums.size && nums[k - 1] < nums[0]) {
                return nums.size - i
            }
            return -1
        }
    }
}
