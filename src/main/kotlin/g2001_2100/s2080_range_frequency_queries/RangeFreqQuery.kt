package g2001_2100.s2080_range_frequency_queries

// #Medium #Array #Hash_Table #Binary_Search #Design #Segment_Tree
// #2023_06_27_Time_1102_ms_(100.00%)_Space_165.6_MB_(100.00%)

import java.util.Collections

class RangeFreqQuery(arr: IntArray) {
    private val map: MutableMap<Int, MutableList<Int>>

    init {
        map = HashMap()
        for (i in arr.indices) {
            if (!map.containsKey(arr[i])) {
                map[arr[i]] = ArrayList()
            }
            map[arr[i]]!!.add(i)
        }
    }

    fun query(left: Int, right: Int, value: Int): Int {
        if (!map.containsKey(value)) {
            return 0
        }
        val list: List<Int> = map[value]!!
        var s = Collections.binarySearch(list, left)
        var e = Collections.binarySearch(list, right)
        if (s < 0) {
            s = (s + 1) * -1
        }
        if (e < 0) {
            e = (e + 2) * -1
        }
        return e - s + 1
    }
}
