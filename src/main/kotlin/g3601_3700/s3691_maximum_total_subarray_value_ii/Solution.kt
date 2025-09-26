package g3601_3700.s3691_maximum_total_subarray_value_ii

// #Hard #Array #Greedy #Heap_Priority_Queue #Segment_Tree #Weekly_Contest_468
// #2025_09_26_Time_94_ms_(100.00%)_Space_94.59_MB_(_%)

import java.util.PriorityQueue
import kotlin.math.max
import kotlin.math.min

class Solution {
    private class Sparse(a: IntArray) {
        var mn: Array<LongArray>
        var mx: Array<LongArray>
        var log: IntArray

        init {
            val n = a.size
            val zerosN = 32 - Integer.numberOfLeadingZeros(n)
            mn = Array<LongArray>(zerosN) { LongArray(n) }
            mx = Array<LongArray>(zerosN) { LongArray(n) }
            log = IntArray(n + 1)
            for (i in 2..n) {
                log[i] = log[i / 2] + 1
            }
            for (i in 0..<n) {
                mx[0][i] = a[i].toLong()
                mn[0][i] = mx[0][i]
            }
            for (k in 1..<zerosN) {
                var i = 0
                while (i + (1 shl k) <= n) {
                    mn[k][i] = min(mn[k - 1][i], mn[k - 1][i + (1 shl (k - 1))])
                    mx[k][i] = max(mx[k - 1][i], mx[k - 1][i + (1 shl (k - 1))])
                    i++
                }
            }
        }

        fun getMin(l: Int, r: Int): Long {
            val k = log[r - l + 1]
            return min(mn[k][l], mn[k][r - (1 shl k) + 1])
        }

        fun getMax(l: Int, r: Int): Long {
            val k = log[r - l + 1]
            return max(mx[k][l], mx[k][r - (1 shl k) + 1])
        }
    }

    fun maxTotalValue(nums: IntArray, k: Int): Long {
        var k = k
        val n = nums.size
        val st = Sparse(nums)
        val pq = PriorityQueue(Comparator { a: LongArray, b: LongArray -> b[0].compareTo(a[0]) })
        for (i in 0..<n) {
            pq.add(longArrayOf(st.getMax(i, n - 1) - st.getMin(i, n - 1), i.toLong(), (n - 1).toLong()))
        }
        var ans: Long = 0
        while (k-- > 0 && !pq.isEmpty()) {
            val cur = pq.poll()
            ans += cur[0]
            val l = cur[1].toInt()
            val r = cur[2].toInt()
            if (r - 1 > l) {
                pq.add(longArrayOf(st.getMax(l, r - 1) - st.getMin(l, r - 1), l.toLong(), (r - 1).toLong()))
            }
        }
        return ans
    }
}
