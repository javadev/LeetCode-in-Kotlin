package g2401_2500.s2499_minimum_total_cost_to_make_arrays_unequal

// #Hard #Array #Hash_Table #Greedy #Counting
class Solution {
    fun minimumTotalCost(nums1: IntArray, nums2: IntArray): Long {
        val n = nums1.size
        val bucket = IntArray(n + 1)
        var max = 0
        var maxKey = -1
        var totalBucket = 0
        var cost: Long = 0
        for (i in 0 until n) {
            if (nums1[i] == nums2[i]) {
                if (++bucket[nums1[i]] > max) {
                    max = bucket[nums1[i]]
                    maxKey = nums1[i]
                }
                totalBucket++
                cost += i.toLong()
            }
        }
        val requiredBucket = 2 * max
        if (requiredBucket > n) {
            return -1
        }
        var lackBucket = requiredBucket - totalBucket
        var i = 0
        while (i < n && lackBucket > 0) {
            if (nums1[i] == maxKey || nums2[i] == maxKey || nums1[i] == nums2[i]) {
                i++
                continue
            }
            lackBucket--
            cost += i.toLong()
            i++
        }
        return if (lackBucket > 0) {
            -1
        } else cost
    }
}
