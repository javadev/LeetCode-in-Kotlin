package g3601_3700.s3640_trionic_array_ii

// #Hard #Weekly_Contest_461 #2025_08_03_Time_7_ms_(100.00%)_Space_79.14_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxSumTrionic(nums: IntArray): Long {
        val n = nums.size
        // The original C++ code has undefined behavior for n=0 due to nums[0].
        // Returning 0 is a safe and conventional default for an empty array.
        if (n == 0) {
            return 0
        }
        // A trionic shape needs at least a peak and a valley. The loop structure
        // naturally handles small arrays (n < 3) by not finding a valid result.
        var res = Long.Companion.MIN_VALUE
        var psum = nums[0].toLong()
        // Pointers to track the subarray's shape:
        // The effective start of the subarray whose sum is in psum.
        var l = 0
        // The index of the most recent "peak".
        var p = 0
        // The index of the most recent "valley".
        var q = 0
        // 'r' is the main iterator, expanding the window to the right.
        for (r in 1..<n) {
            psum += nums[r].toLong()
            if (nums[r - 1] == nums[r]) {
                l = r
                psum = nums[r].toLong()
            } else if (nums[r - 1] > nums[r]) {
                if (r > 1 && nums[r - 2] < nums[r - 1]) {
                    p = r - 1
                    while (l < q) {
                        psum -= nums[l].toLong()
                        l++
                    }
                    while (l + 1 < p && nums[l] < 0) {
                        psum -= nums[l].toLong()
                        l++
                    }
                }
            } else {
                if (r > 1 && nums[r - 2] > nums[r - 1]) {
                    q = r - 1
                }
                if (l < p && p < q) {
                    res = max(res, psum)
                }
            }
        }
        return if (res == Long.Companion.MIN_VALUE) 0 else res
    }
}
