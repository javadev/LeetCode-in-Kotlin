package g0401_0500.s0456_132_pattern

// #Medium #Array #Binary_Search #Stack #Ordered_Set #Monotonic_Stack #Udemy_Arrays
// #2022_12_26_Time_434_ms_(100.00%)_Space_69.2_MB_(77.78%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    /*
     * It scans only once, this is the power of using correct data structure.
     * It goes from the right to the left.
     * It keeps pushing elements into the stack,
     * but it also keeps poping elements out of the stack as long as the current element is bigger than this number.
     */
    fun find132pattern(nums: IntArray): Boolean {
        val stack: Deque<Int> = LinkedList()
        var s3 = Int.MIN_VALUE
        for (i in nums.indices.reversed()) {
            if (nums[i] < s3) {
                return true
            } else {
                while (!stack.isEmpty() && nums[i] > stack.peek()) {
                    s3 = Math.max(s3, stack.pop())
                }
            }
            stack.push(nums[i])
        }
        return false
    }
}
