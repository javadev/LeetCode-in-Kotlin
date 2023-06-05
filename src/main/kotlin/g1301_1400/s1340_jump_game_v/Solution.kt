package g1301_1400.s1340_jump_game_v

// #Hard #Array #Dynamic_Programming #Sorting
class Solution {
    fun maxJumps(arr: IntArray, d: Int): Int {
        val n = arr.size
        val dp = IntArray(n)
        var jumps = 0
        for (i in 0 until n) {
            jumps = Math.max(jumps, helper(arr, d, i, dp))
        }
        return jumps
    }

    private fun helper(arr: IntArray, d: Int, i: Int, dp: IntArray): Int {
        var temp = 0
        if (dp[i] != 0) {
            return dp[i]
        }
        val l = Math.max(0, i - d)
        val r = Math.min(i + d, arr.size - 1)
        run {
            var j = i - 1
            while (j >= l && arr[i] > arr[j]) {
                temp = Math.max(temp, helper(arr, d, j, dp))
                j--
            }
        }
        var j = i + 1
        while (j <= r && arr[i] > arr[j]) {
            temp = Math.max(temp, helper(arr, d, j, dp))
            j++
        }
        return 1 + temp
    }
}
