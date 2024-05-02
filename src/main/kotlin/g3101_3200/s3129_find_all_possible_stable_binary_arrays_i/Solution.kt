package g3101_3200.s3129_find_all_possible_stable_binary_arrays_i

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

// #Medium #Dynamic_Programming #Prefix_Sum #2024_05_02_Time_3_ms_(100.00%)_Space_44.1_MB_(98.38%)

class Solution {
    private fun add(x: Int, y: Int): Int {
        return (x + y) % MODULUS
    }

    private fun subtract(x: Int, y: Int): Int {
        return (x + MODULUS - y) % MODULUS
    }

    private fun multiply(x: Int, y: Int): Int {
        return (x.toLong() * y % MODULUS).toInt()
    }

    fun numberOfStableArrays(zero: Int, one: Int, limit: Int): Int {
        if (limit == 1) {
            return max((2 - abs((zero - one).toDouble())).toDouble(), 0.0).toInt()
        }
        val max = max(zero.toDouble(), one.toDouble()).toInt()
        val min = min(zero.toDouble(), one.toDouble()).toInt()
        val lcn = Array(max + 1) { IntArray(max + 1) }
        var row0 = lcn[0]
        var row1: IntArray
        var row2: IntArray
        row0[0] = 1
        var s = 1
        var sLim = s - limit
        while (s <= max) {
            row2 = if (sLim > 0) lcn[sLim - 1] else intArrayOf()
            row1 = row0
            row0 = lcn[s]
            var c = (s - 1) / limit + 1
            while (c <= sLim) {
                row0[c] = subtract(add(row1[c], row1[c - 1]), row2[c - 1])
                c++
            }
            while (c <= s) {
                row0[c] = add(row1[c], row1[c - 1])
                c++
            }
            s++
            sLim++
        }
        row1 = lcn[min]
        var result = 0
        var s0 = add(if (min < max) row0[min + 1] else 0, row0[min])
        for (c in min downTo 1) {
            val s1 = s0
            s0 = add(row0[c], row0[c - 1])
            result = add(result, multiply(row1[c], add(s0, s1)))
        }
        return result
    }

    companion object {
        private const val MODULUS = 1e9.toInt() + 7
    }
}
