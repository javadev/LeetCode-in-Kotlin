package g3401_3500.s3479_fruits_into_baskets_iii

// #Medium #Array #Binary_Search #Ordered_Set #Segment_Tree
// #2025_03_11_Time_53_ms_(92.86%)_Space_86.21_MB_(7.14%)

import kotlin.math.max

class Solution {
    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        val n = baskets.size
        var size = 1
        while (size < n) {
            size = size shl 1
        }
        val seg = IntArray(2 * size)
        for (i in 0..<n) {
            seg[size + i] = baskets[i]
        }
        for (i in n..<size) {
            seg[size + i] = 0
        }
        for (i in size - 1 downTo 1) {
            seg[i] = max(seg[i shl 1].toDouble(), seg[i shl 1 or 1].toDouble()).toInt()
        }
        var ans = 0
        for (f in fruits) {
            if (seg[1] < f) {
                ans++
                continue
            }
            var idx = 1
            while (idx < size) {
                if (seg[idx shl 1] >= f) {
                    idx = idx shl 1
                } else {
                    idx = idx shl 1 or 1
                }
            }
            update(seg, idx - size, 0, size)
        }
        return ans
    }

    private fun update(seg: IntArray, pos: Int, `val`: Int, size: Int) {
        var i = pos + size
        seg[i] = `val`
        i /= 2
        while (i > 0) {
            seg[i] = max(seg[i shl 1].toDouble(), seg[i shl 1 or 1].toDouble()).toInt()
            i /= 2
        }
    }
}
