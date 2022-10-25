package g0201_0300.s0220_contains_duplicate_iii

// #Medium #Array #Sorting #Sliding_Window #Ordered_Set #Bucket_Sort
// #2022_10_25_Time_921_ms_(72.22%)_Space_77.4_MB_(41.67%)

class Solution {
    private fun getId(i: Long, w: Long): Long {
        return if (i < 0) (i + 1) / w - 1 else i / w
    }

    fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
        if (t < 0) {
            return false
        }
        val d: MutableMap<Long, Long> = HashMap()
        val w = t.toLong() + 1
        for (i in nums.indices) {
            val m = getId(nums[i].toLong(), w)
            if (d.containsKey(m)) {
                return true
            }
            if (d.containsKey(m - 1) && Math.abs(nums[i] - d[m - 1]!!) < w) {
                return true
            }
            if (d.containsKey(m + 1) && Math.abs(nums[i] - d[m + 1]!!) < w) {
                return true
            }
            d[m] = nums[i].toLong()
            if (i >= k) {
                d.remove(getId(nums[i - k].toLong(), w))
            }
        }
        return false
    }
}