package g2501_2600.s2515_shortest_distance_to_target_string_in_a_circular_array

// #Easy #Array #String #2023_07_04_Time_209_ms_(100.00%)_Space_37.5_MB_(100.00%)

class Solution {
    fun closetTarget(words: Array<String>, target: String, startIndex: Int): Int {
        val n = words.size
        if (words[startIndex] == target) {
            return 0
        }
        var ld = -1
        var rd: Int
        var ans = Int.MAX_VALUE
        var i = (startIndex + 1) % n
        while (i != startIndex) {
            if (words[i] == target) {
                ld = if (i > startIndex) startIndex + (n - i) else startIndex - i
                rd = if (i > startIndex) i - startIndex else n - startIndex + i
                ans = Math.min(ans, Math.min(ld, rd))
            }
            i = (i + 1) % n
        }
        return if (ld == -1) {
            -1
        } else {
            ans
        }
    }
}
