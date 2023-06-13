package g1501_1600.s1560_most_visited_sector_in_a_circular_track

// #Easy #Array #Simulation #2023_06_13_Time_230_ms_(100.00%)_Space_36.3_MB_(100.00%)

class Solution {
    fun mostVisited(n: Int, rounds: IntArray): List<Int> {
        val res: MutableList<Int> = ArrayList()
        var start = rounds[0]
        val end = rounds[rounds.size - 1]
        val ans = IntArray(n + 1)
        while (start != end) {
            ans[start]++
            start++
            if (start > n) {
                start = 1
            }
        }
        ans[end]++
        for (i in 1..n) {
            if (ans[i] != 0) {
                res.add(i)
            }
        }
        return res
    }
}
