package g2001_2100.s2078_two_furthest_houses_with_different_colors

// #Easy #Array #Greedy #2023_06_27_Time_131_ms_(100.00%)_Space_34.4_MB_(100.00%)

class Solution {
    fun maxDistance(colors: IntArray): Int {
        var left = 0
        var right = colors.size - 1
        var max = 0
        while (left < right) {
            if (colors[left] != colors[right]) {
                max = max.coerceAtLeast(right - left)
                break
            } else {
                left++
            }
        }
        left = 0
        while (left < right) {
            if (colors[left] != colors[right]) {
                max = max.coerceAtLeast(right - left)
                break
            } else {
                right--
            }
        }
        return max
    }
}
