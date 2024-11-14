package g3301_3400.s3347_maximum_frequency_of_an_element_after_performing_operations_ii

// #Hard #Array #Sorting #Binary_Search #Prefix_Sum #Sliding_Window
// #2024_11_14_Time_48_ms_(100.00%)_Space_67.8_MB_(93.33%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        nums.sort()
        val n = nums.size
        var l = 0
        var r = 0
        var i = 0
        var j = 0
        var res = 0
        while (i < n) {
            while (j < n && nums[j] == nums[i]) {
                j++
            }
            while (l < i && nums[i] - nums[l] > k) {
                l++
            }
            while (r < n && nums[r] - nums[i] <= k) {
                r++
            }
            res = max(res, (min((i - l + r - j), numOperations) + j - i))
            i = j
        }
        i = 0
        j = 0
        while (i < n && j < n) {
            while (j < n && j - i < numOperations && nums[j] - nums[i] <= k * 2) {
                j++
            }
            res = max(res, (j - i))
            i++
        }
        return res
    }
}
