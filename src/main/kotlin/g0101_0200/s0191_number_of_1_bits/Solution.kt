package g0101_0200.s0191_number_of_1_bits

// #Easy #Top_Interview_Questions #Bit_Manipulation #Algorithm_I_Day_13_Bit_Manipulation
// #Programming_Skills_I_Day_2_Operator #Udemy_Bit_Manipulation
// #2022_10_18_Time_237_ms_(68.44%)_Space_33.8_MB_(52.46%)

class Solution {
    fun hammingWeight(n: Int): Int {
        val str = Integer.toBinaryString(n).filter { it == '1' }
        return str.length
    }
}
