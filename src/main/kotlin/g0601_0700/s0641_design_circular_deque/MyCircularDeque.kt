package g0601_0700.s0641_design_circular_deque

// #Medium #Array #Design #Linked_List #Queue
// #2023_02_10_Time_232_ms_(100.00%)_Space_37.5_MB_(83.33%)

@Suppress("kotlin:S6512")
class MyCircularDeque(k: Int) {
    private val data: IntArray
    private var front: Int
    private var rear: Int
    private var size: Int

    init {
        data = IntArray(k)
        front = 0
        rear = k - 1
        size = 0
    }

    fun insertFront(value: Int): Boolean {
        if (size == data.size) {
            return false
        }
        data[front] = value
        front = (front + 1) % data.size
        size++
        return true
    }

    fun insertLast(value: Int): Boolean {
        if (size == data.size) {
            return false
        }
        data[rear] = value
        rear = (rear - 1 + data.size) % data.size
        size++
        return true
    }

    fun deleteFront(): Boolean {
        if (size == 0) {
            return false
        }
        front = (front - 1 + data.size) % data.size
        size--
        return true
    }

    fun deleteLast(): Boolean {
        if (size == 0) {
            return false
        }
        rear = (rear + 1) % data.size
        size--
        return true
    }

    fun getFront(): Int {
        return if (size == 0) {
            -1
        } else {
            data[(front - 1 + data.size) % data.size]
        }
    }

    fun getRear(): Int {
        return if (size == 0) {
            -1
        } else {
            data[(rear + 1) % data.size]
        }
    }

    fun isEmpty(): Boolean {
        return size == 0
    }
    fun isFull(): Boolean {
        return size == data.size
    }
}

/*
 * Your MyCircularDeque object will be instantiated and called as such:
 * var obj = MyCircularDeque(k)
 * var param_1 = obj.insertFront(value)
 * var param_2 = obj.insertLast(value)
 * var param_3 = obj.deleteFront()
 * var param_4 = obj.deleteLast()
 * var param_5 = obj.getFront()
 * var param_6 = obj.getRear()
 * var param_7 = obj.isEmpty()
 * var param_8 = obj.isFull()
 */
