package g2301_2400.s2399_check_distances_between_same_letters

// #Easy #Array #String #Hash_Table #2023_07_02_Time_173_ms_(66.67%)_Space_34.7_MB_(100.00%)

class Solution {
    fun checkDistances(s: String, distance: IntArray): Boolean {
        val seenFirstIndexYet = BooleanArray(26)
        for (idxIntoS in 0 until s.length) {
            val c = s[idxIntoS]
            if (!seenFirstIndexYet[c.code - 'a'.code]) {
                seenFirstIndexYet[c.code - 'a'.code] = true
                distance[c.code - 'a'.code] += idxIntoS
            } else {
                // seenFirstIndexYet[c - 'a']
                distance[c.code - 'a'.code] -= idxIntoS
                if (distance[c.code - 'a'.code] != -1) {
                    // early return
                    return false
                }
            }
        }
        return true
    }
}
