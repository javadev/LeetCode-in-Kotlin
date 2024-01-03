package g2901_3000.s2939_maximum_xor_product

// #Medium #Math #Greedy #Bit_Manipulation #2024_01_03_Time_151_ms_(76.19%)_Space_34.1_MB_(80.95%)

class Solution {
    fun maximumXorProduct(a: Long, b: Long, n: Int): Int {
        var tempa = a
        var tempb = b
        val mask = ((1L shl n) - 1)
        tempa = (tempa and mask.inv())
        tempb = (tempb and mask.inv())
        for (i in n - 1 downTo 0) {
            if (((a shr i) and 1L) == ((b shr i) and 1L)) {
                tempa = ((tempa) or (1L shl i))
                tempb = ((tempb) or (1L shl i))
            } else {
                if (tempa > tempb) {
                    tempb = ((tempb) or (1L shl i))
                } else {
                    tempa = ((tempa) or (1L shl i))
                }
            }
        }
        val mod = 1000000007
        val finalans = ((tempa % mod) * (tempb % mod)) % mod
        return finalans.toInt()
    }
}
