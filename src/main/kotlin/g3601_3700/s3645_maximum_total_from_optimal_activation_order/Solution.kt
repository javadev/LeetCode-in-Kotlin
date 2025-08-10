package g3601_3700.s3645_maximum_total_from_optimal_activation_order

// #Medium #Weekly_Contest_462 #2025_08_10_Time_32_ms_(99.42%)_Space_63.82_MB_(35.84%)

import java.util.Collections
import kotlin.math.min

class Solution {
    fun maxTotal(value: IntArray, limit: IntArray): Long {
        val n = value.size
        val groups: Array<MutableList<Int>?> = arrayOfNulls<MutableList<Int>>(n + 1)
        for (i in 0..<n) {
            val l = limit[i]
            if (groups[l] == null) {
                groups[l] = ArrayList<Int>()
            }
            groups[l]!!.add(value[i])
        }
        var total: Long = 0
        for (l in 1..n) {
            val list = groups[l]
            if (list == null) {
                continue
            }
            list.sortWith(Collections.reverseOrder<Int>())
            val cap = min(l, list.size)
            for (i in 0..<cap) {
                total += list[i].toLong()
            }
        }
        return total
    }
}
