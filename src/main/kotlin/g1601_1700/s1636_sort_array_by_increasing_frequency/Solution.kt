package g1601_1700.s1636_sort_array_by_increasing_frequency

// #Easy #Array #Hash_Table #Sorting #2023_06_17_Time_222_ms_(95.65%)_Space_37.2_MB_(95.65%)

import java.util.Collections
import java.util.TreeMap

class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val count: MutableMap<Int, Int> = HashMap()
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }
        val map = TreeMap<Int, MutableList<Int>>()
        for ((key, freq) in count) {
            map.putIfAbsent(freq, ArrayList())
            val list = map[freq]!!
            list.add(key)
            map[freq] = list
        }
        val result = IntArray(nums.size)
        var i = 0
        for (entry in map.entries) {
            val list = entry.value
            list.sortWith(Collections.reverseOrder<Any>())
            var k = entry.key
            var j = 0
            while (j < list.size) {
                while (k-- > 0) {
                    result[i++] = list[j]
                }
                j++
                k = entry.key
            }
        }
        return result
    }
}
