package g3801_3900.s3858_minimum_bitwise_or_from_grid

// #Medium #Array #Greedy #Matrix #Bit_Manipulation #Staff #Weekly_Contest_491
// #2026_07_27_Time_4_ms_(81.16%)_Space_136.60_MB_(59.42%)

class Solution {
    fun minimumOR(grid: Array<IntArray>): Int {
        var res = 0
        for (bi in 20 downTo 0) {
            val b = 1 shl bi
            val mask = res or (b - 1)
            for (r in grid) {
                var rowAllBad = true
                for (a in r) {
                    if ((a and mask) == a) {
                        rowAllBad = false
                        break
                    }
                }
                if (rowAllBad) {
                    res = res or b
                    break
                }
            }
        }
        return res
    }
}
