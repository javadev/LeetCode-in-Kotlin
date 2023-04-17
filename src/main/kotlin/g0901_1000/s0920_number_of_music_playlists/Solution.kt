package g0901_1000.s0920_number_of_music_playlists

// #Hard #Dynamic_Programming #Math #Combinatorics
// #2023_04_17_Time_136_ms_(100.00%)_Space_35.3_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun numMusicPlaylists(n: Int, l: Int, k: Int): Int {
        val dp = Array(l) { LongArray(n + 1) }
        for (i in 0 until l) {
            Arrays.fill(dp[i], -1)
        }
        return helper(0, l, 0, n, k, dp).toInt()
    }

    private fun helper(songNumber: Int, l: Int, usedSong: Int, n: Int, k: Int, dp: Array<LongArray>): Long {
        if (songNumber == l) {
            return if (usedSong == n) 1 else 0
        }
        if (dp[songNumber][usedSong] != -1L) {
            return dp[songNumber][usedSong]
        }
        val ans: Long = if (songNumber < k) {
            (n - usedSong) * helper(songNumber + 1, l, usedSong + 1, n, k, dp)
        } else if (usedSong == n) {
            (usedSong - k) * helper(songNumber + 1, l, usedSong, n, k, dp)
        } else {
            (
                (n - usedSong) * helper(songNumber + 1, l, usedSong + 1, n, k, dp) +
                    (usedSong - k) * helper(songNumber + 1, l, usedSong, n, k, dp)
                )
        }
        val mod = 1e9.toInt() + 7
        dp[songNumber][usedSong] = ans % mod
        return ans % mod
    }
}
