package g3801_3900.s3886_sum_of_sortable_integers

import kotlin.math.max
import kotlin.math.min

// #Hard #Array #Math #Sorting #Enumeration #Senior_Staff #Weekly_Contest_495
// #2026_08_13_Time_8_ms_(98.86%)_Space_67.62_MB_(98.86%)

class Solution {
    // Changed method name from sumOfSortableIntegers to sortableIntegers
    fun sortableIntegers(nums: IntArray): Int {
        val n = nums.size
        if (n == 0) {
            return 0
        }
        val prefMax = IntArray(n)
        prefMax[0] = nums[0]
        for (i in 1..<n) {
            prefMax[i] = max(prefMax[i - 1], nums[i])
        }
        val suffMin = IntArray(n)
        suffMin[n - 1] = nums[n - 1]
        for (i in n - 2 downTo 0) {
            suffMin[i] = min(suffMin[i + 1], nums[i])
        }
        val prefDrops = IntArray(n)
        for (i in 1..<n) {
            prefDrops[i] = prefDrops[i - 1] + (if (nums[i - 1] > nums[i]) 1 else 0)
        }
        var sumOfK = 0
        for (k in 1..n) {
            if (n % k == 0 && (isSortable(k, n, nums, prefMax, suffMin, prefDrops))) {
                sumOfK += k
            }
        }
        return sumOfK
    }

    private fun isSortable(
        k: Int,
        n: Int,
        nums: IntArray,
        prefMax: IntArray,
        suffMin: IntArray,
        prefDrops: IntArray,
    ): Boolean {
        var idx = k
        while (idx < n) {
            if (prefMax[idx - 1] > suffMin[idx]) {
                return false
            }
            idx += k
        }
        var start = 0
        while (start < n) {
            val end = start + k - 1
            val internalDrops = prefDrops[end] - prefDrops[start]
            val cyclicDrop = if (nums[end] > nums[start]) 1 else 0
            if (internalDrops + cyclicDrop > 1) {
                return false
            }
            start += k
        }
        return true
    }
}
