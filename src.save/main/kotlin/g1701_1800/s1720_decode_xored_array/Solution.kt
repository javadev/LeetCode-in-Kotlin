package g1701_1800.s1720_decode_xored_array

// #Easy #Array #Bit_Manipulation #2023_06_16_Time_304_ms_(95.00%)_Space_38.5_MB_(95.00%)

class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
        val arr = IntArray(encoded.size + 1)
        arr[0] = first
        for (i in encoded.indices) {
            arr[i + 1] = encoded[i] xor arr[i]
        }
        return arr
    }
}
