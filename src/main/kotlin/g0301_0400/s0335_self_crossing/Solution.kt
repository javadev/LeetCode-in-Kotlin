package g0301_0400.s0335_self_crossing

// #Hard #Array #Math #Geometry #2022_11_15_Time_477_ms_(100.00%)_Space_51.4_MB_(100.00%)

class Solution {
    fun isSelfCrossing(x: IntArray): Boolean {
        if (x.size < 4) {
            return false
        }
        for (i in 3 until x.size) {
            if (x[i - 1] <= x[i - 3] && x[i] >= x[i - 2]) {
                return true
            }
            if (i > 4 && x[i] >= x[i - 2] - x[i - 4] && x[i - 1] >= x[i - 3] - x[i - 5] && x[i - 1] <= x[i - 3] &&
                x[i - 2] >= x[i - 4]
            ) {
                return true
            }
            if (i > 3 && x[i - 1] == x[i - 3] && x[i] >= x[i - 2] - x[i - 4]) {
                return true
            }
        }
        return false
    }
}
