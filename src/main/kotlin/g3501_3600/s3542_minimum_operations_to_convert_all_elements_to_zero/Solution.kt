package g3501_3600.s3542_minimum_operations_to_convert_all_elements_to_zero

// #Medium #2025_05_11_Time_48_ms_(100.00%)_Space_78.24_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    fun minOperations(nums: IntArray): Int {
        val stack: Deque<Int> = ArrayDeque<Int>()
        stack.push(0)
        var res = 0
        for (a in nums) {
            while (!stack.isEmpty() && stack.peek()!! > a) {
                stack.pop()
            }
            if (stack.isEmpty() || stack.peek()!! < a) {
                res++
                stack.push(a)
            }
        }
        return res
    }
}
