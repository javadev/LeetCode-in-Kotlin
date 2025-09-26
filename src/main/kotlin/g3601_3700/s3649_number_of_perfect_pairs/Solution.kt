package g3601_3700.s3649_number_of_perfect_pairs

// #Medium #Array #Math #Sorting #Two_Pointers #Biweekly_Contest_163
// #2025_08_17_Time_46_ms_(100.00%)_Space_60.00_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun perfectPairs(nums: IntArray): Long {
        val n = nums.size
        val arr = LongArray(n)
        for (i in 0..<n) {
            arr[i] = abs(nums[i].toLong())
        }
        arr.sort()
        var cnt: Long = 0
        var r = 0
        for (i in 0..<n) {
            if (r < i) {
                r = i
            }
            while (r + 1 < n && arr[r + 1] <= 2 * arr[i]) {
                r++
            }
            cnt += (r - i).toLong()
        }
        return cnt
    }
}
