package g3601_3700.s3694_distinct_points_reachable_after_substring_removal

// #Medium #String #Hash_Table #Prefix_Sum #Sliding_Window #Biweekly_Contest_166
// #2025_10_03_Time_46_ms_(100.00%)_Space_48.62_MB_(100.00%)

class Solution {
    fun distinctPoints(s: String, k: Int): Int {
        val seen: MutableSet<Long> = HashSet()
        seen.add(0L)
        var x = 0
        var y = 0
        for (i in k..<s.length) {
            // add new step
            when (s[i]) {
                'U' -> y++
                'D' -> y--
                'L' -> x++
                'R' -> x--
                else -> x--
            }
            // remove old step
            when (s[i - k]) {
                'U' -> y--
                'D' -> y++
                'L' -> x--
                'R' -> x++
                else -> x++
            }
            seen.add(1000000L * x + y)
        }
        return seen.size
    }
}
