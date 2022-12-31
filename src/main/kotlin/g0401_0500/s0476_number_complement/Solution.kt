package g0401_0500.s0476_number_complement

// #Easy #Bit_Manipulation #2022_12_31_Time_133_ms_(100.00%)_Space_33.1_MB_(76.47%)

class Solution {
    fun findComplement(num: Int): Int {
        return num.inv() and (Integer.highestOneBit(num) shl 1) - 1
    }
}
