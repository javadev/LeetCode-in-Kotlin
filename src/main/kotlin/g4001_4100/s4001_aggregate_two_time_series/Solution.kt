package g4001_4100.s4001_aggregate_two_time_series

// #Medium #Array #Two_Pointers #Senior #Weekly_Contest_512
// #2026_11_17_Time_9_ms_(100.00%)_Space_167.92_MB_(85.71%)

class Solution {
    fun aggregateTimeSeries(left: Array<IntArray>, right: Array<IntArray>): MutableList<MutableList<Int>> {
        val n = left.size
        val m = right.size
        val result: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>(left.size + m)
        var i = 0
        var j = 0
        while (i < n && j < m) {
            val lp = left[i]
            val rp = right[j]
            val cmp = Integer.compare(lp[0], rp[0])
            val value = lp[1] + rp[1]
            if (cmp < 0) {
                result.add(mutableListOf<Int>(lp[0], value))
                i++
            } else if (cmp > 0) {
                result.add(mutableListOf<Int>(rp[0], value))
                j++
            } else {
                result.add(mutableListOf<Int>(rp[0], value))
                i++
                j++
            }
        }
        while (i < n) {
            result.add(mutableListOf<Int>(left[i][0], left[i][1]))
            i++
        }
        while (j < m) {
            result.add(mutableListOf<Int>(right[j][0], right[j][1]))
            j++
        }
        return result
    }
}
