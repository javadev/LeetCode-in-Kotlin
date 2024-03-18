package g0401_0500.s0454_4sum_ii

// #Medium #Array #Hash_Table #2022_12_26_Time_660_ms_(85.71%)_Space_48.4_MB_(82.86%)

class Solution {
    fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
        var count = 0
        val map: MutableMap<Int, Int> = HashMap()
        for (k in nums3) {
            for (i in nums4) {
                val sum = k + i
                map[sum] = map.getOrDefault(sum, 0) + 1
            }
        }
        for (k in nums1) {
            for (i in nums2) {
                val m = -(k + i)
                count += map.getOrDefault(m, 0)
            }
        }
        return count
    }
}
