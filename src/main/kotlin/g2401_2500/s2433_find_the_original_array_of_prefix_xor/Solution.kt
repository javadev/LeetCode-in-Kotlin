package g2401_2500.s2433_find_the_original_array_of_prefix_xor

// #Medium #Array #Bit_Manipulation #2023_07_05_Time_618_ms_(80.00%)_Space_58.2_MB_(60.00%)

class Solution {
    fun findArray(pref: IntArray): IntArray {
        val result = IntArray(pref.size)
        result[0] = pref[0]
        for (i in 1 until pref.size) {
            result[i] = pref[i] xor pref[i - 1]
        }
        return result
    }
}
