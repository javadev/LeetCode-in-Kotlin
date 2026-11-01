package g3901_4000.s3912_valid_elements_in_an_array

// #Easy #Array #Mid_Level #Weekly_Contest_499
// #2026_09_17_Time_1_ms_(100.00%)_Space_46.47_MB_(82.58%)

class Solution {
    fun findValidElements(nums: IntArray): MutableList<Int> {
        val ans: MutableList<Int> = ArrayList<Int>()
        val n = nums.size
        ans.add(nums[0])
        for (i in 1..<n - 1) {
            var left = true
            var right = true
            for (j in 0..<i) {
                if (nums[i] <= nums[j]) {
                    left = false
                    break
                }
            }
            for (j in i + 1..<n) {
                if (nums[i] <= nums[j]) {
                    right = false
                    break
                }
            }
            if (left || right) {
                ans.add(nums[i])
            }
        }
        if (n > 1) {
            ans.add(nums[n - 1])
        }
        return ans
    }
}
