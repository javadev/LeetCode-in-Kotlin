package g3101_3200.s3200_maximum_height_of_a_triangle

// #Easy #Array #Enumeration #2024_07_06_Time_136_ms_(81.36%)_Space_33.8_MB_(28.81%)

import kotlin.math.max

@Suppress("NAME_SHADOWING")
class Solution {
    private fun count(v1: Int, v2: Int): Int {
        var v1 = v1
        var v2 = v2
        var ct = 1
        var flag = true
        while (true) {
            if (flag) {
                if (ct <= v1) {
                    v1 -= ct
                } else {
                    break
                }
            } else {
                if (ct <= v2) {
                    v2 -= ct
                } else {
                    break
                }
            }
            ct++
            flag = !flag
        }
        return ct - 1
    }

    fun maxHeightOfTriangle(red: Int, blue: Int): Int {
        return max(count(red, blue), count(blue, red))
    }
}
