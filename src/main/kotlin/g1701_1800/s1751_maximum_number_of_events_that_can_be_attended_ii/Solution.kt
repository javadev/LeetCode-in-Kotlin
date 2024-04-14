package g1701_1800.s1751_maximum_number_of_events_that_can_be_attended_ii

// #Hard #Array #Dynamic_Programming #Binary_Search
// #2023_06_18_Time_608_ms_(100.00%)_Space_104.6_MB_(100.00%)

import java.util.Arrays

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxValue(events: Array<IntArray>, k: Int): Int {
        if (k == 1) {
            val value = Arrays.stream(events).max({ a: IntArray, b: IntArray -> a[2].compareTo(b[2]) })
            return if (value.isPresent) {
                value.get()[2]
            } else {
                throw NullPointerException()
            }
        }
        val n = events.size
        events.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
        val memo = Array(n) { IntArray(k + 1) }
        return dfs(events, 0, k, memo)
    }

    private fun dfs(events: Array<IntArray>, i: Int, k: Int, memo: Array<IntArray>): Int {
        if (k == 0 || i >= events.size) {
            return 0
        }
        if (memo[i][k] > 0) {
            return memo[i][k]
        }
        val idx = binarySearch(events, events[i][1] + 1, i + 1)
        val use = events[i][2] + dfs(events, idx, k - 1, memo)
        val notUse = dfs(events, i + 1, k, memo)
        val res = Math.max(use, notUse)
        memo[i][k] = res
        return res
    }

    private fun binarySearch(events: Array<IntArray>, i: Int, st: Int): Int {
        var st = st
        if (st >= events.size) {
            return st
        }
        var end = events.size - 1
        while (st < end) {
            val mid = st + (end - st) / 2
            if (events[mid][0] < i) {
                st = mid + 1
            } else {
                end = mid
            }
        }
        return if (events[st][0] >= i) st else st + 1
    }
}
