package g2801_2900.s2813_maximum_elegance_of_a_k_length_subsequence

// #Hard #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue
// #2023_12_06_Time_853_ms_(100.00%)_Space_104.7_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun findMaximumElegance(items: Array<IntArray>, k: Int): Long {
        items.sortWith { a: IntArray, b: IntArray -> b[0] - a[0] }
        val n = items.size
        val vis = BooleanArray(n)
        val arr = ArrayDeque<Long>()
        var distinct: Long = 0
        var sum: Long = 0
        for (i in 0 until k) {
            sum += items[i][0].toLong()
            if (vis[items[i][1] - 1]) {
                arr.addLast(items[i][0].toLong())
            } else {
                ++distinct
                vis[items[i][1] - 1] = true
            }
        }
        var ans = sum + distinct * distinct
        var i = k
        while (i < n && distinct < k) {
            if (!vis[items[i][1] - 1]) {
                sum -= arr.removeLast()
                sum += items[i][0].toLong()
                ++distinct
                vis[items[i][1] - 1] = true
                ans = max(ans.toDouble(), (sum + distinct * distinct).toDouble()).toLong()
            }
            i++
        }
        return ans
    }
}
