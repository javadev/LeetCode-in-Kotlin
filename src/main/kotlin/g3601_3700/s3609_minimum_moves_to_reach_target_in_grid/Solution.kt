package g3601_3700.s3609_minimum_moves_to_reach_target_in_grid

// #Hard #2025_07_07_Time_1_ms_(100.00%)_Space_40.67_MB_(100.00%)

class Solution {
    fun minMoves(sx: Int, sy: Int, tx: Int, ty: Int): Int {
        var tx = tx
        var ty = ty
        if (sx == 0 && sy == 0) {
            return if (tx == 0 && ty == 0) 0 else -1
        }

        var res = 0
        while (sx != tx || sy != ty) {
            if (sx > tx || sy > ty) {
                return -1
            }
            res++
            if (tx > ty) {
                if (tx > ty * 2) {
                    if (tx % 2 != 0) {
                        return -1
                    }
                    tx /= 2
                } else {
                    tx -= ty
                }
            } else if (tx < ty) {
                if (ty > tx * 2) {
                    if (ty % 2 != 0) {
                        return -1
                    }
                    ty /= 2
                } else {
                    ty -= tx
                }
            } else {
                if (sx == 0) {
                    tx = 0
                } else if (sy == 0) {
                    ty = 0
                } else {
                    return -1
                }
            }
        }
        return res
    }
}
