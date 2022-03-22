package g0001_0100.s0007_reverse_integer

// #Medium #Top_Interview_Questions #Math #2022_03_22_Time_230_ms_(57.36%)_Space_34.3_MB_(61.43%)

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
