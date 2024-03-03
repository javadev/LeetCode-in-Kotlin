package g3001_3100.s3020_find_the_maximum_number_of_elements_in_subset

import kotlin.math.max

// #Medium #Array #Hash_Table #Enumeration #2024_02_29_Time_51_ms_(94.80%)_Space_57_MB_(41.88%)

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
