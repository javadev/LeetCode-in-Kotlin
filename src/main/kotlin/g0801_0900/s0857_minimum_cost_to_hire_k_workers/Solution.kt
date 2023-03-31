package g0801_0900.s0857_minimum_cost_to_hire_k_workers

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2023_03_31_Time_302_ms_(100.00%)_Space_39.4_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun mincostToHireWorkers(quality: IntArray, wage: IntArray, k: Int): Double {
        val n = quality.size
        val workers = arrayOfNulls<Worker>(n)
        for (i in 0 until n) {
            workers[i] = Worker(wage[i], quality[i])
        }
        workers.sortBy { it!!.ratio() }
        val maxHeap = PriorityQueue { a: Int?, b: Int? ->
            Integer.compare(
                b!!, a!!
            )
        }
        var sumQuality = 0
        var result = Double.MAX_VALUE
        for (i in 0 until n) {
            val worker = workers[i]
            sumQuality += worker!!.quality
            maxHeap.add(worker.quality)
            if (maxHeap.size > k) {
                sumQuality -= maxHeap.remove()!!
            }
            val groupRatio = worker.ratio()
            if (maxHeap.size == k) {
                result = Math.min(sumQuality * groupRatio, result)
            }
        }
        return result
    }

    internal class Worker(var wage: Int, var quality: Int) {
        fun ratio(): Double {
            return wage.toDouble() / quality
        }
    }
}
