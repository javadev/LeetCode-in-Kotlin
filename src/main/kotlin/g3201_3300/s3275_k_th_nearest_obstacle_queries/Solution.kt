package g3201_3300.s3275_k_th_nearest_obstacle_queries

// #Medium #Array #Heap_Priority_Queue #2024_09_04_Time_1277_ms_(100.00%)_Space_147.2_MB_(61.11%)

import kotlin.math.abs

class Solution {
    fun resultsArray(queries: Array<IntArray>, k: Int): IntArray {
        val len = queries.size
        val results = IntArray(len)
        val heap = IntArray(k)
        run {
            var i = 0
            while (i < k && i < len) {
                val query = queries[i]
                heap[i] = (abs(query[0]) + abs(query[1]))
                results[i] = -1
                i++
            }
        }
        if (k <= len) {
            buildMaxHeap(heap, k)
            results[k - 1] = heap[0]
        }
        for (i in k until len) {
            val query = queries[i]
            val dist = (abs(query[0]) + abs(query[1]))
            if (dist < heap[0]) {
                heap[0] = dist
                heapify(heap, 0, k)
            }
            results[i] = heap[0]
        }
        return results
    }

    private fun buildMaxHeap(heap: IntArray, size: Int) {
        for (i in size / 2 - 1 downTo 0) {
            heapify(heap, i, size)
        }
    }

    private fun heapify(heap: IntArray, index: Int, size: Int) {
        val root = heap[index]
        val left = 2 * index + 1
        val right = 2 * index + 2
        if (right < size && root < heap[right] && heap[left] < heap[right]) {
            heap[index] = heap[right]
            heap[right] = root
            heapify(heap, right, size)
        } else if (left < size && root < heap[left]) {
            heap[index] = heap[left]
            heap[left] = root
            heapify(heap, left, size)
        }
    }
}
