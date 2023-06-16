package g1701_1800.s1725_number_of_rectangles_that_can_form_the_largest_square

// #Easy #Array #2023_06_16_Time_244_ms_(100.00%)_Space_44.5_MB_(100.00%)

class Solution {
    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
        var maxSoFar = 0
        var count = 0
        for (rectangle in rectangles) {
            val sqLen = Math.min(rectangle[0], rectangle[1])
            if (maxSoFar <= sqLen) {
                if (maxSoFar < sqLen) {
                    maxSoFar = sqLen
                    count = 1
                } else {
                    count++
                }
            }
        }
        return count
    }
}
