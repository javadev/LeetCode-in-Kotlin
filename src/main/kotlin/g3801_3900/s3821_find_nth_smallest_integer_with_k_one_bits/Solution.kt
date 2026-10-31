package g3801_3900.s3821_find_nth_smallest_integer_with_k_one_bits

// #Hard #Math #Bit_Manipulation #Combinatorics #Senior_Staff #Weekly_Contest_486
// #2026_06_09_Time_2_ms_(98.59%)_Space_42.60_MB_(90.14%)

class Solution {
    fun nthSmallest(n: Long, k: Int): Long {
        var n = n
        var k = k
        var ans: Long = 0
        for (i in 50 downTo 0) {
            val count: Long = C[i]!![k]
            if (n > count) {
                n -= count
                ans = ans or (1L shl i)
                k--
                if (k == 0) {
                    break
                }
            }
        }
        return ans
    }

    companion object {
        private const val MX = 60
        private val C = Array<LongArray?>(MX) { LongArray(MX + 1) }

        init {
            for (i in 0..<MX) {
                C[i]!![0] = 1
                for (j in 1..i) {
                    C[i]!![j] = C[i - 1]!![j - 1] + C[i - 1]!![j]
                }
            }
        }
    }
}
