package g1201_1300.s1207_unique_number_of_occurrences

// #Easy #Array #Hash_Table #2023_06_10_Time_151_ms_(83.00%)_Space_33.9_MB_(100.00%)

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map: MutableMap<Int, Int> = HashMap()
        for (j in arr) {
            if (map.containsKey(j)) {
                map[j] = map[j]!! + 1
            } else {
                map[j] = 1
            }
        }
        // map for check unique number of count
        val uni: MutableMap<Int, Int> = HashMap()
        for (`val` in map.values) {
            if (uni.containsKey(`val`)) {
                return false
            } else {
                uni[`val`] = 1
            }
        }
        return true
    }
}
