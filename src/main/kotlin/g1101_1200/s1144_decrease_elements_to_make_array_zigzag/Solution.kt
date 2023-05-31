package g1101_1200.s1146_snapshot_array

// #Medium #Array #Hash_Table #Binary_Search #Design #Binary_Search_II_Day_18
// #2023_05_31_Time_1064_ms_(57.14%)_Space_163_MB_(7.14%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun movesToMakeZigzag(nums: IntArray): Int {
        var nums = nums
        var ans: Int
        val n = nums.size
        var cur = 0
        if (n == 1) {
            return 0
        }
        val clone = nums.clone()
        run {
            var i = 0
            while (i < n) {
                if (i == 0) {
                    if (nums[i] <= nums[i + 1]) {
                        cur += nums[i + 1] - nums[i] + 1
                        nums[i + 1] = nums[i] - 1
                    }
                } else if (i == n - 1) {
                    if (nums[i] <= nums[i - 1]) {
                        cur += nums[i - 1] - nums[i] + 1
                    }
                } else {
                    if (nums[i] <= nums[i + 1]) {
                        cur += nums[i + 1] - nums[i] + 1
                        nums[i + 1] = nums[i] - 1
                    }
                    if (nums[i] <= nums[i - 1]) {
                        cur += nums[i - 1] - nums[i] + 1
                    }
                }
                i += 2
            }
        }
        ans = cur
        cur = 0
        nums = clone
        var i = 1
        while (i < n) {
            if (i != n - 1 && nums[i] <= nums[i + 1]) {
                cur += nums[i + 1] - nums[i] + 1
                nums[i + 1] = nums[i] - 1
            }
            if (nums[i] <= nums[i - 1]) {
                cur += nums[i - 1] - nums[i] + 1
            }
            i += 2
        }
        ans = Math.min(ans, cur)
        return ans
    }
}
