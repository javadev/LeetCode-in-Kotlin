package g3001_3100.s3002_maximum_size_of_a_set_after_removals

// #Medium #Array #Hash_Table #Greedy #2024_02_28_Time_467_ms_(100.00%)_Space_51.9_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun maximumSetSize(nums1: IntArray, nums2: IntArray): Int {
        val uniq1 = HashSet<Int>()
        val uniq2 = HashSet<Int>()
        for (i in nums1.indices) {
            uniq1.add(nums1[i])
            uniq2.add(nums2[i])
        }
        var common = 0
        if (uniq1.size <= uniq2.size) {
            for (u in uniq1) {
                if (uniq2.contains(u)) {
                    common++
                }
            }
        } else {
            for (u in uniq2) {
                if (uniq1.contains(u)) {
                    common++
                }
            }
        }
        val half = nums1.size / 2
        val from1 = min(uniq1.size - common, half)
        val from2 = min(uniq2.size - common, half)
        val takeFromCommon1 = half - from1
        val takeFromCommon2 = half - from2
        return from1 + from2 + min(takeFromCommon1 + takeFromCommon2, common)
    }
}
