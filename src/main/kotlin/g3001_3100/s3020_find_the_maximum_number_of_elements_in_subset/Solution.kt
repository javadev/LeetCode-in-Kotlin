package g3001_3100.s3020_find_the_maximum_number_of_elements_in_subset

// #Medium #Array #Hash_Table #Enumeration #2024_03_03_Time_626_ms_(82.22%)_Space_57.8_MB_(80.00%)

import kotlin.math.max

class Solution {
    fun maximumLength(nums: IntArray): Int {
        return withHashMap(nums)
    }

    private fun withHashMap(nums: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        var ans = 0
        if (map.containsKey(1)) {
            ans = if (map[1]!! % 2 == 0) {
                map[1]!! - 1
            } else {
                map[1]!!
            }
        }
        for (key in map.keys) {
            if (key == 1) {
                continue
            }
            val len = findSeries(map, key)
            ans = max(ans, len)
        }
        return ans
    }

    private fun findSeries(map: Map<Int, Int>, key: Int): Int {
        val sqr = key * key
        return if (map.containsKey(sqr)) {
            if (map[key]!! >= 2) {
                2 + findSeries(map, sqr)
            } else {
                1
            }
        } else {
            1
        }
    }
}
