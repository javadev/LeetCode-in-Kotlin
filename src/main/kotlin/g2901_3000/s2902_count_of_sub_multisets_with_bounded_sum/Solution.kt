package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum

// #Hard #Array #Hash_Table #Dynamic_Programming #Sliding_Window
// #2023_12_27_Time_2416_ms_(100.00%)_Space_87.8_MB_(100.00%)

class Solution {
    private var map: HashMap<Int, Int>? = null
    private lateinit var dp: Array<IntArray>

    private fun solve(al: List<Int>, l: Int, r: Int, index: Int, sum: Int): Int {
        if (sum > r) {
            return 0
        }
        var ans: Long = 0
        if (index >= al.size) {
            return ans.toInt()
        }
        if (dp[index][sum] != -1) {
            return dp[index][sum]
        }
        val cur = al[index]
        val count = map!![cur]!!
        for (i in 0..count) {
            val curSum = sum + cur * i
            if (curSum > r) {
                break
            }
            ans += solve(al, l, r, index + 1, curSum)
            if (i != 0 && curSum >= l) {
                ans += 1
            }
            ans %= MOD
        }
        dp[index][sum] = ans.toInt()
        return ans.toInt()
    }

    fun countSubMultisets(nums: List<Int>, l: Int, r: Int): Int {
        map = HashMap()
        val al: MutableList<Int> = ArrayList()
        for (cur in nums) {
            val count = map!!.getOrDefault(cur, 0) + 1
            map!![cur] = count
            if (count == 1) {
                al.add(cur)
            }
        }
        val n = al.size
        dp = Array(n) { IntArray(r + 1) }
        for (i in dp.indices) {
            for (j in dp[0].indices) {
                dp[i][j] = -1
            }
        }
        al.sort()
        var ans = solve(al, l, r, 0, 0)
        if (l == 0) {
            ans += 1
        }
        ans %= MOD
        return ans
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
