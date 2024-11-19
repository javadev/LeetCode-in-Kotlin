package g0801_0900.s0850_rectangle_area_ii

// #Hard #Array #Ordered_Set #Segment_Tree #Line_Sweep
// #2023_03_30_Time_171_ms_(100.00%)_Space_35.7_MB_(100.00%)

class Solution {
    fun rectangleArea(rectangles: Array<IntArray>): Int {
        val memo: MutableList<IntArray> = ArrayList()
        for (rectangle in rectangles) {
            helper(0, rectangle, memo)
        }
        var res: Long = 0
        val mod = (1e9 + 7).toInt()
        for (m in memo) {
            res = (res + (m[2] - m[0]).toLong() * (m[3] - m[1]).toLong()) % mod
        }
        return res.toInt()
    }

    private fun helper(id: Int, rectangle: IntArray, memo: MutableList<IntArray>) {
        if (id >= memo.size) {
            memo.add(rectangle)
            return
        }
        val cur = memo[id]
        if (rectangle[2] <= cur[0] || rectangle[0] >= cur[2] || rectangle[1] >= cur[3] || rectangle[3] <= cur[1]) {
            helper(id + 1, rectangle, memo)
            return
        }
        if (rectangle[0] < cur[0]) {
            helper(id + 1, intArrayOf(rectangle[0], rectangle[1], cur[0], rectangle[3]), memo)
        }
        if (rectangle[2] > cur[2]) {
            helper(id + 1, intArrayOf(cur[2], rectangle[1], rectangle[2], rectangle[3]), memo)
        }
        if (rectangle[1] < cur[1]) {
            helper(
                id + 1,
                intArrayOf(
                    rectangle[0].coerceAtLeast(cur[0]),
                    rectangle[1],
                    rectangle[2].coerceAtMost(cur[2]),
                    cur[1],
                ),
                memo,
            )
        }
        if (rectangle[3] > cur[3]) {
            helper(
                id + 1,
                intArrayOf(
                    rectangle[0].coerceAtLeast(cur[0]),
                    cur[3],
                    rectangle[2].coerceAtMost(cur[2]),
                    rectangle[3],
                ),
                memo,
            )
        }
    }
}
