package g1601_1700.s1606_find_servers_that_handled_most_number_of_requests

// #Hard #Array #Greedy #Heap_Priority_Queue #Ordered_Set
// #2023_06_13_Time_973_ms_(33.33%)_Space_68.6_MB_(100.00%)

import java.util.PriorityQueue
import java.util.TreeSet

class Solution {
    internal class Server(val id: Int, val busyTime: Int)

    fun busiestServers(k: Int, arrival: IntArray, load: IntArray): List<Int> {
        val available = TreeSet<Int>()
        val busy = PriorityQueue({ a: Server, b: Server -> a.busyTime.compareTo(b.busyTime) })
        val requestCount = IntArray(k)
        val n = arrival.size
        for (id in 0 until k) {
            available.add(id)
        }
        for (i in 0 until n) {
            val defaultServer = i % k
            while (!busy.isEmpty() && busy.peek().busyTime <= arrival[i]) {
                val top = busy.poll()
                available.add(top.id)
            }
            if (available.isEmpty()) {
                continue
            }
            var nextServer = available.ceiling(defaultServer)
            nextServer = nextServer ?: available.ceiling(0)
            val requestEnd = arrival[i] + load[i]
            available.remove(nextServer)
            busy.add(Server(nextServer, requestEnd))
            requestCount[nextServer]++
        }
        var maxRequests = Int.MIN_VALUE
        val busiestServers: MutableList<Int> = ArrayList()
        for (id in 0 until k) {
            maxRequests = Math.max(maxRequests, requestCount[id])
        }
        for (id in 0 until k) {
            if (requestCount[id] == maxRequests) {
                busiestServers.add(id)
            }
        }
        return busiestServers
    }
}
