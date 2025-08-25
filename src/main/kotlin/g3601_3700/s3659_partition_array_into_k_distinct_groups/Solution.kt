package g3601_3700.s3659_partition_array_into_k_distinct_groups

// #Medium #Weekly_Contest_464 #2025_08_25_Time_96_ms_(100.00%)_Space_93.60_MB_(100.00%)

class Solution {
    fun partitionArray(nums: IntArray, k: Int): Boolean {
        val mpp = HashMap<Int, Int>()
        for (x in nums) {
            mpp.put(x, mpp.getOrDefault(x, 0) + 1)
        }
        for (count in mpp.values) {
            if (count > nums.size / k) {
                return false
            }
        }
        return nums.size % k == 0
    }
}
