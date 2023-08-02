package g1901_2000.s1944_number_of_visible_people_in_a_queue

// #Hard #Array #Stack #Monotonic_Stack #2023_06_20_Time_605_ms_(90.00%)_Space_56.4_MB_(70.00%)

class Solution {
    fun canSeePersonsCount(heights: IntArray): IntArray {
        val size = heights.size
        val stack = IntArray(size)
        var idx = 0
        stack[0] = heights[size - 1]
        val visible = IntArray(size)
        for (i in size - 2 downTo 0) {
            var count = 0
            while (idx >= 0 && heights[i] >= stack[idx]) {
                count++
                idx--
            }
            if (idx >= 0) {
                count++
            }
            stack[++idx] = heights[i]
            visible[i] = count
        }
        return visible
    }
}
