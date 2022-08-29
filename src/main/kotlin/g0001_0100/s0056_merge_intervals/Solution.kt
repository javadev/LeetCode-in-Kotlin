package g0001_0100.s0056_merge_intervals

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting
// #Data_Structure_II_Day_2_Array #Level_2_Day_17_Interval #Udemy_2D_Arrays/Matrix
// #2022_08_29_Time_641_ms_(64.65%)_Space_77.6_MB_(39.49%)

class Solution {
    fun merge(ns: Array<IntArray>): Array<IntArray> {
        val ret = ArrayList<IntArray>()
        ns.sortBy { it.first() }

        var sofar: IntArray? = null
        for (cur in ns) {
            if (sofar == null) {
                sofar = cur
                continue
            }

            if (sofar.last() >= cur.first()) {
                val start = minOf(sofar.first(), cur.first())
                val end = maxOf(sofar.last(), cur.last())
                sofar = intArrayOf(start, end)
            } else {
                ret += sofar
                sofar = cur
            }
        }

        sofar?.let { ret += sofar }

        return ret.toTypedArray()
    }
}
