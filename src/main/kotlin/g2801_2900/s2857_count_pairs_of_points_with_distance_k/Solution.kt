package g2801_2900.s2857_count_pairs_of_points_with_distance_k

// #Medium #Array #Hash_Table #Bit_Manipulation
// #2023_12_21_Time_1212_ms_(100.00%)_Space_81.3_MB_(100.00%)

class Solution {
    fun countPairs(coordinates: List<List<Int>>, k: Int): Int {
        var ans = 0
        val map: MutableMap<Long, Int> = HashMap()
        for (p in coordinates) {
            val p0 = p[0]
            val p1 = p[1]
            for (i in 0..k) {
                val x1 = i xor p0
                val y1 = (k - i) xor p1
                val key2 = hash(x1, y1)
                if (map.containsKey(key2)) {
                    ans += map[key2]!!
                }
            }
            val key = hash(p0, p1)
            map[key] = map.getOrDefault(key, 0) + 1
        }
        return ans
    }

    private fun hash(x1: Int, y1: Int): Long {
        val r = 1e8.toLong()
        return x1 * r + y1
    }
}
