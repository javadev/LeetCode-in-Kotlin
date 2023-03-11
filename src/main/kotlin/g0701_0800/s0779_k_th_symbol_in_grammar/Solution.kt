package g0701_0800.s0779_k_th_symbol_in_grammar

// #Medium #Math #Bit_Manipulation #Recursion
// #2023_03_11_Time_114_ms_(100.00%)_Space_32.9_MB_(20.00%)

class Solution {
    /*
     * Time: O(logn)
     * Space: O(1)
     */
    fun kthGrammar(n: Int, k: Int): Int {
        return Integer.bitCount(k - 1) % 2
    }
}
