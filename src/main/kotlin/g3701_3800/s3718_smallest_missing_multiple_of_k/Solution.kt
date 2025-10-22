package g3701_3800.s3718_smallest_missing_multiple_of_k

// #Easy #Array #Hash_Table #Weekly_Contest_472
// #2025_10_21_Time_0_ms_(100.00%)_Space_43.07_MB_(95.91%)

class Solution {
    fun missingMultiple(nums: IntArray, k: Int): Int {
        var i = 1
        while (true) {
            val curr = i * k
            var j = 0
            while (j < nums.size) {
                if (nums[j] == curr) {
                    break
                }
                j++
            }
            if (j == nums.size) {
                return curr
            }
            i++
        }
    }
}
