package g3301_3400.s3396_minimum_number_of_operations_to_make_elements_in_array_distinct

// #Easy #2024_12_22_Time_9_ms_(100.00%)_Space_37.9_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val map: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        var dupct = 0
        for (num in nums) {
            map.put(num, map.getOrDefault(num, 0)!! + 1)
            if (map.get(num) == 2) {
                dupct++
            }
        }
        val n = nums.size
        var i = 0
        var op = 0
        while (dupct > 0) {
            op++
            val limit = min(n, (i + 3))
            while (i < limit) {
                val `val`: Int = map[nums[i]]!!
                if (`val` == 2) {
                    dupct--
                }
                map.put(nums[i], `val` - 1)
                i++
            }
        }
        return op
    }
}
