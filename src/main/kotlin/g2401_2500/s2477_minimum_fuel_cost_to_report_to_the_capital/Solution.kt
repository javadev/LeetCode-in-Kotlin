package g2401_2500.s2477_minimum_fuel_cost_to_report_to_the_capital

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Graph
class Solution {
    private var ans = 0L
    fun minimumFuelCost(roads: Array<IntArray>, seats: Int): Long {
        val adj = ArrayList<ArrayList<Int>>()
        val n = roads.size + 1
        ans = 0L
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        for (a in roads) {
            adj[a[0]].add(a[1])
            adj[a[1]].add(a[0])
        }
        solve(adj, seats, 0, -1)
        return ans
    }

    private fun solve(adj: ArrayList<ArrayList<Int>>, seats: Int, src: Int, parent: Int): Long {
        var people = 1L
        for (i in adj[src]) {
            if (i != parent) {
                people += solve(adj, seats, i, src)
            }
        }
        if (src != 0) {
            ans += Math.ceil(people.toDouble() / seats).toLong()
        }
        return people
    }
}
