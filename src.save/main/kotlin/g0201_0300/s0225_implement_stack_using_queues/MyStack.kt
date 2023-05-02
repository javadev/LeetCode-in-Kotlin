package g0201_0300.s0225_implement_stack_using_queues

// #Easy #Stack #Design #Queue #2022_10_26_Time_248_ms_(73.44%)_Space_36.1_MB_(43.75%)

import java.util.LinkedList

class MyStack {
    private var queuePair = Pair(LinkedList<Int>(), LinkedList<Int>())
    private var top: Int? = null

    fun push(x: Int) {
        queuePair.first.addLast(x)
        top = x
    }

    fun pop(): Int {
        if (isQueuesEmpty()) {
            throw Exception()
        }
        val queuePair = selectSourceAndDestinationQueues(queuePair)
        var value = 0
        repeat(queuePair.first.size) {
            when (queuePair.first.size) {
                2 -> {
                    top = queuePair.first.removeFirst()
                    queuePair.second.addLast(top)
                }
                1 -> {
                    value = queuePair.first.removeFirst()
                }
                else -> {
                    queuePair.second.addLast(queuePair.first.removeFirst())
                }
            }
        }
        return value
    }

    fun top(): Int {
        if (isQueuesEmpty()) {
            throw Exception()
        }
        return top!!
    }

    fun empty(): Boolean {
        return isQueuesEmpty()
    }

    private fun isQueuesEmpty(): Boolean {
        if (queuePair.first.isEmpty() && queuePair.second.isEmpty()) {
            return true
        }
        return false
    }

    private fun selectSourceAndDestinationQueues(queuePair: Pair<LinkedList<Int>, LinkedList<Int>>):
        Pair<LinkedList<Int>, LinkedList<Int>> {
        return if (queuePair.first.isNotEmpty()) {
            Pair(queuePair.first, queuePair.second)
        } else {
            Pair(queuePair.second, queuePair.first)
        }
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
