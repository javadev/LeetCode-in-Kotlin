package g0301_0400.s0400_nth_digit

// #Medium #Math #Binary_Search #2022_11_29_Time_271_ms_(50.00%)_Space_33.7_MB_(50.00%)

class Solution {
    /*
    * 1. find the length of the number where the nth digit is from
    * 2. find the actual number where the nth digit is from
    * 3. find the nth digit and return
    */
    fun findNthDigit(n: Int): Int {
        var n = n
        var len = 1
        var count: Long = 9
        var start = 1
        while (n > len * count) {
            n -= (len * count).toInt()
            len += 1
            count *= 10
            start *= 10
        }
        start += (n - 1) / len
        val s = Integer.toString(start)
        return Character.getNumericValue(s[(n - 1) % len])
    }
}
