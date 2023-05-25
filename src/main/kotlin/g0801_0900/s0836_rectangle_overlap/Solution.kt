package g0801_0900.s0836_rectangle_overlap

// #Easy #Math #Geometry #2023_03_27_Time_121_ms_(100.00%)_Space_33.3_MB_(90.91%)

class Solution {
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3]
    }
}
