package g3601_3700.s3639_minimum_time_to_activate_string

// #Medium #Weekly_Contest_461 #2025_08_03_Time_160_ms_(100.00%)_Space_85.36_MB_(100.00%)

import java.util.TreeSet

class Solution {
    fun minTime(s: String, order: IntArray, k: Int): Int {
        val n = s.length
        // Use a TreeSet to maintain a sorted list of indices
        val pos = TreeSet<Int?>()
        pos.add(-1)
        pos.add(n)
        // Iterate through the order of removal
        var localK = k
        for (t in order.indices) {
            val i = order[t]
            // Find the elements in the sorted set that bracket the current index 'i'
            // 'r' is the smallest element >= i
            val r = pos.ceiling(i)
            // 'l' is the largest element <= i
            val l = pos.floor(i)
            // The 'cost' to remove an item is the product of the distances to its neighbors
            localK -= ((i - l!!).toLong() * (r!! - i)).toInt()
            pos.add(i)
            // If the total cost is exhausted, return the current time 't'
            if (localK <= 0) {
                return t
            }
        }
        // If all items are removed and k is not exhausted, return -1
        return -1
    }
}
