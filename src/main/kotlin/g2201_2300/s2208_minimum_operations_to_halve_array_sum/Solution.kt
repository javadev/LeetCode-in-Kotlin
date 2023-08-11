package g2201_2300.s2208_minimum_operations_to_halve_array_sum

// #Medium #Array #Greedy #Heap_Priority_Queue #2023_06_27_Time_628_ms_(33.33%)_Space_57_MB_(50.00%)

import java.util.Collections
import java.util.PriorityQueue

class Solution {
    fun halveArray(nums: IntArray): Int {
        val queue = PriorityQueue(nums.size, Collections.reverseOrder<Double>())
        var sum = 0.0
        var count = 0
        for (num in nums) {
            queue.add(num.toDouble())
            sum += num
        }
        var hsum = sum
        while (hsum > sum / 2) {
            var maxElement = queue.poll()
            maxElement /= 2
            count++
            hsum -= maxElement
            queue.add(maxElement)
        }
        return count
    }
}
