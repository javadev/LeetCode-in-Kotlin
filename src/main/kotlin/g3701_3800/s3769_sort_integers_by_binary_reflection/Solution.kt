package g3701_3800.s3769_sort_integers_by_binary_reflection

// #Easy #Array #Sorting #Mid_Level #Weekly_Contest_479
// #2026_05_08_Time_5_ms_(97.23%)_Space_46.52_MB_(97.70%)

import java.util.PriorityQueue

class Solution {
    fun sortByReflection(nums: IntArray): IntArray {
        val minHeap =
            PriorityQueue<IntArray>(
                Comparator { a: IntArray?, b: IntArray? ->
                    if (a!![1] == b!![1]) {
                        return@Comparator Integer.compare(a[0], b[0])
                    }
                    Integer.compare(a[1], b[1])
                },
            )
        val sortedByReflection = IntArray(nums.size)
        for (num in nums) {
            minHeap.offer(intArrayOf(num, reverseBinary(num)))
        }
        var idx = 0
        while (minHeap.isNotEmpty()) {
            sortedByReflection[idx++] = minHeap.poll()!![0]
        }
        return sortedByReflection
    }

    private fun reverseBinary(num: Int): Int {
        var num = num
        var reversed = 0
        while (num > 0) {
            val lastBit = num and 1
            reversed = (reversed shl 1) or lastBit
            num = num shr 1
        }
        return reversed
    }
}
