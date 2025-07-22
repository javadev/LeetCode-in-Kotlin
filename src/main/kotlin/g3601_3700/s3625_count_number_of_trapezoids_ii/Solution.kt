package g3601_3700.s3625_count_number_of_trapezoids_ii

// #Hard #Weekly_Contest_459 #2025_07_22_Time_377_ms_(100.00%)_Space_162.04_MB_(37.50%)

import kotlin.math.abs

class Solution {
    private class Slope(var dx: Int, var dy: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }
            if (other !is Slope) {
                return false
            }
            val s: Slope = other
            return dx == s.dx && dy == s.dy
        }

        override fun hashCode(): Int {
            return dx * 1000003 xor dy
        }
    }

    private class Pair(var a: Int, var b: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }
            if (other !is Pair) {
                return false
            }
            val p = other
            return a == p.a && b == p.b
        }

        override fun hashCode(): Int {
            return a * 1000003 xor b
        }
    }

    fun countTrapezoids(points: Array<IntArray>): Int {
        val n = points.size
        val slopeLines: MutableMap<Slope, MutableMap<Long, Int>> = HashMap()
        val midpointSlopes: MutableMap<Pair, MutableMap<Slope, Int>> = HashMap<Pair, MutableMap<Slope, Int>>()
        for (i in 0..<n) {
            val x1 = points[i][0]
            val y1 = points[i][1]
            for (j in i + 1..<n) {
                val x2 = points[j][0]
                val y2 = points[j][1]
                var dx = x2 - x1
                var dy = y2 - y1
                val g = gcd(abs(dx), abs(dy))
                dx /= g
                dy /= g
                if (dx < 0 || (dx == 0 && dy < 0)) {
                    dx = -dx
                    dy = -dy
                }
                val nx = -dy
                val ny = dx
                val lineId = nx.toLong() * x1 + ny.toLong() * y1
                val slopeKey = Slope(dx, dy)
                slopeLines
                    .computeIfAbsent(slopeKey) { _: Slope -> HashMap() }
                    .merge(lineId, 1) { a: Int, b: Int -> Integer.sum(a, b) }
                val mx = x1 + x2
                val my = y1 + y2
                val mid = Pair(mx, my)
                midpointSlopes
                    .computeIfAbsent(mid) { _: Pair -> HashMap() }
                    .merge(slopeKey, 1) { a: Int, b: Int -> Integer.sum(a, b) }
            }
        }
        var trapezoidsRaw: Long = 0
        for (lines in slopeLines.values) {
            if (lines.size < 2) {
                continue
            }
            var s: Long = 0
            var s2: Long = 0
            for (line in lines.values) {
                s += line.toLong()
                s2 += line.toLong() * line
            }
            trapezoidsRaw += (s * s - s2) / 2
        }
        var parallelograms: Long = 0
        for (mp in midpointSlopes.values) {
            if (mp.size < 2) {
                continue
            }
            var s: Long = 0
            var s2: Long = 0
            for (num in mp.values) {
                s += num.toLong()
                s2 += num.toLong() * num
            }
            parallelograms += (s * s - s2) / 2
        }
        val res = trapezoidsRaw - parallelograms
        return if (res > Int.Companion.MAX_VALUE) Int.Companion.MAX_VALUE else res.toInt()
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val t = a % b
            a = b
            b = t
        }
        return if (a == 0) 1 else a
    }
}
