package g1601_1700.s1659_maximize_grid_happiness

// #Hard #Dynamic_Programming #Bit_Manipulation #Bitmask #Memoization
class Solution {
    private var m = 0
    private var n = 0
    private lateinit var dp: Array<Array<Array<Array<IntArray>>>>
    private val notPlace = 0
    private val intro = 1
    private val extro = 2
    private var mod = 0

    fun getMaxGridHappiness(m: Int, n: Int, introvertsCount: Int, extrovertsCount: Int): Int {
        this.m = m
        this.n = n
        val numOfState = Math.pow(3.0, n.toDouble()).toInt()
        dp = Array(m) {
            Array(n) {
                Array(introvertsCount + 1) {
                    Array(extrovertsCount + 1) { IntArray(numOfState) }
                }
            }
        }
        mod = numOfState / 3
        return dfs(0, 0, introvertsCount, extrovertsCount, 0)
    }

    private fun dfs(x: Int, y: Int, ic: Int, ec: Int, state: Int): Int {
        if (x == m) {
            return 0
        } else if (y == n) {
            return dfs(x + 1, 0, ic, ec, state)
        }
        if (dp[x][y][ic][ec][state] != 0) {
            return dp[x][y][ic][ec][state]
        }
        // 1 - not place
        var max = dfs(x, y + 1, ic, ec, state % mod * 3)
        val up = state / mod
        val left = state % 3
        // 2 - place intro
        if (ic > 0) {
            var temp = 120
            if (x > 0 && up != notPlace) {
                temp -= 30
                temp += if (up == intro) -30 else 20
            }
            if (y > 0 && left != notPlace) {
                temp -= 30
                temp += if (left == intro) -30 else 20
            }
            var nextState = state
            nextState %= mod
            nextState *= 3
            nextState += intro
            max = Math.max(max, temp + dfs(x, y + 1, ic - 1, ec, nextState))
        }
        // 3 - place extro
        if (ec > 0) {
            var temp = 40
            if (x > 0 && up != notPlace) {
                temp += 20
                temp += if (up == intro) -30 else 20
            }
            if (y > 0 && left != notPlace) {
                temp += 20
                temp += if (left == intro) -30 else 20
            }
            var nextState = state
            nextState %= mod
            nextState *= 3
            nextState += extro
            max = Math.max(max, temp + dfs(x, y + 1, ic, ec - 1, nextState))
        }
        dp[x][y][ic][ec][state] = max
        return max
    }
}
