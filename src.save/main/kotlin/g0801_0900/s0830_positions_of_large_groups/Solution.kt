package g0801_0900.s0830_positions_of_large_groups

// #Easy #String #2023_03_25_Time_221_ms_(100.00%)_Space_37.2_MB_(85.71%)

class Solution {
    fun largeGroupPositions(s: String): List<List<Int>> {
        val map: MutableList<List<Int>> = ArrayList()
        var i = 0
        while (i < s.length) {
            var j = i
            while (j < s.length && s[j] == s[i]) {
                j++
            }
            if (j - 1 - i + 1 >= 3) {
                map.add(listOf(i, j - 1))
            }
            i = j
        }
        return map
    }
}
