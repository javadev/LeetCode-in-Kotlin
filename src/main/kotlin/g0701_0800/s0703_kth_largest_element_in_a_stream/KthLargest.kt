package g0701_0800.s0703_kth_largest_element_in_a_stream

// #Easy #Tree #Binary_Tree #Design #Heap_Priority_Queue #Binary_Search_Tree #Data_Stream
// #2023_02_23_Time_286_ms_(95.45%)_Space_59.4_MB_(32.95%)

import java.util.PriorityQueue

class KthLargest(private val maxSize: Int, nums: IntArray) {
    private val heap: PriorityQueue<Int> = PriorityQueue()

    init {
        for (num in nums) {
            add(num)
        }
    }

    fun add(`val`: Int): Int {
        if (heap.size < maxSize) {
            heap.add(`val`)
        } else if (heap.peek() < `val`) {
            heap.add(`val`)
            heap.poll()
        }
        return heap.peek()
    }
}

/*
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */