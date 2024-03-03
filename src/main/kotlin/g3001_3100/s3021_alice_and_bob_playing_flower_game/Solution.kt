package g3001_3100.s3021_alice_and_bob_playing_flower_game

// #Medium #Math #2024_03_03_Time_141_ms_(43.24%)_Space_33.2_MB_(86.49%)

class Solution {
    fun flowerGame(n: Int, m: Int): Long {
        val nEven = n.toLong() / 2
        val nOdd = n - nEven
        val mEven = m.toLong() / 2
        val mOdd = m - mEven
        return nEven * mOdd + nOdd * mEven
    }
}
