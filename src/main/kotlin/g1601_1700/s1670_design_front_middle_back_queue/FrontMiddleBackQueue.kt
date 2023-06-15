package g1601_1700.s1670_design_front_middle_back_queue

// #Medium #Array #Design #Linked_List #Queue #Data_Stream
class FrontMiddleBackQueue {
    private val queue = IntArray(1000)
    private var cur = -1
    fun pushFront(`val`: Int) {
        cur++
        for (i in cur downTo 1) {
            queue[i] = queue[i - 1]
        }
        queue[0] = `val`
    }

    fun pushMiddle(`val`: Int) {
        if (cur < 0) {
            pushFront(`val`)
            return
        }
        cur++
        val mid = cur / 2
        for (i in cur downTo mid + 1) {
            queue[i] = queue[i - 1]
        }
        queue[mid] = `val`
    }

    fun pushBack(`val`: Int) {
        if (cur < 0) {
            pushFront(`val`)
            return
        }
        cur++
        queue[cur] = `val`
    }

    fun popFront(): Int {
        if (cur < 0) {
            return -1
        }
        val result = queue[0]
        for (i in 0 until cur) {
            queue[i] = queue[i + 1]
        }
        cur--
        return result
    }

    fun popMiddle(): Int {
        if (cur < 0) {
            return -1
        }
        val mid = cur / 2
        val result = queue[mid]
        for (i in mid until cur) {
            queue[i] = queue[i + 1]
        }
        cur--
        return result
    }

    fun popBack(): Int {
        if (cur < 0) {
            return -1
        }
        val result = queue[cur]
        cur--
        return result
    }
}
