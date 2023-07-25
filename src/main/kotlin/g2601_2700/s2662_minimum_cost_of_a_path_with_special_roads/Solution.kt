package g2601_2700.s2662_minimum_cost_of_a_path_with_special_roads

// #Medium #Array #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_07_25_Time_690_ms_(100.00%)_Space_59.5_MB_(50.00%)

import java.util.PriorityQueue

class Solution {
    fun minimumCost(start: IntArray, target: IntArray, specialRoads: Array<IntArray>): Int {
        val pointList = mutableListOf<Point>()
        val costMap = HashMap<Pair<Point, Point>, Int>()
        val distMap = HashMap<Point, Int>()
        val sp = Point(start[0], start[1])
        distMap[sp] = 0
        for (road in specialRoads) {
            val p = Point(road[0], road[1])
            val q = Point(road[2], road[3])
            val cost = road[4]

            if (costMap.getOrDefault(Pair(p, q), Int.MAX_VALUE) > cost) {
                costMap[Pair(p, q)] = cost
            }

            pointList.add(p)
            pointList.add(q)

            distMap[p] = Int.MAX_VALUE
            distMap[q] = Int.MAX_VALUE
        }
        val tp = Point(target[0], target[1])
        pointList.add(tp)
        distMap[tp] = Int.MAX_VALUE
        val points = pointList.distinct()
        val pq = PriorityQueue<PointWithCost>()
        pq.offer(PointWithCost(sp, 0))
        while (!pq.isEmpty()) {
            val curr = pq.poll()
            val cost = curr.cost
            val cp = curr.p
            if (cp == tp) return cost
            for (np in points) {
                if (cp == np) continue
                var nextCost = cost + dist(cp, np)
                if (costMap.containsKey(Pair(cp, np))) {
                    nextCost = nextCost.coerceAtMost(cost + costMap[Pair(cp, np)]!!)
                }
                if (nextCost < distMap[np]!!) {
                    distMap[np] = nextCost
                    pq.offer(PointWithCost(np, nextCost))
                }
            }
        }

        return -1
    }

    fun dist(sp: Point, tp: Point): Int {
        return kotlin.math.abs(sp.x - tp.x) + kotlin.math.abs(sp.y - tp.y)
    }
}

data class Point(val x: Int, val y: Int)

data class PointWithCost(val p: Point, val cost: Int) : Comparable<PointWithCost> {
    override fun compareTo(other: PointWithCost) = compareValuesBy(this, other) { it.cost }
}
