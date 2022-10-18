package g0101_0200.s0191_number_of_1_bits

// #Easy #Top_Interview_Questions #Bit_Manipulation #Algorithm_I_Day_13_Bit_Manipulation
// #Programming_Skills_I_Day_2_Operator #Udemy_Bit_Manipulation
// #2022_10_18_Time_294_ms_(10.25%)_Space_33.8_MB_(63.93%)

class Solution {
    fun hammingWeight(n: Int): Int {
        var n = n
        var sum = 0
        var flag = false
        if (n < 0) {
            flag = true
            n = n - Int.MIN_VALUE
        }
        while (n > 0) {
            val k = n % 2
            sum += k
            n /= 2
        }
        return if (flag) sum + 1 else sum
    }
}
