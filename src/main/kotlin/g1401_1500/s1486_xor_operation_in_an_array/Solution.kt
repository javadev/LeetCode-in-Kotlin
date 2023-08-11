package g1401_1500.s1486_xor_operation_in_an_array

// #Easy #Math #Bit_Manipulation #2023_06_13_Time_123_ms_(81.25%)_Space_33_MB_(93.75%)

class Solution {
    fun xorOperation(n: Int, start: Int): Int {
        val nums = IntArray(n)
        for (i in 0 until n) {
            nums[i] = start + 2 * i
        }
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }
}
