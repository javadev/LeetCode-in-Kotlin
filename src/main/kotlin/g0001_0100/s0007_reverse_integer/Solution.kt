package g0001_0100.s0007_reverse_integer

// #Medium #Top_Interview_Questions #Math #Udemy_Integers #Big_O_Time_O(log10(x))_Space_O(1)
// #2023_07_03_Time_149_ms_(77.89%)_Space_33.5_MB_(84.42%)

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
