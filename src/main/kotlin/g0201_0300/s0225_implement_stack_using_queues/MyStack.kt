package g0201_0300.s0225_implement_stack_using_queues

import java.util.LinkedList
import java.util.Queue

// #Easy #Stack #Design #Queue #2022_07_04_Time_0_ms_(100.00%)_Space_41.7_MB_(54.75%)
class MyStack {
    private val queueOne: Queue<Int>
    private val queueTwo: Queue<Int>
    private var top: Int

    // Initialize your data structure here.
    init {
        queueOne = LinkedList()
        queueTwo = LinkedList()
        top = 0
    }

    // Push element x onto stack.
    fun push(x: Int) {
        queueOne.add(x)
        top = x
    }

    // Removes the element on top of the stack and returns that element.
    fun pop(): Int {
        while (queueOne.size > 1) {
            val `val` = queueOne.remove()
            top = `val`
            queueTwo.add(`val`)
        }
        val popValue = queueOne.remove()
        queueOne.addAll(queueTwo)
        queueTwo.clear()
        return popValue
    }

    // Get the top element.
    fun top(): Int {
        return top
    }

    // Returns whether the stack is empty.
    fun empty(): Boolean {
        return queueOne.isEmpty()
    }
}
