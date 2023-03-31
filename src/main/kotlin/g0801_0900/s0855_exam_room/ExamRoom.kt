package g0801_0900.s0855_exam_room

// #Medium #Design #Ordered_Set #2023_03_31_Time_644_ms_(83.33%)_Space_40.4_MB_(100.00%)

import java.util.Objects

class ExamRoom() {
    private class Node(var `val`: Int, map: MutableMap<Int?, Node>) {
        var pre: Node? = null
        var next: Node? = null

        init {
            map[`val`] = this
        }

        fun insert(left: Node?): Int {
            val right = left!!.next
            left.next = this
            right!!.pre = this
            next = right
            pre = left
            return `val`
        }

        fun delete() {
            val left = pre
            val right = next
            left!!.next = right
            right!!.pre = left
        }
    }

    private val map: MutableMap<Int?, Node> = HashMap()
    private val head = Node(-1, map)
    private val tail = Node(-1, map)
    private var n = 0

    init {
        head.next = tail
        tail.pre = head
    }

    constructor(n: Int) : this() {
        this.n = n
    }

    fun seat(): Int {
        val right = n - 1 - tail.pre!!.`val`
        val left = head.next!!.`val`
        var max = 0
        var maxAt = -1
        var maxAtLeft: Node? = null
        var cur = tail.pre
        while (cur !== head && cur!!.pre !== head) {
            val pre = cur!!.pre
            val at = (cur.`val` + pre!!.`val`) / 2
            val distance = at - pre.`val`
            if (distance >= max) {
                maxAtLeft = pre
                max = distance
                maxAt = at
            }
            cur = cur.pre
        }
        if (head.next === tail || left >= max && left >= right) {
            return Node(0, map).insert(head)
        }
        return if (right > max) {
            Node(n - 1, map).insert(tail.pre)
        } else Node(maxAt, map).insert(Objects.requireNonNull(maxAtLeft))
    }

    fun leave(p: Int) {
        map[p]!!.delete()
        map.remove(p)
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * var obj = ExamRoom(n)
 * var param_1 = obj.seat()
 * obj.leave(p)
 */
