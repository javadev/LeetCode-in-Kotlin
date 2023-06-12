package g1501_1600.s1545_find_kth_bit_in_nth_binary_string

// #Medium #String #Recursion #2023_06_12_Time_141_ms_(100.00%)_Space_33.2_MB_(100.00%)

@Suppress("NAME_SHADOWING", "UNUSED_PARAMETER")
class Solution {
    fun findKthBit(n: Int, k: Int): Char {
        var k = k
        var flip = false
        while (k != 1) {
            val base = floorTwo(k)
            if (base == k) {
                return if (flip) '0' else '1'
            }
            flip = !flip
            k = base - (k - base)
        }
        return if (flip) '1' else '0'
    }

    private fun floorTwo(k: Int): Int {
        var k = k
        while (k and k - 1 > 0) {
            k = k and k - 1
        }
        return k
    }
}
