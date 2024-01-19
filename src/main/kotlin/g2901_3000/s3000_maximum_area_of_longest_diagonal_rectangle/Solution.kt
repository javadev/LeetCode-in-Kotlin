package g2901_3000.s3000_maximum_area_of_longest_diagonal_rectangle

// #Easy #Array #2024_01_19_Time_167_ms_(94.44%)_Space_38.5_MB_(92.59%)

class Solution {
    fun areaOfMaxDiagonal(dimensions: Array<IntArray>): Int {
        var mx = 0
        for (t in dimensions) {
            if (t[0] * t[0] + t[1] * t[1] > mx) {
                mx = t[0] * t[0] + t[1] * t[1]
            }
        }
        var area = 0
        for (t in dimensions) {
            if (t[0] * t[0] + t[1] * t[1] == mx && t[0] * t[1] > area) {
                area = t[0] * t[1]
            }
        }
        return area
    }
}
