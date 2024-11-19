package g0201_0300.s0201_bitwise_and_of_numbers_range

// #Medium #Bit_Manipulation #Algorithm_II_Day_19_Bit_Manipulation
// #2022_10_19_Time_368_ms_(80.00%)_Space_37.1_MB_(76.67%)

class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        return if (left == right) left else right and MASKS[Integer.numberOfLeadingZeros(left xor right)]
    }

    companion object {
        private val MASKS = intArrayOf(
            0,
            -0x80000000,
            -0x40000000,
            -0x20000000,
            -0x10000000,
            -0x8000000,
            -0x4000000,
            -0x2000000,
            -0x1000000,
            -0x800000,
            -0x400000,
            -0x200000,
            -0x100000,
            -0x80000,
            -0x40000,
            -0x20000,
            -0x10000,
            -0x8000,
            -0x4000,
            -0x2000,
            -0x1000,
            -0x800,
            -0x400,
            -0x200,
            -0x100,
            -0x80,
            -0x40,
            -0x20,
            -0x10,
            -0x8,
            -0x4,
            -0x2,
        )
    }
}
