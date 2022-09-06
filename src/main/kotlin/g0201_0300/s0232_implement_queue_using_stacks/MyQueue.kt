package g0201_0300.s0232_implement_queue_using_stacks

import java.util.ArrayDeque
import java.util.Deque

// #Easy #Stack #Design #Queue #Data_Structure_I_Day_9_Stack_Queue
// #Programming_Skills_I_Day_11_Containers_and_Libraries #Level_2_Day_16_Design
// #2022_07_04_Time_1_ms_(67.21%)_Space_41.8_MB_(58.63%)
class MyQueue {
    private val left: Deque<Int>
    private val right: Deque<Int>

    // Initialize your data structure here.
    init {
        left = ArrayDeque()
        right = ArrayDeque()
    }

    // Push element x to the back of queue.
    fun push(x: Int) {
        while (!right.isEmpty()) {
            left.add(right.pop())
        }
        left.add(x)
    }

    // Removes the element from in front of queue and returns that element.
    fun pop(): Int {
        while (!left.isEmpty()) {
            right.add(left.pop())
        }
        return right.pop()
    }

    // Get the front element.
    fun peek(): Int {
        while (!left.isEmpty()) {
            right.add(left.pop())
        }
        return right.peek()
    }

    // Returns whether the queue is empty.
    fun empty(): Boolean {
        return right.isEmpty() && left.isEmpty()
    }
}
