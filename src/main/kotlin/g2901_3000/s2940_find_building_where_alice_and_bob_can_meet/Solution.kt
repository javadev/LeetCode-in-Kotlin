package g2901_3000.s2940_find_building_where_alice_and_bob_can_meet

// #Hard #Array #Binary_Search #Stack #Heap_Priority_Queue #Monotonic_Stack #Segment_Tree
// #Binary_Indexed_Tree #2024_01_03_Time_928_ms_(90.00%)_Space_84.9_MB_(65.00%)

import java.util.LinkedList
import kotlin.math.max

class Solution {
    fun leftmostBuildingQueries(heights: IntArray, queries: Array<IntArray>): IntArray {
        val n = heights.size
        val gr = IntArray(n)
        val l = LinkedList<Int>()
        l.offer(n - 1)
        gr[n - 1] = -1
        for (i in n - 2 downTo 0) {
            while (l.isNotEmpty() && heights[i] > heights[l.peek()]) {
                l.pop()
            }
            if (l.isNotEmpty()) {
                gr[i] = l.peek()
            } else {
                gr[i] = -1
            }
            l.push(i)
        }
        val ans = IntArray(queries.size)
        var i = 0
        for (a in queries) {
            val x = gr[a[0]]
            val y = gr[a[1]]
            if (a[0] == a[1]) {
                ans[i++] = a[0]
            } else if (a[0] < a[1] && heights[a[0]] < heights[a[1]]) {
                ans[i++] = a[1]
            } else if (a[1] < a[0] && heights[a[1]] < heights[a[0]]) {
                ans[i++] = a[0]
            } else if (x == -1 || y == -1) {
                ans[i++] = -1
            } else {
                var m = max(a[0], a[1])
                while (m < heights.size && m != -1 && (heights[m] <= heights[a[0]] || heights[m] <= heights[a[1]])) {
                    m = gr[m]
                }
                if (m >= heights.size || m == -1) {
                    ans[i++] = -1
                } else {
                    ans[i++] = m
                }
            }
        }
        return ans
    }
}
