package g3401_3500.s3410_maximize_subarray_sum_after_removing_all_occurrences_of_one_element

// #Hard #Array #Dynamic_Programming #Segment_Tree
// #2025_01_07_Time_80_(100.00%)_Space_68.87_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxSubarraySum(nums: IntArray): Long {
        val prefixMap: MutableMap<Long?, Long?> = HashMap<Long?, Long?>()
        var result = nums[0].toLong()
        var prefixSum: Long = 0
        var minPrefix: Long = 0
        prefixMap.put(0L, 0L)
        for (num in nums) {
            prefixSum += num.toLong()
            result = max(result, (prefixSum - minPrefix))
            if (num < 0) {
                if (prefixMap.containsKey(num.toLong())) {
                    prefixMap.put(
                        num.toLong(),
                        min(prefixMap[num.toLong()]!!, prefixMap[0L]!!) + num,
                    )
                } else {
                    prefixMap.put(num.toLong(), prefixMap[0L]!! + num)
                }
                minPrefix = min(minPrefix, prefixMap[num.toLong()]!!)
            }
            prefixMap.put(0L, min(prefixMap[0L]!!, prefixSum))
            minPrefix = min(minPrefix.toDouble(), prefixMap.get(0L)!!.toDouble()).toLong()
        }
        return result
    }
}
