package g2001_2100.s2064_minimized_maximum_of_products_distributed_to_any_store

// #Medium #Array #Binary_Search #2023_06_26_Time_609_ms_(100.00%)_Space_63.6_MB_(100.00%)

class Solution {
    fun minimizedMaximum(n: Int, q: IntArray): Int {
        var min = 1
        var max = maxi(q)
        var ans = 0
        while (min <= max) {
            val mid = min + (max - min) / 2
            if (condition(q, mid, n)) {
                ans = mid
                max = mid - 1
            } else {
                min = mid + 1
            }
        }
        return ans
    }

    private fun condition(arr: IntArray, mid: Int, n: Int): Boolean {
        var ans = 0
        for (num in arr) {
            ans += num / mid
            if (num % mid != 0) {
                ans++
            }
        }
        return ans <= n
    }

    private fun maxi(arr: IntArray): Int {
        var ans = 0
        for (n in arr) {
            ans = ans.coerceAtLeast(n)
        }
        return ans
    }
}
