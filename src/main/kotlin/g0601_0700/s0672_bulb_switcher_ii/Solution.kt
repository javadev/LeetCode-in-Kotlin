package g0601_0700.s0672_bulb_switcher_ii

// #Medium #Math #Depth_First_Search #Breadth_First_Search #Bit_Manipulation
// #2023_02_15_Time_131_ms_(100.00%)_Space_32.7_MB_(100.00%)

class Solution {
    fun flipLights(n: Int, m: Int): Int {
        return if (n == 1 && m > 0) {
            2
        } else if (n == 2 && m == 1) {
            3
        } else if (n > 2 && m == 1 || n == 2 && m > 1) {
            4
        } else if (n > 2 && m == 2) {
            7
        } else if (n > 2 && m > 2) {
            8
        } else {
            1
        }
    }
}
