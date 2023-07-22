package g2301_2400.s2305_fair_distribution_of_cookies

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2023_06_29_Time_255_ms_(100.00%)_Space_33.7_MB_(100.00%)

class Solution {
    private var res = Int.MAX_VALUE
    fun distributeCookies(c: IntArray, k: Int): Int {
        val nums = IntArray(k)
        dfs(c, nums, 0)
        return res
    }

    private fun dfs(c: IntArray, nums: IntArray, cur: Int) {
        if (cur == c.size) {
            var r = 0
            for (num in nums) {
                r = r.coerceAtLeast(num)
            }
            res = res.coerceAtMost(r)
            return
        }
        for (i in nums.indices) {
            if (nums[i] + c[cur] > res) {
                continue
            }
            nums[i] += c[cur]
            dfs(c, nums, cur + 1)
            nums[i] -= c[cur]
        }
    }
}
