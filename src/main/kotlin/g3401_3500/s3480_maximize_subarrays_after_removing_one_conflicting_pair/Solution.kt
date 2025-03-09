package g3401_3500.s3480_maximize_subarrays_after_removing_one_conflicting_pair

// #Hard #2025_03_09_Time_768_ms_(100.00%)_Space_170.46_MB_(100.00%)

import java.util.TreeMap
import kotlin.math.max

class Solution {
    fun maxSubarrays(n: Int, cp: Array<IntArray>): Long {
        for (pair in cp) {
            if (pair[0] > pair[1]) {
                val temp = pair[0]
                pair[0] = pair[1]
                pair[1] = temp
            }
        }
        cp.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
        val contributions = LongArray(cp.size)
        var totalPossible = n.toLong() * (n + 1) / 2
        val endPointMap = TreeMap<Int, MutableList<Int>>()
        var currentIndex = cp.size - 1
        for (start in n downTo 1) {
            while (currentIndex >= 0 && cp[currentIndex][0] >= start) {
                val end = cp[currentIndex][1]
                endPointMap.computeIfAbsent(end) { k: Int -> ArrayList<Int>() }
                    .add(currentIndex)
                currentIndex--
            }
            if (endPointMap.isEmpty()) {
                continue
            }
            val firstEntry = endPointMap.firstEntry()
            val smallestEnd: Int = firstEntry.key!!
            val pairIndex: Int = firstEntry.value!![0]
            if (firstEntry.value!!.size == 1) {
                endPointMap.remove(smallestEnd)
            } else {
                firstEntry.value!!.removeAt(0)
            }
            val covered = n - smallestEnd + 1L
            totalPossible -= covered
            if (endPointMap.isEmpty()) {
                contributions[pairIndex] += covered
            } else {
                val nextEnd: Int = endPointMap.firstKey()!!
                contributions[pairIndex] += (nextEnd - smallestEnd).toLong()
            }
            endPointMap.computeIfAbsent(smallestEnd) { k: Int? -> ArrayList<Int>() }
                .add(pairIndex)
        }
        var result = totalPossible
        for (contribution in contributions) {
            result = max(result, (totalPossible + contribution))
        }
        return result
    }
}
