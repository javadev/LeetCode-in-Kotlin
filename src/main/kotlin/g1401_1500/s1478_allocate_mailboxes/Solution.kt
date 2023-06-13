package g1401_1500.s1478_allocate_mailboxes

// #Hard #Array #Dynamic_Programming #Math #Sorting
// #2023_06_13_Time_226_ms_(100.00%)_Space_38_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minDistance(houses: IntArray, k: Int): Int {
        houses.sort()
        val n = houses.size
        val dp = Array(n) { IntArray(k + 1) }
        for (ar in dp) {
            ar.fill(-1)
        }
        return recur(houses, 0, k, dp)
    }

    private fun recur(houses: IntArray, idx: Int, k: Int, dp: Array<IntArray>): Int {
        if (dp[idx][k] != -1) {
            return dp[idx][k]
        }
        if (k == 1) {
            val dist = calDist(houses, idx, houses.size - 1)
            dp[idx][k] = dist
            return dp[idx][k]
        }
        var min = Int.MAX_VALUE
        var i = idx
        while (i + k - 1 < houses.size) {
            var dist = calDist(houses, idx, i)
            dist += recur(houses, i + 1, k - 1, dp)
            min = Math.min(min, dist)
            i++
        }
        dp[idx][k] = min
        return min
    }

    private fun calDist(ar: IntArray, start: Int, end: Int): Int {
        var start = start
        var end = end
        var result = 0
        while (start < end) {
            result += ar[end--] - ar[start++]
        }
        return result
    }
}
