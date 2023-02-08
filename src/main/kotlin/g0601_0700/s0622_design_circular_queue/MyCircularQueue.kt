package g0601_0700.s0622_design_circular_queue

// #Medium #Array #Design #Linked_List #Queue #Programming_Skills_II_Day_20
// #2023_02_08_Time_234_ms_(92.68%)_Space_41.8_MB_(48.78%)

class MyCircularQueue(private val maxSize: Int) {
    private val dumyHead = DoubleLinkedNode(0)
    private var size = 0

    init {
        dumyHead.left = dumyHead
        dumyHead.right = dumyHead
    }

    fun enQueue(value: Int): Boolean {
        if (size == maxSize) {
            return false
        }
        val node = DoubleLinkedNode(value)
        val right = dumyHead.right
        dumyHead.right = node
        node.left = dumyHead
        node.right = right
        right!!.left = node
        size++
        return true
    }

    fun deQueue(): Boolean {
        if (size == 0) {
            return false
        }
        val left = dumyHead.left
        dumyHead.left = left!!.left
        dumyHead.left!!.right = dumyHead
        size--
        return true
    }

    fun Rear(): Int {
        return if (size == 0) {
            -1
        } else dumyHead.right!!.`val`
    }

    fun Front(): Int {
        return if (size == 0) {
            -1
        } else dumyHead.left!!.`val`
    }

    fun isEmpty(): Boolean {
        return size == 0
    }
    fun isFull(): Boolean {
        return size == maxSize
    }

    internal class DoubleLinkedNode(val `val`: Int) {
        var left: DoubleLinkedNode? = null
        var right: DoubleLinkedNode? = null
    }
}

/*
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = MyCircularQueue(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */
