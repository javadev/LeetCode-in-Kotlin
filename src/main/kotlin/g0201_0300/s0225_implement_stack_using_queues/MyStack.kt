package g0201_0300.s0225_implement_stack_using_queues

// #Easy #Stack #Design #Queue #2024_08_17_Time_147_ms_(88.57%)_Space_35.9_MB_(87.62%)

import java.util.LinkedList
import java.util.Queue

class MyStack() {
    private val queue1: Queue<Int> = LinkedList()
    private val queue2: Queue<Int> = LinkedList()

    fun push(x: Int) {
        queue1.add(x)
    }

    fun pop(): Int {
        while (queue1.size > 1) {
            queue2.add(queue1.remove())
        }
        val top = queue1.remove()
        val temp = queue1
        queue1.clear()
        queue1.addAll(queue2)
        queue2.clear()
        return top
    }

    fun top(): Int {
        while (queue1.size > 1) {
            queue2.add(queue1.remove())
        }
        val top = queue1.remove()
        queue2.add(top)
        val temp = queue1
        queue1.clear()
        queue1.addAll(queue2)
        queue2.clear()
        return top
    }

    fun empty(): Boolean {
        return queue1.isEmpty()
    }
}

/*
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */
