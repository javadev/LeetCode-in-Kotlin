package g2601_2700.s2607_make_k_subarray_sums_equal

// #Medium #Array #Math #Sorting #Number_Theory
// #2023_07_14_Time_1062_ms_(100.00%)_Space_82.4_MB_(100.00%)

import java.util.ArrayList

internal class Solution {
    fun makeSubKSumEqual(arr: IntArray, k: Int): Long {
        val n = arr.size
        var ans: Long = 0
        val vis = IntArray(n)
        var i = 0
        while (i < n) {
            val list: MutableList<Int> = ArrayList()
            if (vis[i] == 1) {
                i++
                continue
            }
            while (vis[i] == 0) {
                vis[i] = 1
                list.add(arr[i])
                i = (i + k) % n
            }
            list.sort()
            for (j in list) {
                ans += kotlin.math.abs(j - list[list.size / 2]).toLong()
            }
            i++
        }
        return ans
    }
}
