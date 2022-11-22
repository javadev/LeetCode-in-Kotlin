package g0301_0400.s0371_sum_of_two_integers

// #Medium #Top_Interview_Questions #Math #Bit_Manipulation #Udemy_Bit_Manipulation
// #2022_11_22_Time_129_ms_(95.45%)_Space_32.9_MB_(90.91%)

class Solution {
    fun getSum(a: Int, b: Int): Int {
        var a = a
        var b = b
        var ans = 0
        var memo = 0
        var exp = 0
        var count = 0
        while (count < 32) {
            val val1 = a and 1
            val val2 = b and 1
            var `val` = sum(val1, val2, memo)
            memo = `val` shr 1
            `val` = `val` and 1
            a = a shr 1
            b = b shr 1
            ans = ans or (`val` shl exp)
            exp = plusOne(exp)
            count = plusOne(count)
        }
        return ans
    }

    private fun sum(val1: Int, val2: Int, val3: Int): Int {
        var count = 0
        if (val1 == 1) {
            count = plusOne(count)
        }
        if (val2 == 1) {
            count = plusOne(count)
        }
        if (val3 == 1) {
            count = plusOne(count)
        }
        return count
    }

    private fun plusOne(`val`: Int): Int {
        return -`val`.inv()
    }
}
