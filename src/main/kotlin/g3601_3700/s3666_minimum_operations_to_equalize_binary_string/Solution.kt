package g3601_3700.s3666_minimum_operations_to_equalize_binary_string

// #Hard #Biweekly_Contest_164 #2025_08_31_Time_29_ms_(100.00%)_Space_48.47_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Queue
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minOperations(s: String, k: Int): Int {
        val zeros = s.chars().map { x: Int -> if (x == '0'.code) 1 else 0 }.sum()
        if ((zeros % k) == 0) {
            return zeros / k
        }
        val n = s.length
        val q: Queue<Int> = ArrayDeque<Int>()
        q.add(zeros)
        var res = 1
        // use bounds for optimization
        val bounds = Array<IntArray>(2) { IntArray(2) }
        bounds[zeros and 1][1] = zeros
        bounds[zeros and 1][0] = bounds[zeros and 1][1]
        bounds[1 - (zeros and 1)][0] = Int.Companion.MAX_VALUE
        bounds[1 - (zeros and 1)][1] = Int.Companion.MIN_VALUE
        while (q.isNotEmpty()) {
            // find min number of zeros and max number of zeros in this round
            var minv = Int.Companion.MAX_VALUE
            var maxv = Int.Companion.MIN_VALUE
            for (len in q.size downTo 1) {
                val h: Int = q.poll()
                val t = n - h
                var x = min(h, k)
                if (t >= k - x) {
                    val fst = h - x + (k - x)
                    minv = min(minv, fst)
                    maxv = max(maxv, fst)
                }
                x = min(t, k)
                if (h >= k - x) {
                    val snd = h - (k - x) + x
                    minv = min(minv, snd)
                    maxv = max(maxv, snd)
                }
            }
            // possible children are sequence of equal difference 2
            val ind = minv and 1
            var temp = minv
            while (temp <= maxv) {
                if ((temp % k) == 0) {
                    return res + temp / k
                }
                if (temp < bounds[ind][0] || temp > bounds[ind][1]) {
                    q.add(temp)
                    temp += 2
                } else {
                    temp = bounds[ind][1] + 2
                }
            }
            bounds[ind][0] = min(bounds[ind][0], minv)
            bounds[ind][1] = max(bounds[ind][1], maxv)
            res++
        }
        return -1
    }
}
