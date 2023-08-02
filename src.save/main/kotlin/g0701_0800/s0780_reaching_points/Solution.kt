package g0701_0800.s0780_reaching_points

// #Hard #Math #2023_03_11_Time_139_ms_(100.00%)_Space_32.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun reachingPoints(sx: Int, sy: Int, tx: Int, ty: Int): Boolean {
        var tx = tx
        var ty = ty
        while (tx >= sx && ty >= sy) {
            if (tx > ty) {
                tx %= if (ty == sy) {
                    // ty==sy
                    return (tx - sx) % sy == 0
                } else {
                    // ty > sy
                    ty
                }
            } else if (sx == tx) {
                // ty >= tx
                return (ty - sy) % sx == 0
            } else {
                // (tx > sx)
                ty %= tx
            }
        }
        return false
    }
}
