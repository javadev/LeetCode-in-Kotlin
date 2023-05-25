package g0801_0900.s0815_bus_routes

// #Hard #Array #Hash_Table #Breadth_First_Search #Level_2_Day_11_Graph/BFS/DFS
// #2023_03_22_Time_429_ms_(100.00%)_Space_55.8_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {
        if (source == target) {
            return 0
        }
        val targetRoutes: MutableSet<Int> = HashSet()
        val queue: Queue<Int> = LinkedList()
        val taken = BooleanArray(routes.size)
        val graph = buildGraph(routes, source, target, queue, targetRoutes, taken)
        if (targetRoutes.isEmpty()) {
            return -1
        }
        var bus = 1
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val route = queue.poll()
                if (targetRoutes.contains(route)) {
                    return bus
                }
                for (nextRoute in graph[route]!!) {
                    if (!taken[nextRoute]) {
                        queue.offer(nextRoute)
                        taken[nextRoute] = true
                    }
                }
            }
            bus++
        }
        return -1
    }

    private fun buildGraph(
        routes: Array<IntArray>,
        source: Int,
        target: Int,
        queue: Queue<Int>,
        targetRoutes: MutableSet<Int>,
        taken: BooleanArray
    ): Array<ArrayList<Int>?> {
        val len = routes.size
        val graph: Array<ArrayList<Int>?> = arrayOfNulls(len)
        for (i in 0 until len) {
            routes[i].sort()
            graph[i] = ArrayList()
            var id = routes[i].binarySearch(source)
            if (id >= 0) {
                queue.offer(i)
                taken[i] = true
            }
            id = routes[i].binarySearch(target)
            if (id >= 0) {
                targetRoutes.add(i)
            }
        }
        for (i in 0 until len) {
            for (j in i + 1 until len) {
                if (commonStop(routes[i], routes[j])) {
                    graph[i]?.add(j)
                    graph[j]?.add(i)
                }
            }
        }
        return graph
    }

    private fun commonStop(routeA: IntArray, routeB: IntArray): Boolean {
        var idA = 0
        var idB = 0
        while (idA < routeA.size && idB < routeB.size) {
            if (routeA[idA] == routeB[idB]) {
                return true
            } else if (routeA[idA] < routeB[idB]) {
                idA++
            } else {
                idB++
            }
        }
        return false
    }
}
