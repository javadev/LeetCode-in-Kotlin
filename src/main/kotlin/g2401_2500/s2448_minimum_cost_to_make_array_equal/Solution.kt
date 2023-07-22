package g2401_2500.s2448_minimum_cost_to_make_array_equal

// #Hard #Array #Sorting #Binary_Search #Prefix_Sum
// #2023_07_05_Time_387_ms_(80.40%)_Space_50.7_MB_(80.41%)

import java.util.Collections

class Solution {
    private class Pair(var e: Int, var c: Int)

    fun minCost(nums: IntArray, cost: IntArray): Long {
        var sum: Long = 0
        val al: MutableList<Pair> = ArrayList()
        for (i in nums.indices) {
            al.add(Pair(nums[i], cost[i]))
            sum += cost[i].toLong()
        }
        Collections.sort(al) { a: Pair, b: Pair -> a.e.compareTo(b.e) }
        var ans: Long = 0
        val mid = (sum + 1) / 2
        var s2: Long = 0
        var t = 0
        run {
            var i = 0
            while (i < al.size && s2 < mid) {
                s2 += al[i].c.toLong()
                t = al[i].e
                i++
            }
        }
        for (i in al.indices) {
            ans += Math.abs(nums[i].toLong() - t.toLong()) * cost[i]
        }
        return ans
    }
}
