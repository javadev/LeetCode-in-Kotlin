package g1801_1900.s1814_count_nice_pairs_in_an_array

// #Medium #Array #Hash_Table #Math #Counting
// #2023_06_20_Time_520_ms_(100.00%)_Space_58.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun rev(n: Int): Int {
        var n = n
        var r = 0
        while (n > 0) {
            r = r * 10 + n % 10
            n /= 10
        }
        return r
    }

    fun countNicePairs(nums: IntArray): Int {
        val revMap = HashMap<Int, Int>()
        var cnt = 0
        for (num in nums) {
            val lhs = num - rev(num)
            val prevCnt = revMap.getOrDefault(lhs, 0)
            cnt += prevCnt
            val mod = 1000000007
            cnt %= mod
            revMap[lhs] = prevCnt + 1
        }
        return cnt
    }
}
