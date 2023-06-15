package g1601_1700.s1696_jump_game_vi

import java.util.ArrayDeque
import java.util.Deque

// #Medium #Array #Dynamic_Programming #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
class Solution {
    fun maxResult(nums: IntArray, k: Int): Int {
        val deque: Deque<IntArray> = ArrayDeque()
        deque.offer(intArrayOf(0, nums[0]))
        for (i in 1 until nums.size) {
            val max = deque.peek()[1]
            val next = intArrayOf(i, max + nums[i])
            while (!deque.isEmpty() && deque.peekLast()[1] <= next[1]) {
                // PURGE FROM THE END
                deque.pollLast()
            }
            deque.offer(next)
            if (deque.peekFirst()[0] <= i - k) {
                // PURGE FROM THE HEAD
                deque.pollFirst()
            }
        }
        return deque.peekLast()[1]
    }
}
