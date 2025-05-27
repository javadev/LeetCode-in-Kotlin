package g3501_3600.s3557_find_maximum_number_of_non_intersecting_substrings

// #Medium #String #Hash_Table #Dynamic_Programming #Greedy
// #2025_05_27_Time_28_ms_(70.59%)_Space_49.63_MB_(70.59%)

class Solution {
    fun maxSubstrings(s: String): Int {
        val prev = IntArray(26)
        var r = 0
        prev.fill(-1)
        for (i in 0..<s.length) {
            val j = s[i].code - 'a'.code
            if (prev[j] != -1 && i - prev[j] + 1 >= 4) {
                ++r
                prev.fill(-1)
            } else if (prev[j] == -1) {
                prev[j] = i
            }
        }
        return r
    }
}
