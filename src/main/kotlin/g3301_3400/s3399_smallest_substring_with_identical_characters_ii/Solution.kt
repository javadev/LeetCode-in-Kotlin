package g3301_3400.s3399_smallest_substring_with_identical_characters_ii

// #Hard #2024_12_24_Time_26_ms_(100.00%)_Space_40.2_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minLength(s: String, numOps: Int): Int {
        val b = s.toByteArray()
        var flips1 = 0
        var flips2 = 0
        for (i in b.indices) {
            val e1 = (if (i % 2 == 0) '0' else '1').code.toByte()
            val e2 = (if (i % 2 == 0) '1' else '0').code.toByte()
            if (b[i] != e1) {
                flips1++
            }
            if (b[i] != e2) {
                flips2++
            }
        }
        val flips = min(flips1, flips2)
        if (flips <= numOps) {
            return 1
        }
        val seg: MutableList<Int> = ArrayList()
        var count = 1
        var max = 1
        for (i in 1..<b.size) {
            if (b[i] != b[i - 1]) {
                if (count != 1) {
                    seg.add(count)
                    max = max(max, count)
                }
                count = 1
            } else {
                count++
            }
        }
        if (count != 1) {
            seg.add(count)
            max = max(max, count)
        }
        var l = 2
        var r = max
        var res = max
        while (l <= r) {
            val m = l + (r - l) / 2
            if (check(m, seg, numOps)) {
                r = m - 1
                res = m
            } else {
                l = m + 1
            }
        }
        return res
    }

    private fun check(sz: Int, seg: MutableList<Int>, ops: Int): Boolean {
        var ops = ops
        for (i in seg) {
            val x = i / (sz + 1)
            ops -= x
            if (ops < 0) {
                return false
            }
        }
        return true
    }
}
