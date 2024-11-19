package g1401_1500.s1499_max_value_of_equation

// #Hard #Array #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
// #2023_06_13_Time_708_ms_(100.00%)_Space_94.4_MB_(66.67%)

class Solution {
    fun findMaxValueOfEquation(points: Array<IntArray>, k: Int): Int {
        var res = Int.MIN_VALUE
        var max = Int.MIN_VALUE
        var r = 0
        var rMax = 0
        for (l in 0 until points.size - 1) {
            if (rMax == l) {
                max = Int.MIN_VALUE
                r = l + 1
                rMax = r
            }
            while (r < points.size && points[r][0] - points[l][0] <= k) {
                val v = points[r][0] + points[r][1]
                if (max < v) {
                    max = v
                    rMax = r
                }
                r++
            }
            if (points[rMax][0] - points[l][0] <= k) {
                res = Math.max(
                    res,
                    points[rMax][0] - points[l][0] + points[rMax][1] + points[l][1],
                )
            }
        }
        return res
    }
}
