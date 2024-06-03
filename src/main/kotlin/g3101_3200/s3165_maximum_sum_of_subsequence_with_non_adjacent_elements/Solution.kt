package g3101_3200.s3165_maximum_sum_of_subsequence_with_non_adjacent_elements

// #Hard #Array #Dynamic_Programming #Divide_and_Conquer #Segment_Tree
// #2024_06_03_Time_1301_ms_(22.22%)_Space_69.8_MB_(100.00%)

import java.util.stream.Stream
import kotlin.math.max

class Solution {
    fun maximumSumSubsequence(nums: IntArray, queries: Array<IntArray>): Int {
        var ans = 0
        val segTree = SegTree(nums)
        for (q in queries) {
            val idx = q[0]
            val `val` = q[1]
            segTree.update(idx, `val`)
            ans = (ans + segTree.max!!) % MOD
        }
        return ans
    }

    internal class SegTree(private val nums: IntArray) {
        private class Record {
            var takeFirstTakeLast: Int = 0
            var takeFirstSkipLast: Int = 0
            var skipFirstSkipLast: Int = 0
            var skipFirstTakeLast: Int = 0

            val max: Int
                get() = Stream.of(
                    this.takeFirstSkipLast,
                    this.takeFirstTakeLast,
                    this.skipFirstSkipLast,
                    this.skipFirstTakeLast
                )
                    .max { x: Int?, y: Int? -> x!!.compareTo(y!!) }
                    .orElse(null)

            fun skipLast(): Int? {
                return Stream.of(this.takeFirstSkipLast, this.skipFirstSkipLast)
                    .max { x: Int?, y: Int? -> x!!.compareTo(y!!) }
                    .orElse(null)
            }

            fun takeLast(): Int? {
                return Stream.of(this.skipFirstTakeLast, this.takeFirstTakeLast)
                    .max { x: Int?, y: Int? -> x!!.compareTo(y!!) }
                    .orElse(null)
            }
        }

        private val seg = arrayOfNulls<Record>(4 * nums.size)

        init {
            for (i in 0 until 4 * nums.size) {
                seg[i] = Record()
            }
            build(0, nums.size - 1, 0)
        }

        private fun build(i: Int, j: Int, k: Int) {
            if (i == j) {
                seg[k]!!.takeFirstTakeLast = nums[i]
                return
            }
            val mid = (i + j) shr 1
            build(i, mid, 2 * k + 1)
            build(mid + 1, j, 2 * k + 2)
            merge(k)
        }

        // merge [2*k+1, 2*k+2] into k
        private fun merge(k: Int) {
            seg[k]!!.takeFirstSkipLast = max(
                (seg[2 * k + 1]!!.takeFirstSkipLast + seg[2 * k + 2]!!.skipLast()!!),
                (seg[2 * k + 1]!!.takeFirstTakeLast + seg[2 * k + 2]!!.skipFirstSkipLast)
            )

            seg[k]!!.takeFirstTakeLast = max(
                (seg[2 * k + 1]!!.takeFirstSkipLast + seg[2 * k + 2]!!.takeLast()!!),
                (seg[2 * k + 1]!!.takeFirstTakeLast + seg[2 * k + 2]!!.skipFirstTakeLast)
            )

            seg[k]!!.skipFirstTakeLast = max(
                (seg[2 * k + 1]!!.skipFirstSkipLast + seg[2 * k + 2]!!.takeLast()!!),
                (seg[2 * k + 1]!!.skipFirstTakeLast + seg[2 * k + 2]!!.skipFirstTakeLast)
            )

            seg[k]!!.skipFirstSkipLast = max(
                (seg[2 * k + 1]!!.skipFirstSkipLast + seg[2 * k + 2]!!.skipLast()!!),
                (seg[2 * k + 1]!!.skipFirstTakeLast + seg[2 * k + 2]!!.skipFirstSkipLast)
            )
        }

        // child -> parent
        fun update(idx: Int, `val`: Int) {
            val i = 0
            val j = nums.size - 1
            val k = 0
            update(idx, `val`, k, i, j)
        }

        private fun update(idx: Int, `val`: Int, k: Int, i: Int, j: Int) {
            if (i == j) {
                seg[k]!!.takeFirstTakeLast = `val`
                return
            }
            val mid = (i + j) shr 1
            if (idx <= mid) {
                update(idx, `val`, 2 * k + 1, i, mid)
            } else {
                update(idx, `val`, 2 * k + 2, mid + 1, j)
            }
            merge(k)
        }

        val max: Int?
            get() = seg[0]?.max
    }

    companion object {
        private const val MOD = 1000000007
    }
}
