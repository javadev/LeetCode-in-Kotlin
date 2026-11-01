package g3801_3900.s3826_minimum_partition_score

// #Hard #Array #Dynamic_Programming #Prefix_Sum #Divide_and_Conquer #Queue #Monotonic_Queue
// #Principal #Biweekly_Contest_175 #2026_06_09_Time_70_ms_(96.97%)_Space_47.29_MB_(57.58%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    private lateinit var prefix: LongArray

    private fun isRedundant(l1: Line, l2: Line, l3: Line): Boolean = (
        (l3.intercept - l1.intercept).toDouble() * (l1.slope - l2.slope)
            <= (l2.intercept - l1.intercept).toDouble() * (l1.slope - l3.slope)
        )

    private fun solveWithPenalty(lambda: Long): Pair {
        val dq: Deque<Line> = ArrayDeque<Line>()
        dq.addLast(Line(0, 0, 0))
        var di: Long = 0
        var pi = 0
        for (i in 1..<prefix.size) {
            val x = prefix[i]
            // query
            while (dq.size > 1) {
                val first = dq.pollFirst()
                val second = dq.peekFirst()
                if (first.eval(x) <= second.eval(x)) {
                    dq.addFirst(first)
                    break
                }
            }
            val best = dq.peekFirst()
            di = x * x + x + 2 * lambda + best.eval(x)
            pi = best.partition + 1
            val newLine = Line(-2 * x, di + x * x - x, pi)
            while (dq.size > 1) {
                val last = dq.pollLast()
                val secondLast = dq.peekLast()
                if (!isRedundant(secondLast, last, newLine)) {
                    dq.addLast(last)
                    break
                }
            }
            dq.addLast(newLine)
        }
        return Pair(di, pi)
    }

    fun minPartitionScore(nums: IntArray, k: Int): Long {
        val n = nums.size
        prefix = LongArray(n + 1)
        for (i in 1..n) {
            prefix[i] = prefix[i - 1] + nums[i - 1]
        }
        var start: Long = 0
        var end = 1e15.toLong()
        var bestLambda: Long = 0
        while (start <= end) {
            val mid = start + (end - start) / 2
            val res = solveWithPenalty(mid)
            if (res.partition <= k) {
                bestLambda = mid
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        val ans = solveWithPenalty(bestLambda)
        return (ans.score - 2L * k * bestLambda) / 2
    }

    private class Line(var slope: Long, var intercept: Long, var partition: Int) {
        fun eval(x: Long): Long = slope * x + intercept
    }

    private class Pair(var score: Long, var partition: Int)
}
