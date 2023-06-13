package g1501_1600.s1585_check_if_string_is_transformable_with_substring_sort_operations

// #Hard #String #Sorting #Greedy
class Solution {
    fun isTransformable(s: String, t: String): Boolean {
        val n = s.length
        if (n != t.length) {
            return false
        }
        val cnt = IntArray(10)
        for (i in 0 until n) {
            cnt[s[i].code - '0'.code]++
        }
        for (i in 0 until n) {
            cnt[t[i].code - '0'.code]--
        }
        for (i in 0..9) {
            if (cnt[i] != 0) {
                return false
            }
        }
        val sCnt = IntArray(10)
        val tCnt = IntArray(10)
        for (i in 0 until n) {
            val sAsci = s[i].code - '0'.code
            val tAsci = t[i].code - '0'.code
            sCnt[sAsci]++
            if (tCnt[sAsci] >= sCnt[sAsci] || sAsci == tAsci && tCnt[sAsci] + 1 >= sCnt[sAsci]) {
                var rem = 0
                for (j in 0 until sAsci) {
                    if (sCnt[j] - tCnt[j] > 0) {
                        rem++
                    }
                }
                if (rem > 0) {
                    return false
                }
            }
            if (sCnt[tAsci] >= tCnt[tAsci] + 1) {
                var rem = 0
                for (j in tAsci..9) {
                    if (tCnt[j] - sCnt[j] > 0) {
                        rem++
                    }
                }
                if (rem > 0) {
                    return false
                }
            }
            tCnt[tAsci]++
        }
        return true
    }
}
