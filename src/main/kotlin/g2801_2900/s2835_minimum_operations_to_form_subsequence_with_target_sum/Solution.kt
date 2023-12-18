package g2801_2900.s2835_minimum_operations_to_form_subsequence_with_target_sum

// #Hard #Array #Greedy #Bit_Manipulation #2023_12_18_Time_183_ms_(100.00%)_Space_37.6_MB_(100.00%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun minOperations(nums: List<Int>, target: Int): Int {
        var target = target
        val pq = PriorityQueue { a: Int, b: Int -> b - a }
        var sum: Long = 0
        var count: Long = 0
        for (x in nums) {
            pq.offer(x)
            sum += x.toLong()
        }
        if (sum < target) {
            return -1
        }
        while (!pq.isEmpty()) {
            val `val` = pq.poll()
            sum -= `val`.toLong()
            if (`val` <= target) {
                target -= `val`
            } else if (sum < target) {
                count++
                pq.offer(`val` / 2)
                pq.offer(`val` / 2)
                sum += `val`.toLong()
            }
        }
        return count.toInt()
    }
}
