package g3501_3600.s3572_maximize_ysum_by_picking_a_triplet_of_distinct_xvalues

// #Medium #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue
// #2025_06_10_Time_5_ms_(100.00%)_Space_82.11_MB_(56.00%)

class Solution {
    fun maxSumDistinctTriplet(x: IntArray, y: IntArray): Int {
        var index = -1
        var max = -1
        var sum = 0
        for (i in y.indices) {
            if (y[i] > max) {
                max = y[i]
                index = i
            }
        }
        sum += max
        if (max == -1) {
            return -1
        }
        var index2 = -1
        max = -1
        for (i in y.indices) {
            if (y[i] > max && x[i] != x[index]) {
                max = y[i]
                index2 = i
            }
        }
        sum += max
        if (max == -1) {
            return -1
        }
        max = -1
        for (i in y.indices) {
            if (y[i] > max && x[i] != x[index] && x[i] != x[index2]) {
                max = y[i]
            }
        }
        if (max == -1) {
            return -1
        }
        sum += max
        return sum
    }
}
