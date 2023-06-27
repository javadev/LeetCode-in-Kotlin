package g0001_0100.s0007_reverse_integer

// #Medium #Top_Interview_Questions #Math #Udemy_Integers
// #2022_09_22_Time_245_ms_(60.32%)_Space_34.1_MB_(63.10%)

class Solution {
    fun reverse(x: Int): Int {
        var rev: Long = 0
        var localX = x
        while (localX != 0) {
            rev = (rev * 10) + (localX % 10)
            localX /= 10
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0
        }
        return rev.toInt()
    }
}
