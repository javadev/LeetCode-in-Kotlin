package g2301_2400.s2398_maximum_number_of_robots_within_budget

// #Hard #Array #Binary_Search #Heap_Priority_Queue #Prefix_Sum #Sliding_Window #Queue
// #2023_07_02_Time_507_ms_(100.00%)_Space_48.9_MB_(100.00%)

class Solution {
    // use sliding window to track the largest in a way that the sliding window only grows.
    //   then the maximum size is the size of the sliding window at the end.
    // if condition is met, we just grow the sliding window.
    // if condition is not met, we shift the sliding window with the same size to the next position.
    // e.g., if [0,3] is valid, next time we will try [0,4].
    //       if [0,3] is invalid, next time we will try [1,4],
    //         by adjusting the window to [1,3] first in the current round.
    fun maximumRobots(chargeTimes: IntArray, runningCosts: IntArray, budget: Long): Int {
        val n = chargeTimes.size
        // [front, end).
        val deque = IntArray(n)
        var front = 0
        var end = 0
        var sum: Long = 0
        var left = 0
        var right = 0
        while (right < n) {
            // add right into the sliding window, so the window becomes [left, right].
            // update sliding window max and window sum.
            while (end - front > 0 && chargeTimes[deque[end - 1]] <= chargeTimes[right]) {
                --end
            }
            deque[end++] = right
            sum += runningCosts[right].toLong()
            // if the condition is met in the window, do nothing,
            // so the next window size will become one larger.
            // if the condition is not met in the window, shrink one from the front,
            // so the next window size will stay the same.
            if (chargeTimes[deque[front]] + (right - left + 1) * sum > budget) {
                while (end - front > 0 && deque[front] <= left) {
                    ++front
                }
                sum -= runningCosts[left].toLong()
                ++left
            }
            ++right
        }
        return right - left
    }
}
