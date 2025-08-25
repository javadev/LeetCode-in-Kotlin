package g3601_3700.s3661_maximum_walls_destroyed_by_robots

// #Hard #Weekly_Contest_464 #2025_08_25_Time_233_ms_(100.00%)_Space_75.24_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxWalls(robots: IntArray, distance: IntArray, walls: IntArray): Int {
        val n = robots.size
        // Pair robots with distances and sort
        val rpair = Array<IntArray>(n) { IntArray(2) }
        for (i in 0..<n) {
            rpair[i][0] = robots[i]
            rpair[i][1] = distance[i]
        }
        rpair.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
        val r = IntArray(n)
        val d = IntArray(n)
        for (i in 0..<n) {
            r[i] = rpair[i][0]
            d[i] = rpair[i][1]
        }
        walls.sort()
        // Count walls at robot positions
        var base = 0
        for (i in 0..<n) {
            val idx = walls.binarySearch(r[i])
            if (idx >= 0) {
                base++
            }
        }
        // Tail walls
        val leftTail = countRange(walls, r[0].toLong() - d[0], r[0] - 1L)
        val rightTail = countRange(walls, r[n - 1] + 1L, r[n - 1].toLong() + d[n - 1])
        // Precompute segment ranges
        val segs = n - 1
        val max = max(0, segs)
        val a = IntArray(max)
        val b = IntArray(max)
        val c = IntArray(max)
        for (i in 0..<segs) {
            val segL = r[i] + 1
            val segR = r[i + 1] - 1
            if (segL > segR) {
                c[i] = 0
                b[i] = c[i]
                a[i] = b[i]
                continue
            }
            val aHigh = min(segR, r[i] + d[i])
            a[i] = countRange(walls, segL.toLong(), aHigh.toLong())
            val bLow = max(segL, r[i + 1] - d[i + 1])
            b[i] = countRange(walls, bLow.toLong(), segR.toLong())
            val cLow = max(segL, r[i + 1] - d[i + 1])
            val cHigh = min(segR, r[i] + d[i])
            c[i] = countRange(walls, cLow.toLong(), cHigh.toLong())
        }
        val dp = Array<IntArray>(n) { IntArray(2) }
        dp[0].fill(Int.Companion.MIN_VALUE / 4)
        // first fires left
        dp[0][0] = base + leftTail
        // first fires right
        dp[0][1] = base
        for (i in 0..<n - 1) {
            dp[i + 1].fill(Int.Companion.MIN_VALUE / 4)
            for (choice in 0..1) {
                val cur = dp[i][choice]
                if (cur < 0) {
                    continue
                }
                val addIfNextLeft = if (choice == 1) a[i] + b[i] - c[i] else b[i]
                dp[i + 1][0] = max(dp[i + 1][0], cur + addIfNextLeft)
                val addIfNextRight = if (choice == 1) a[i] else 0
                dp[i + 1][1] = max(dp[i + 1][1], cur + addIfNextRight)
            }
        }
        val res: Int = if (n == 1) {
            max(dp[0][0], dp[0][1] + rightTail)
        } else {
            max(dp[n - 1][0], dp[n - 1][1] + rightTail)
        }
        return res
    }

    private fun countRange(arr: IntArray, l: Long, r: Long): Int {
        if (l > r || arr.isEmpty()) {
            return 0
        }
        val leftIdx = lowerBound(arr, l)
        val rightIdx = upperBound(arr, r)
        return max(0, rightIdx - leftIdx)
    }

    private fun lowerBound(a: IntArray, x: Long): Int {
        var l = 0
        var r = a.size
        while (l < r) {
            val m = (l + r) ushr 1
            if (a[m] < x) {
                l = m + 1
            } else {
                r = m
            }
        }
        return l
    }

    private fun upperBound(a: IntArray, x: Long): Int {
        var l = 0
        var r = a.size
        while (l < r) {
            val m = (l + r) ushr 1
            if (a[m] <= x) {
                l = m + 1
            } else {
                r = m
            }
        }
        return l
    }
}
