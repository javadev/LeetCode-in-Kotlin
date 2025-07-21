package g3601_3700.s3621_number_of_integers_with_popcount_depth_equal_to_k_i

// #Hard #2025_07_20_Time_1_ms_(100.00%)_Space_41.10_MB_(100.00%)

class Solution {
    private val slct = Array<LongArray>(MX_LN) { LongArray(MX_LN) }
    private val popHeight = IntArray(MX_LN)

    init {
        for (i in 0..<MX_LN) {
            slct[i][i] = 1
            slct[i][0] = slct[i][i]
            for (j in 1..<i) {
                slct[i][j] = slct[i - 1][j - 1] + slct[i - 1][j]
            }
        }
        popHeight[1] = 0
        for (v in 2..<MX_LN) {
            popHeight[v] = 1 + popHeight[java.lang.Long.bitCount(v.toLong())]
        }
    }

    private fun countNumbers(upperLimit: Long, setBits: Int): Long {
        if (setBits == 0) {
            return 1
        }
        var count: Long = 0
        var used = 0
        var len = 0
        var x = upperLimit
        while (x > 0) {
            len++
            x = x shr 1
        }
        for (pos in len - 1 downTo 0) {
            if (((upperLimit shr pos) and 1L) == 1L) {
                if (setBits - used <= pos) {
                    count += slct[pos][setBits - used]
                }
                used++
                if (used > setBits) {
                    break
                }
            }
        }
        if (java.lang.Long.bitCount(upperLimit) == setBits) {
            count++
        }
        return count
    }

    fun popcountDepth(tillNumber: Long, depthQuery: Int): Long {
        if (depthQuery == 0) {
            return (if (tillNumber >= 1) 1 else 0).toLong()
        }
        var total: Long = 0
        for (ones in 1..<MX_LN) {
            if (popHeight[ones] == depthQuery - 1) {
                total += countNumbers(tillNumber, ones)
            }
        }
        if (depthQuery == 1) {
            total -= 1
        }
        return total
    }

    companion object {
        private const val MX_LN = 61
    }
}
