package g0501_0600.s0587_erect_the_fence

import kotlin.math.abs
import kotlin.math.atan2
import kotlin.math.pow
import kotlin.math.sqrt

// #Hard #Array #Math #Geometry #2023_01_30_Time_470_ms_(100.00%)_Space_54.7_MB_(100.00%)

class Solution {
    private fun dist(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Double {
        return sqrt((p2.second - p1.second).toDouble().pow(2.0) + Math.pow((p2.first-p1.first).toDouble(), 2.0))
    }

    private fun angle(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Double {
        return atan2((p2.second-p1.second).toDouble(), (p2.first-p1.first).toDouble()).let {
            if(it < 0) return (2.0 * Math.PI + it) else it
        }
    }

    fun outerTrees(trees: Array<IntArray>): Array<IntArray> {
        if(trees.size < 3) {
            return trees
        }
        val left = trees.asSequence().map { it[0] to it[1] }.toMutableList()
        left.sortWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })
        val firstPoint = left[0]
        var nowPoint = firstPoint
        val pointList = mutableListOf(nowPoint)
        var prevAngle = 0.0
        while(true) {
            val nowList = mutableListOf<Pair<Pair<Int,Int>, Double>>()
            var nowMinAngleDiff = 7.0
            var nowMinAngle = 7.0
            left.forEach {
                if(it != nowPoint) {
                    val angle = angle(nowPoint, it)
                    if(abs(angle - nowMinAngle) < 0.0000001) {
                        nowList.add(it to dist(it, nowPoint))
                    } else {
                        val diff = if(angle >= prevAngle) (angle - prevAngle) else 2.0 * Math.PI - (angle - prevAngle)
                        if ((diff) < nowMinAngleDiff) {
                            nowMinAngle = angle
                            nowMinAngleDiff = (diff)
                            nowList.clear()
                            nowList.add(it to dist(it, nowPoint))
                        }
                    }
                }
            }
            prevAngle = nowMinAngle
            nowList.sortBy { it.second }
            val nowListOnlyPoints = nowList.map { it.first }.toMutableList()
            if(nowListOnlyPoints.last() == firstPoint) {
                nowListOnlyPoints.removeAt(nowListOnlyPoints.size - 1)
                left.removeAll(nowListOnlyPoints)
                pointList.addAll(nowListOnlyPoints)
                break
            } else {
                nowPoint = nowListOnlyPoints.last()
                left.removeAll(nowListOnlyPoints)
                pointList.addAll(nowListOnlyPoints)
            }
        }
        return pointList.asSequence().map { intArrayOf(it.first, it.second) }.toList().toTypedArray()
    }
}