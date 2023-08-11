package g0701_0800.s0788_rotated_digits

// #Medium #Dynamic_Programming #Math #2023_03_13_Time_137_ms_(80.00%)_Space_33.3_MB_(40.00%)

class Solution {
    fun rotatedDigits(n: Int): Int {
        val flag = IntArray(n + 1)
        flag[0] = 2
        val indexesValueTwo = intArrayOf(1, 8)
        for (value in indexesValueTwo) {
            if (n >= value) {
                flag[value] = 2
            }
        }
        val indexesValueOne = intArrayOf(2, 5, 6, 9)
        for (value in indexesValueOne) {
            if (n >= value) {
                flag[value] = 1
            }
        }
        var rs = 0
        for (i in 1..n) {
            val residual = i % 10
            if (flag[residual] != 0) {
                if ((residual == 1 || residual == 0 || residual == 8) && flag[i / 10] == 2) {
                    flag[i] = 2
                    continue
                }
                if (flag[i / 10] != 0) {
                    flag[i] = 1
                    rs++
                }
            }
        }
        return rs
    }
}
