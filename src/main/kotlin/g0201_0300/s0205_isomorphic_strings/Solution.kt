package g0201_0300.s0205_isomorphic_strings

// #Easy #String #Hash_Table #Level_1_Day_2_String
// #2022_10_20_Time_278_ms_(79.96%)_Space_37.7_MB_(72.52%)

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = IntArray(128)
        val str = s.toCharArray()
        val tar = t.toCharArray()
        val n = str.size
        for (i in 0 until n) {
            if (map[tar[i].code] == 0) {
                if (search(map, str[i].code, tar[i].code) != -1) {
                    return false
                }
                map[tar[i].code] = str[i].code
            } else {
                if (map[tar[i].code] != str[i].code) {
                    return false
                }
            }
        }
        return true
    }

    private fun search(map: IntArray, tar: Int, skip: Int): Int {
        for (i in 0..127) {
            if (i == skip) {
                continue
            }
            if (map[i] != 0 && map[i] == tar) {
                return i
            }
        }
        return -1
    }
}
