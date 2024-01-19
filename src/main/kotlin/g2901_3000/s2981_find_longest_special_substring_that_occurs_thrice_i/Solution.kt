package g2901_3000.s2981_find_longest_special_substring_that_occurs_thrice_i

// #Medium #String #Hash_Table #Binary_Search #Counting #Sliding_Window
// #2024_01_19_Time_208_ms_(90.70%)_Space_39.1_MB_(23.26%)

import java.util.Collections
import java.util.TreeMap
import kotlin.math.max

class Solution {
    fun maximumLength(s: String): Int {
        val buckets: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0..25) {
            buckets.add(ArrayList())
        }
        var cur = 1
        for (i in 1 until s.length) {
            if (s[i] != s[i - 1]) {
                val index = s[i - 1].code - 'a'.code
                buckets[index].add(cur)
                cur = 1
            } else {
                cur++
            }
        }
        val endIndex = s[s.length - 1].code - 'a'.code
        buckets[endIndex].add(cur)
        var result = -1
        for (bucket in buckets) {
            result = max(result, generate(bucket))
        }
        return result
    }

    private fun generate(list: List<Int>): Int {
        Collections.sort(list, Collections.reverseOrder())
        val map = TreeMap<Int, Int>(Collections.reverseOrder())
        var i = 0
        while (i < list.size && i < 3) {
            val cur = list[i]
            var num = map.getOrDefault(cur, 0)
            map[cur] = num + 1
            if (cur >= 2) {
                num = map.getOrDefault(cur - 1, 0)
                map[cur - 1] = num + 2
            }
            if (cur >= 3) {
                num = map.getOrDefault(cur - 2, 0)
                map[cur - 2] = num + 3
            }
            i++
        }
        for ((key, value) in map) {
            if (value >= 3) {
                return key
            }
        }
        return -1
    }
}
