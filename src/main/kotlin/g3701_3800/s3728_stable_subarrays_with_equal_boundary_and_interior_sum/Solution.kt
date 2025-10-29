package g3701_3800.s3728_stable_subarrays_with_equal_boundary_and_interior_sum

// #Medium #Array #Hash_Table #Prefix_Sum #Weekly_Contest_473
// #2025_10_29_Time_109_ms_(100.00%)_Space_82.32_MB_(88.89%)

class Solution {
    fun countStableSubarrays(capacity: IntArray): Long {
        var sum: Long = 0
        val map: MutableMap<Int, MutableMap<Long, Int>> = HashMap()
        var index = 0
        var ans: Long = 0
        for (c in capacity) {
            sum += c.toLong()
            var elementMap = map[c]
            if (elementMap == null) {
                elementMap = HashMap()
                map[c] = elementMap
                elementMap[sum] = 1
            } else {
                var orDefault = elementMap.getOrDefault(sum - 2 * c, 0)
                elementMap[sum] = elementMap.getOrDefault(sum, 0) + 1
                if (c == 0 && capacity[index - 1] == 0) {
                    orDefault--
                }
                ans += orDefault.toLong()
            }
            index++
        }
        return ans
    }
}
