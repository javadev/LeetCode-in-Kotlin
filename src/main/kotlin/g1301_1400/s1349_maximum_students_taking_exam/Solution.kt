package g1301_1400.s1349_maximum_students_taking_exam

// #Hard #Array #Dynamic_Programming #Matrix #Bit_Manipulation #Bitmask
class Solution {
    fun maxStudents(seats: Array<CharArray>): Int {
        val m = seats.size
        val n = seats[0].size
        val validRows = IntArray(m)
        for (i in 0 until m) {
            for (j in 0 until n) {
                validRows[i] = (validRows[i] shl 1) + if (seats[i][j] == '.') 1 else 0
            }
        }
        val stateSize = 1 shl n
        val dp = Array(m) { IntArray(stateSize) }
        for (i in 0 until m) {
            dp[i].fill(-1)
        }
        var ans = 0
        for (i in 0 until m) {
            for (j in 0 until stateSize) {
                if (j and validRows[i] == j && j and (j shl 1) == 0) {
                    if (i == 0) {
                        dp[i][j] = Integer.bitCount(j)
                    } else {
                        for (k in 0 until stateSize) {
                            if (k shl 1 and j == 0 && j shl 1 and k == 0 && dp[i - 1][k] != -1) {
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + Integer.bitCount(j))
                            }
                        }
                    }
                    ans = Math.max(ans, dp[i][j])
                }
            }
        }
        return ans
    }
}
