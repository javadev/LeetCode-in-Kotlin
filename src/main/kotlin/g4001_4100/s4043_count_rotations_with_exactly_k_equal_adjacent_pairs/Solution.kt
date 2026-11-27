package g4001_4100.s4043_count_rotations_with_exactly_k_equal_adjacent_pairs

// #Easy #String #Sliding_Window #Enumeration #Mid_Level #Weekly_Contest_518
// #2026_11_25_Time_2_ms_(81.84%)_Space_43.68_MB_(66.83%)

class Solution {
    fun countRotations(s: String, k: Int): Int {
        val n = s.length
        var same = 0
        for (i in 0..<n) {
            if (s.get(i) == s.get((i + 1) % n)) {
                same++
            }
        }
        return if (k == same - 1) {
            same
        } else {
            if (k == same) n - same else 0
        }
    }
}
