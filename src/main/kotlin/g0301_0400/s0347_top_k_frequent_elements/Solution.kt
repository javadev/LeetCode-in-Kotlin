package g0301_0400.s0347_top_k_frequent_elements

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Sorting
// #Heap_Priority_Queue #Counting #Divide_and_Conquer #Quickselect #Bucket_Sort
// #Data_Structure_II_Day_20_Heap_Priority_Queue
// #2022_09_11_Time_268_ms_(99.74%)_Space_42_MB_(87.93%)

import java.util.Arrays
import java.util.PriorityQueue
import java.util.Queue

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        Arrays.sort(nums)
        // Min heap of <number, frequency>
        val queue: Queue<IntArray> = PriorityQueue(k + 1) { a: IntArray, b: IntArray -> a[1] - b[1] }
        // Filter with min heap
        var j = 0
        for (i in 0..nums.size) {
            if (i == nums.size || nums[i] != nums[j]) {
                queue.offer(intArrayOf(nums[j], i - j))
                if (queue.size > k) {
                    queue.poll()
                }
                j = i
            }
        }
        // Convert to int array
        val result = IntArray(k)
        for (i in k - 1 downTo 0) {
            result[i] = queue.poll().get(0)
        }
        return result
    }
}
