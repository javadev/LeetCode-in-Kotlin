package g2901_3000.s2997_minimum_number_of_operations_to_make_array_xor_equal_to_k

// #Medium #Array #Bit_Manipulation #2024_01_19_Time_452_ms_(84.38%)_Space_58.5_MB_(78.13%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var k = k
        var count = 0
        var xor = 0
        for (num in nums) {
            xor = xor xor num
        }
        while (xor > 0 || k > 0) {
            if (xor % 2 != k % 2) {
                count++
            }
            xor /= 2
            k /= 2
        }
        return count
    }
}
