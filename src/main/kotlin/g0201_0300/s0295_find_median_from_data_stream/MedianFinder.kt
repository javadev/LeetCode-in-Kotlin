package g0201_0300.s0295_find_median_from_data_stream

import java.util.PriorityQueue

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Sorting #Two_Pointers #Design
// #Heap_Priority_Queue #Data_Stream #2022_07_06_Time_151_ms_(80.24%)_Space_125.2_MB_(44.11%)
class MedianFinder {
    // take two queues one is for storing upper half and the other is for lowerhalf
    // max stores the lower half
    // min heap stores the upper half
    private val maxHeap: PriorityQueue<Int>
    private val minHeap: PriorityQueue<Int>

    // initialize your data structure here.
    init {
        maxHeap = PriorityQueue { a: Int, b: Int -> b - a }
        minHeap = PriorityQueue()
    }

    fun addNum(num: Int) {
        if (maxHeap.isEmpty() || maxHeap.peek() > num) {
            maxHeap.offer(num)
        } else {
            minHeap.offer(num)
        }
        if (Math.abs(maxHeap.size - minHeap.size) > 1) {
            balance(maxHeap, minHeap)
        }
    }

    fun balance(maxHeap: PriorityQueue<Int>, minHeap: PriorityQueue<Int>) {
        val large = if (maxHeap.size > minHeap.size) maxHeap else minHeap
        val small = if (maxHeap.size > minHeap.size) minHeap else maxHeap
        small.offer(large.poll())
    }

    fun findMedian(): Double {
        val large = if (maxHeap.size > minHeap.size) maxHeap else minHeap
        val small = if (maxHeap.size > minHeap.size) minHeap else maxHeap
        return if (large.size == small.size) {
            (large.peek() + small.peek()).toDouble() / 2
        } else {
            large.peek().toDouble()
        }
    }
}
