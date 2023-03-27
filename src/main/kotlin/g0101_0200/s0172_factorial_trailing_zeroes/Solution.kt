package g0101_0200.s0172_factorial_trailing_zeroes

// #Medium #Top_Interview_Questions #Math #Udemy_Integers
// #2022_10_12_Time_220_ms_(67.65%)_Space_34.2_MB_(14.71%)

class Solution {
    fun trailingZeroes(n: Int): Int {
        var base = 5
        var count = 0
        while (n >= base) {
            count += n / base
            base = base * 5
        }
        return count
    }
}
