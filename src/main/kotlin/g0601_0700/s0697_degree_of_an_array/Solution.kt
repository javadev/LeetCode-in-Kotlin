package g0601_0700.s0697_degree_of_an_array

// #Easy #Array #Hash_Table #Udemy_Arrays #2023_02_22_Time_289_ms_(84.62%)_Space_58.4_MB_(19.23%)

class Solution {
    private class Value(var count: Int, var start: Int, var end: Int)

    fun findShortestSubArray(nums: IntArray): Int {
        var max = 1
        val map: MutableMap<Int, Value> = HashMap()
        for (i in nums.indices) {
            val j = nums[i]
            if (map.containsKey(j)) {
                val v = map[j]
                v!!.count++
                max = Math.max(max, v.count)
                v.end = i
            } else {
                map[j] = Value(1, i, i)
            }
        }
        var min = Int.MAX_VALUE
        for (entry in map.entries.iterator()) {
            val v: Value = entry.value
            if (v.count == max) {
                min = min.coerceAtMost(v.end - v.start)
            }
        }
        return min + 1
    }
}
