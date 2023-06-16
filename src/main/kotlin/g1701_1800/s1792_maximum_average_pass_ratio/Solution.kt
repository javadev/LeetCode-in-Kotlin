package g1701_1800.s1792_maximum_average_pass_ratio

import java.util.PriorityQueue

// #Medium #Array #Greedy #Heap_Priority_Queue
@Suppress("NAME_SHADOWING")
class Solution {
    fun maxAverageRatio(classes: Array<IntArray>, extraStudents: Int): Double {
        var extraStudents = extraStudents
        val heap = PriorityQueue { o1: DoubleArray, o2: DoubleArray -> java.lang.Double.compare(o2[0], o1[0]) }
        for (clas in classes) {
            val delta = profit(clas[0].toDouble(), clas[1].toDouble())
            heap.offer(doubleArrayOf(delta, clas[0].toDouble(), clas[1].toDouble()))
        }
        while (extraStudents >= 1) {
            val temp = heap.poll()
            val pass = temp[1] + 1
            val total = temp[2] + 1
            val delta = profit(pass, total)
            heap.offer(doubleArrayOf(delta, pass, total))
            extraStudents--
        }
        var average = 0.0
        while (heap.isNotEmpty()) {
            val temp = heap.poll()
            average += temp[1] / temp[2]
        }
        return average / classes.size
    }

    // O(1)
    private fun profit(a: Double, b: Double): Double {
        return (a + 1) / (b + 1) - a / b
    }
}
