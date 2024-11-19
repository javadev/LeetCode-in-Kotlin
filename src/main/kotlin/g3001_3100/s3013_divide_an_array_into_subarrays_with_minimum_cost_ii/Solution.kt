package g3001_3100.s3013_divide_an_array_into_subarrays_with_minimum_cost_ii

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2024_02_28_Time_1165_ms_(100.00%)_Space_77.7_MB_(9.09%)

import java.util.TreeSet
import kotlin.math.min

@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumCost(nums: IntArray, k: Int, dist: Int): Long {
        var k = k
        val comparator =
            Comparator { i: Int?, j: Int? ->
                if (nums[i!!] == nums[j!!]
                ) {
                    Integer.compare(i, j)
                } else {
                    nums[i].compareTo(nums[j])
                }
            }
        val used = TreeSet(comparator)
        val unused = TreeSet(comparator)
        k--
        var sum: Long = 0
        val n = nums.size.toLong()
        var answer = Long.MAX_VALUE
        for (currentWindow in 1..min((dist.toLong() + 1), (n - 1)).toInt()) {
            sum += nums[currentWindow].toLong()
            used.add(currentWindow)
        }
        while (used.size > k) {
            val largeValueIndex = used.pollLast()
            sum -= nums[largeValueIndex!!].toLong()
            unused.add(largeValueIndex)
        }
        answer = min(sum, answer)
        var currentWindow = dist + 2
        var prevWindow = 1
        while (currentWindow < n
        ) {
            unused.add(currentWindow)
            if (used.contains(prevWindow)) {
                sum -= nums[prevWindow].toLong()
                used.remove(prevWindow)
                val smallValueIndex = unused.pollFirst()
                sum += nums[smallValueIndex!!].toLong()
                used.add(smallValueIndex)
            } else {
                unused.remove(prevWindow)
                if (nums[used.last()!!] > nums[unused.first()!!]) {
                    val largeValueIndex = used.pollLast()
                    sum -= nums[largeValueIndex!!].toLong()
                    unused.add(largeValueIndex)
                    val smallValueIndex = unused.pollFirst()
                    sum += nums[smallValueIndex!!].toLong()
                    used.add(smallValueIndex)
                }
            }
            answer = min(answer, sum)
            currentWindow++
            prevWindow++
        }
        return nums[0] + answer
    }
}
