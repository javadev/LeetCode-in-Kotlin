package g0201_0300.s0232_implement_queue_using_stacks

// #Easy #Stack #Design #Queue #Data_Structure_I_Day_9_Stack_Queue
// #Programming_Skills_I_Day_11_Containers_and_Libraries #Level_2_Day_16_Design
// #2022_10_26_Time_258_ms_(70.86%)_Space_36_MB_(58.94%)

import java.util.Deque
import java.util.LinkedList

class MyQueue() {
    private val deque: Deque<Int> = LinkedList()

    fun push(x: Int) {
        deque.add(x)
    }

    fun pop(): Int = deque.removeFirst()

    fun peek(): Int = deque.first()

    fun empty(): Boolean = deque.isEmpty()
}

/*
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
