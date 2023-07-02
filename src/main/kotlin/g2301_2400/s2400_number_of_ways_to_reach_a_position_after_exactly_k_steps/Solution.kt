package g2301_2400.s2400_number_of_ways_to_reach_a_position_after_exactly_k_steps

// #Medium #Dynamic_Programming #Math #Combinatorics
// #2023_07_02_Time_126_ms_(100.00%)_Space_32.5_MB_(100.00%)

class Solution {
    private val mod = 1000000007

    fun numberOfWays(startPos: Int, endPos: Int, k: Int): Int {
        if (Math.abs(endPos - startPos) > k) {
            return 0
        }
        if (Math.abs(endPos - startPos + k) % 2 != 0) {
            return 0
        }
        val t = endPos - startPos
        val right = (k + t) / 2
        val min = Math.min(right, k - right)
        if (min == 0) {
            return 1
        }
        val rev = IntArray(min + 1)
        rev[1] = 1
        var ans = k
        for (i in 2..min) {
            rev[i] = ((mod - mod / i).toLong() * rev[mod % i].toLong() % mod).toInt()
            ans = (ans.toLong() * (k - i + 1).toLong() % mod).toInt()
            ans = (ans.toLong() * rev[i].toLong() % mod).toInt()
        }
        return ans
    }
}
