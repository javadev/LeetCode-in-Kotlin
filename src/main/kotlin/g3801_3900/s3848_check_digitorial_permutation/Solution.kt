package g3801_3900.s3848_check_digitorial_permutation

// #Medium #Math #Counting #Senior #Weekly_Contest_490
// #2026_07_22_Time_2_ms_(84.89%)_Space_42.70_MB_(97.48%)

class Solution {
    fun isDigitorialPermutation(n: Int): Boolean {
        val factorials = IntArray(10)
        factorials[0] = 1
        for (d in 1..9) {
            factorials[d] = factorials[d - 1] * d
        }
        var digitsSum = 0
        var x = n
        do {
            digitsSum += factorials[x % 10]
            x /= 10
        } while (x != 0)
        return digitFrequencies(digitsSum).contentEquals(digitFrequencies(n))
    }

    companion object {
        fun digitFrequencies(x: Int): IntArray {
            var x = x
            val c = IntArray(10)
            do {
                c[x % 10]++
                x /= 10
            } while (x != 0)
            return c
        }
    }
}
