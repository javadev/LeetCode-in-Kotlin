package g2401_2500.s2492_minimum_score_of_a_path_between_two_cities

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
class Solution {
    private lateinit var dsu: IntArray

    fun minScore(n: Int, roads: Array<IntArray>): Int {
        dsu = IntArray(n + 1)
        val ans = IntArray(n + 1)
        for (i in 0..n) {
            dsu[i] = i
        }
        ans.fill(Int.MAX_VALUE)
        for (r in roads) {
            val a = find(r[0])
            val b = find(r[1])
            dsu[a] = dsu[b]
            ans[b] = Math.min(r[2], Math.min(ans[a], ans[b]))
            ans[a] = ans[b]
        }
        return ans[find(1)]
    }

    private fun find(i: Int): Int {
        return if (dsu[i] == i) i else find(dsu[i])
    }
}
