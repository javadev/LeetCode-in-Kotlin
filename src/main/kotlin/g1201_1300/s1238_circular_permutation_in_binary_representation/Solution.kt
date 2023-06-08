package g1201_1300.s1238_circular_permutation_in_binary_representation

// #Medium #Math #Bit_Manipulation #Backtracking
class Solution {
    fun circularPermutation(n: Int, start: Int): List<Int> {
        val l1: MutableList<Int> = ArrayList()
        for (i in 0 until (1 shl n)) {
            l1.add(start xor (i xor (i shr 1)))
        }
        return l1
    }
}
