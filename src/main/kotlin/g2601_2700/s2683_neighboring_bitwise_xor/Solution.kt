package g2601_2700.s2683_neighboring_bitwise_xor

// #Medium #Array #Bit_Manipulation #2023_07_28_Time_1047_ms_(100.00%)_Space_78_MB_(100.00%)

class Solution {
    fun doesValidArrayExist(derived: IntArray): Boolean {
        val n = derived.size
        fun helper(begin: Int): Boolean {
            var last = begin
            for (i in 0 until n - 1)
                last = last xor (derived[i])
            return (last xor begin) == derived[n - 1]
        }
        return helper(0)
    }
}
