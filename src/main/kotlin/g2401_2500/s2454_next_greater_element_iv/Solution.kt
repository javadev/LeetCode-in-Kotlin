package g2401_2500.s2454_next_greater_element_iv

import java.util.ArrayDeque
import java.util.Deque

// #Hard #Array #Sorting #Binary_Search #Stack #Heap_Priority_Queue #Monotonic_Stack
class Solution {
    fun secondGreaterElement(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        res.fill(-1)
        val stack1: Deque<Int> = ArrayDeque()
        val stack2: Deque<Int> = ArrayDeque()
        val tmp: Deque<Int> = ArrayDeque()
        for (i in nums.indices) {
            while (stack2.isNotEmpty() && nums[i] > nums[stack2.peek()]) {
                res[stack2.pop()] = nums[i]
            }
            while (stack1.isNotEmpty() && nums[i] > nums[stack1.peek()]) {
                tmp.push(stack1.pop())
            }
            while (tmp.isNotEmpty()) {
                stack2.push(tmp.pop())
            }
            stack1.push(i)
        }
        return res
    }
}
