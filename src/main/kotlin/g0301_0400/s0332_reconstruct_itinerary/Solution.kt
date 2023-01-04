package g0301_0400.s0332_reconstruct_itinerary

// #Hard #Depth_First_Search #Graph #Eulerian_Circuit
// #2022_11_12_Time_240_ms_(93.88%)_Space_42.6_MB_(91.84%)

import java.util.LinkedList
import java.util.PriorityQueue

class Solution {
    fun findItinerary(tickets: List<List<String>>): List<String> {
        val map: HashMap<String, PriorityQueue<String>> = HashMap()
        val ans = LinkedList<String>()
        for (ticket in tickets) {
            val src = ticket[0]
            val dest = ticket[1]
            var pq = map[src]
            if (pq == null) {
                pq = PriorityQueue()
            }
            pq.add(dest)
            map[src] = pq
        }
        dfs(map, "JFK", ans)
        return ans
    }

    private fun dfs(map: Map<String, PriorityQueue<String>>, src: String, ans: LinkedList<String>) {
        val temp = map[src]
        while (temp != null && !temp.isEmpty()) {
            val nbr = temp.remove()
            dfs(map, nbr, ans)
        }
        ans.addFirst(src)
    }
}
