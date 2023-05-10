package g0901_1000.s0986_interval_list_intersections

// #Medium #Array #Two_Pointers #Algorithm_II_Day_4_Two_Pointers
// #2023_05_10_Time_318_ms_(60.98%)_Space_74.4_MB_(26.83%)

class Solution {
    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        val list = ArrayList<IntArray>()
        var i = 0
        var j = 0
        while (i < firstList.size && j < secondList.size) {
            val start = firstList[i][0].coerceAtLeast(secondList[j][0])
            val end = firstList[i][1].coerceAtMost(secondList[j][1])
            if (start <= end) {
                list.add(intArrayOf(start, end))
            }
            if (firstList[i][1] > end) {
                j++
            } else {
                i++
            }
        }
        return list.toTypedArray()
    }
}
