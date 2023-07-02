package g2301_2400.s2386_find_the_k_sum_of_an_array

// #Hard #Array #Sorting #Heap_Priority_Queue
// #2023_07_02_Time_675_ms_(100.00%)_Space_56_MB_(100.00%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun kSum(nums: IntArray, k: Int): Long {
        var k = k
        var sum = 0L
        for (i in nums.indices) {
            if (nums[i] > 0) {
                sum += nums[i].toLong()
            } else {
                nums[i] = -nums[i]
            }
        }
        nums.sort()
        val pq = PriorityQueue { a: Pair<Long, Int>, b: Pair<Long, Int> ->
            b.key.compareTo(a.key)
        }
        pq.offer(Pair(sum, 0))
        while (k-- > 1) {
            val top = pq.poll()
            val s: Long = top.key
            val i: Int = top.value
            if (i < nums.size) {
                pq.offer(Pair(s - nums[i], i + 1))
                if (i > 0) {
                    pq.offer(Pair(s - nums[i] + nums[i - 1], i + 1))
                }
            }
        }
        return pq.peek().key
    }

    private class Pair<K, V>(var key: K, var value: V)
}
