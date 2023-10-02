package g0901_1000.s0981_time_based_key_value_store

// #Medium #String #Hash_Table #Binary_Search #Design #Binary_Search_II_Day_16
// #2023_10_02_Time_1011_ms_(65.56%)_Space_141.1_MB_(30.00%)

import java.util.TreeMap

class TimeMap {
    private val map = hashMapOf<String, TreeMap<Int, String>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key, ::TreeMap)[timestamp] = value
    }

    fun get(key: String, timestamp: Int): String {
        return map[key]?.floorEntry(timestamp)?.value ?: ""
    }
}

/*
 * Your TimeMap object will be instantiated and called as such:
 * var obj = TimeMap()
 * obj.set(key,value,timestamp)
 * var param_2 = obj.get(key,timestamp)
 */
