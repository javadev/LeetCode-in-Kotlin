package g3101_3200.s3133_minimum_array_end

// #Medium #Bit_Manipulation #2024_05_02_Time_131_ms_(90.91%)_Space_33.9_MB_(59.09%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minEnd(n: Int, x: Int): Long {
        var n = n
        n -= 1
        val xb = IntArray(64)
        val nb = IntArray(64)
        for (i in 0..31) {
            xb[i] = (x shr i) and 1
            nb[i] = (n shr i) and 1
        }
        var i = 0
        var j = 0
        while (i < 64) {
            if (xb[i] != 1) {
                xb[i] = nb[j++]
            }
            i++
        }
        var ans: Long = 0
        var p: Long = 1
        i = 0
        while (i < 64) {
            ans += (xb[i]) * p
            p *= 2
            i++
        }
        return ans
    }
}
