package g1801_1900.s1835_find_xor_sum_of_all_pairs_bitwise_and

// #Hard #Array #Math #Bit_Manipulation #2023_06_21_Time_604_ms_(100.00%)_Space_59.2_MB_(100.00%)

class Solution {
    fun getXORSum(arr1: IntArray, arr2: IntArray): Int {
        var xor1 = 0
        var xor2 = 0
        for (i in arr1) {
            xor1 = xor1 xor i
        }
        for (j in arr2) {
            xor2 = xor2 xor j
        }
        return xor1 and xor2
    }
}
