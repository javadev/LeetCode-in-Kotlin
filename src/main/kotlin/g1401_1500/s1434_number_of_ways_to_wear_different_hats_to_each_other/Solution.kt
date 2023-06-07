package g1401_1500.s1434_number_of_ways_to_wear_different_hats_to_each_other

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
class Solution {
    fun numberWays(hats: List<List<Int>>): Int {
        val mod = 1000000007L
        val size = hats.size
        val possible = Array(size) { BooleanArray(41) }
        for (i in 0 until size) {
            for (j in hats[i]) {
                possible[i][j] = true
            }
        }
        val dp = LongArray(1 shl size)
        dp[0] = 1
        for (i in 1..40) {
            for (j in dp.size - 1 downTo 1) {
                for (k in 0 until size) {
                    if (j shr k and 1 == 1 && possible[k][i]) {
                        dp[j] += dp[j xor (1 shl k)]
                    }
                }
                dp[j] %= mod
            }
        }
        return dp[(1 shl size) - 1].toInt()
    }
}
