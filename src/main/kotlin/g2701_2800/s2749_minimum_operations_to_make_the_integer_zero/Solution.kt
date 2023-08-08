package g2701_2800.s2749_minimum_operations_to_make_the_integer_zero

// #Medium #Bit_Manipulation #Brainteaser #2023_08_08_Time_132_ms_(91.67%)_Space_33.2_MB_(62.50%)

class Solution {
    fun makeTheIntegerZero(num1: Int, num2: Int): Int {
        val n1 = num1.toLong()
        val n2 = num2.toLong()
        for (i in 0..60) {
            val target = n1 - n2 * i
            val noOfBits = java.lang.Long.bitCount(target)
            if (i.toLong() in noOfBits..target) {
                return i
            }
        }
        return -1
    }
}
