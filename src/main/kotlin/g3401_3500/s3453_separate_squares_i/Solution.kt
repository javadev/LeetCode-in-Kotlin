package g3401_3500.s3453_separate_squares_i

// #Medium #Array #Binary_Search #2025_02_18_Time_57_ms_(100.00%)_Space_102.84_MB_(84.85%)

class Solution {
    fun separateSquares(squares: Array<IntArray>): Double {
        val n = squares.size
        val arr = Array(n) { LongArray(3) }
        var total = 0.0
        var left = Long.MAX_VALUE
        var right = Long.MIN_VALUE
        for (i in 0..n - 1) {
            val y = squares[i][1].toLong()
            val z = squares[i][2].toLong()
            arr[i][0] = y
            arr[i][1] = y + z
            arr[i][2] = z
            total += (z * z).toDouble()
            left = minOf(left, arr[i][0])
            right = maxOf(right, arr[i][1])
        }
        while (left < right) {
            val mid = (left + right) / 2
            var low = 0.0
            for (a in arr) {
                if (a[0] >= mid) {
                    continue
                } else if (a[1] <= mid) {
                    low += a[2] * a[2]
                } else {
                    low += a[2] * (mid - a[0])
                }
            }
            if (low + low + 0.00001 >= total) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        left = right - 1
        var a1 = 0.0
        var a2 = 0.0
        for (a in arr) {
            val x = a[0]
            val y = a[1]
            val z = a[2]
            if (left > x) {
                a1 += (minOf(y, left) - x) * z.toDouble()
            }
            if (right < y) {
                a2 += (y - maxOf(x, right)) * z.toDouble()
            }
        }
        val goal = (total - a1 - a1) / 2
        val len = total - a1 - a2
        return right - 1 + (goal / len)
    }
}
