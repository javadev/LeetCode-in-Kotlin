package g3501_3600.s3572_maximize_ysum_by_picking_a_triplet_of_distinct_xvalues

// #Medium #2025_06_08_Time_72_ms_(100.00%)_Space_77.69_MB_(100.00%)

import java.util.Collections
import java.util.PriorityQueue
import kotlin.math.max

class Solution {
    fun maxSumDistinctTriplet(x: IntArray, y: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap<Int, Int>()
        for (i in x.indices) {
            map.put(x[i], max(map.getOrDefault(x[i], 0), y[i]))
        }
        val maxHeap = PriorityQueue<Int>(Collections.reverseOrder<Int>())
        for (`val` in map.values) {
            maxHeap.add(`val`)
        }
        if (maxHeap.size < 3) {
            return -1
        }
        var sum = 0
        for (i in 0..2) {
            sum += maxHeap.poll()!!
        }
        return sum
    }
}
