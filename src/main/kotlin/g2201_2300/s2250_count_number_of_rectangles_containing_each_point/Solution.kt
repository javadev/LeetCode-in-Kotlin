package g2201_2300.s2250_count_number_of_rectangles_containing_each_point

// #Medium #Array #Sorting #Binary_Search #Binary_Indexed_Tree
// #2023_06_27_Time_967_ms_(100.00%)_Space_85.4_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun countRectangles(rectangles: Array<IntArray>, points: Array<IntArray>): IntArray {
        val n = rectangles.size
        val q = points.size
        val es = arrayOfNulls<IntArray>(n + q)
        System.arraycopy(rectangles, 0, es, 0, n)
        for (i in 0 until q) {
            es[n + i] = intArrayOf(points[i][0], points[i][1], i)
        }
        Arrays.sort(es) { x: IntArray?, y: IntArray? -> if (x!![0] != y!![0]) -(x[0] - y[0]) else x.size - y.size }
        val ct = IntArray(101)
        val ans = IntArray(q)
        for (e in es) {
            if (e!!.size == 2) {
                for (i in 0..e[1]) {
                    ct[i]++
                }
            } else {
                ans[e[2]] = ct[e[1]]
            }
        }
        return ans
    }
}
