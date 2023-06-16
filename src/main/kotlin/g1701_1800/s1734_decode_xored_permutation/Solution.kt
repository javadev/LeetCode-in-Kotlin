package g1701_1800.s1734_decode_xored_permutation

// #Medium #Array #Bit_Manipulation #2023_06_16_Time_684_ms_(100.00%)_Space_58.3_MB_(100.00%)

class Solution {
    fun decode(encoded: IntArray): IntArray {
        val decoded = IntArray(encoded.size + 1)
        run {
            var i = 1
            while (i < encoded.size) {
                decoded[0] = decoded.get(0) xor encoded.get(i)
                decoded[0] = decoded.get(0) xor i
                decoded[0] = decoded.get(0) xor (i + 1)
                i += 2
            }
        }
        decoded[0] = decoded.get(0) xor decoded.size
        for (i in 1 until decoded.size) {
            decoded[i] = decoded.get(i - 1) xor encoded.get(i - 1)
        }
        return decoded
    }
}
