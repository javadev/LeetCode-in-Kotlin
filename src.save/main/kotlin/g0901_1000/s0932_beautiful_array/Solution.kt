package g0901_1000.s0932_beautiful_array

// #Medium #Array #Math #Divide_and_Conquer #2023_04_27_Time_145_ms_(100.00%)_Space_36.4_MB_(16.67%)

class Solution {
    private var memo: MutableMap<Int, IntArray>? = null
    fun beautifulArray(n: Int): IntArray? {
        memo = HashMap()
        return helper(n)
    }

    private fun helper(n: Int): IntArray? {
        if (n == 1) {
            memo!![1] = intArrayOf(1)
            return intArrayOf(1)
        }
        if (memo!!.containsKey(n)) {
            return memo!![n]
        }
        val mid = (n + 1) / 2
        val left = helper(mid)
        val right = helper(n - mid)
        val rst = IntArray(n)
        for (i in 0 until mid) {
            rst[i] = left!![i] * 2 - 1
        }
        for (i in mid until n) {
            rst[i] = right!![i - mid] * 2
        }
        memo!![n] = rst
        return rst
    }
}
