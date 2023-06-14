package g1501_1600.s1566_detect_pattern_of_length_m_repeated_k_or_more_times

// #Easy #Array #Enumeration #2023_06_14_Time_168_ms_(33.33%)_Space_36.4_MB_(16.67%)

class Solution {
    fun containsPattern(arr: IntArray, m: Int, k: Int): Boolean {
        for (i in 0 until arr.size - m) {
            val pattern = arr.copyOfRange(i, i + m)
            var times = 1
            var j = i + m
            while (j < arr.size) {
                val candidate = arr.copyOfRange(j, Math.min(arr.size, j + m))
                if (pattern.contentEquals(candidate)) {
                    times++
                    if (times == k) {
                        return true
                    }
                } else {
                    break
                }
                j += m
            }
        }
        return false
    }
}
