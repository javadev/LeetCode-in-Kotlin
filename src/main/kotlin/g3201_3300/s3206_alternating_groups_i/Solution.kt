package g3201_3300.s3206_alternating_groups_i

// #Easy #Array #Sliding_Window #2024_07_11_Time_167_ms_(88.14%)_Space_38.3_MB_(23.73%)

class Solution {
    fun numberOfAlternatingGroups(colors: IntArray): Int {
        val n = colors.size
        var count = 0
        if (colors[n - 1] != colors[0] && colors[0] != colors[1]) {
            count++
        }
        if (colors[n - 1] != colors[0] && colors[n - 1] != colors[n - 2]) {
            count++
        }
        for (i in 1 until n - 1) {
            if (colors[i] != colors[i - 1] && colors[i] != colors[i + 1]) {
                count++
            }
        }
        return count
    }
}
