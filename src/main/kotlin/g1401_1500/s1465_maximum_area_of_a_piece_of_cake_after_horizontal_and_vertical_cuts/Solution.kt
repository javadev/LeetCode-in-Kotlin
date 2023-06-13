package g1401_1500.s1465_maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts

// #Medium #Array #Sorting #Greedy
class Solution {
    fun maxArea(h: Int, w: Int, horizontalCuts: IntArray, verticalCuts: IntArray): Int {
        horizontalCuts.sort()
        verticalCuts.sort()
        var maxVertical = Math.max(0L, verticalCuts[0].toLong())
        for (i in 1 until verticalCuts.size) {
            val diff = verticalCuts[i] - verticalCuts[i - 1]
            maxVertical = Math.max(maxVertical, diff.toLong())
        }
        maxVertical = Math.max(maxVertical, w.toLong() - verticalCuts[verticalCuts.size - 1])
        var maxHorizontal = Math.max(0L, horizontalCuts[0].toLong())
        for (i in 1 until horizontalCuts.size) {
            val diff = horizontalCuts[i] - horizontalCuts[i - 1]
            maxHorizontal = Math.max(maxHorizontal, diff.toLong())
        }
        maxHorizontal = Math.max(maxHorizontal, h.toLong() - horizontalCuts[horizontalCuts.size - 1])
        return (maxVertical % 1000000007 * maxHorizontal % 1000000007).toInt() % 1000000007
    }
}
