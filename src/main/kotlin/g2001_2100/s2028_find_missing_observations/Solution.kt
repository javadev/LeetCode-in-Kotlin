package g2001_2100.s2028_find_missing_observations

// #Medium #Array #Math #Simulation
@Suppress("NAME_SHADOWING")
class Solution {
    fun missingRolls(rolls: IntArray, mean: Int, n: Int): IntArray {
        var n = n
        val m = rolls.size
        var msum = 0
        val res = IntArray(n)
        for (roll in rolls) {
            msum += roll
        }
        var totalmn = mean * (m + n) - msum
        if (totalmn < n || totalmn > n * 6) {
            return IntArray(0)
        }
        var j = 0
        while (totalmn > 0) {
            val dice = Math.min(6, totalmn - n + 1)
            res[j] = dice
            totalmn = totalmn - dice
            n--
            j++
        }
        return res
    }
}
