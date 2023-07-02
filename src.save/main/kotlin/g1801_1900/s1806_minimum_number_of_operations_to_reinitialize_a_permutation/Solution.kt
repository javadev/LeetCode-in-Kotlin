package g1801_1900.s1806_minimum_number_of_operations_to_reinitialize_a_permutation

// #Medium #Array #Math #Simulation #2023_06_19_Time_117_ms_(100.00%)_Space_33_MB_(100.00%)

class Solution {
    fun reinitializePermutation(n: Int): Int {
        val factor = n - 1
        if (factor < 2) {
            return 1
        }
        var powerOfTwo = 2
        var ops = 1
        while (powerOfTwo != 1) {
            powerOfTwo = (powerOfTwo shl 1) % factor
            ops++
        }
        return ops
    }
}
