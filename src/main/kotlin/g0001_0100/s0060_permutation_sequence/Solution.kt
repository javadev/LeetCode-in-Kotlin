package g0001_0100.s0060_permutation_sequence

// #Hard #Math #Recursion #2022_09_22_Time_293_ms_(27.78%)_Space_34.2_MB_(61.11%)

class Solution {
    fun getPermutation(n: Int, k: Int): String {
        var k = k
        val res = CharArray(n)
        // We want the permutation sequence to be zero-indexed
        k = k - 1
        // The set bits indicate the available digits
        var a = (1 shl n) - 1
        var m = 1
        for (i in 2 until n) {
            // m = (n - 1)!
            m *= i
        }
        for (i in 0 until n) {
            var b = a
            for (j in 0 until k / m) {
                b = b and b - 1
            }
            // b is the bit corresponding to the digit we want
            b = b and b.inv() + 1
            res[i] = ('1'.code + Integer.bitCount(b - 1)).toChar()
            // Remove b from the set of available digits
            a = a and b.inv()
            k %= m
            m /= Math.max(1, n - i - 1)
        }
        return String(res)
    }
}
