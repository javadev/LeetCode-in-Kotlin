package g2501_2600.s2595_number_of_even_and_odd_bits

// #Easy #Bit_Manipulation #2023_07_12_Time_177_ms_(100.00%)_Space_35.4_MB_(66.67%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun evenOddBit(n: Int): IntArray {
        var n = n
        var flag = 1
        var even = 0
        var odd = 0
        while (n != 0) {
            val bit = n and 1
            if (bit == 1 && flag == 1) {
                even++
            }
            if (bit == 1 && flag != 1) {
                odd++
            }
            flag = Math.abs(flag - 1)
            n = n ushr 1
        }
        return intArrayOf(even, odd)
    }
}
