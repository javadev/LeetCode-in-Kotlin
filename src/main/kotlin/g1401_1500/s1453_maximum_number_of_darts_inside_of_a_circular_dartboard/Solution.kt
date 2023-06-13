package g1401_1500.s1453_maximum_number_of_darts_inside_of_a_circular_dartboard

// #Hard #Array #Math #Geometry
class Solution {
    private class Angle(var a: Double, var enter: Boolean) : Comparable<Angle> {
        override fun compareTo(other: Angle): Int {
            if (a > other.a) {
                return 1
            } else if (a < other.a) {
                return -1
            } else if (enter == other.enter) {
                return 0
            } else if (enter) {
                return -1
            }
            return 1
        }
    }

    private fun getPointsInside(i: Int, r: Double, n: Int, points: Array<IntArray>, dis: Array<DoubleArray>): Int {
        val angles: MutableList<Angle> = ArrayList(2 * n)
        for (j in 0 until n) {
            if (i != j && dis[i][j] <= 2 * r) {
                val b = Math.acos(dis[i][j] / (2 * r))
                val a = Math.atan2(
                    points[j][1] - points[i][1] * 1.0,
                    points[j][0] * 1.0 - points[i][0]
                )
                val alpha = a - b
                val beta = a + b
                angles.add(Angle(alpha, true))
                angles.add(Angle(beta, false))
            }
        }
        angles.sort()
        var count = 1
        var res = 1
        for (a in angles) {
            if (a.enter) {
                count++
            } else {
                count--
            }
            if (count > res) {
                res = count
            }
        }
        return res
    }

    fun numPoints(points: Array<IntArray>, r: Int): Int {
        val n = points.size
        val dis = Array(n) { DoubleArray(n) }
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                dis[j][i] = Math.sqrt(
                    Math.pow(points[i][0] * 1.0 - points[j][0], 2.0) +
                        Math.pow(points[i][1] * 1.0 - points[j][1], 2.0)
                )
                dis[i][j] = dis[j][i]
            }
        }
        var ans = 0
        for (i in 0 until n) {
            ans = Math.max(ans, getPointsInside(i, r.toDouble(), n, points, dis))
        }
        return ans
    }
}
