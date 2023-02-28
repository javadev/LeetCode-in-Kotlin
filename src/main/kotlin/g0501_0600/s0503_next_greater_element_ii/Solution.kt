package g0501_0600.s0503_next_greater_element_ii

// #Medium #Array #Stack #Monotonic_Stack #Programming_Skills_II_Day_10
// #2023_01_06_Time_331_ms_(92.68%)_Space_40.4_MB_(85.37%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    fun nextGreaterElements(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        val stack: Deque<Int> = ArrayDeque()
        for (i in nums.size * 2 - 1 downTo 0) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.size]) {
                stack.pop()
            }
            result[i % nums.size] = if (stack.isEmpty()) -1 else nums[stack.peek()]
            stack.push(i % nums.size)
        }
        return result
    }
}
