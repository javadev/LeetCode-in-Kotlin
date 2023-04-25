package g0701_0800.s0707_design_linked_list

// #Medium #Design #Linked_List #Data_Structure_II_Day_12_Linked_List #Programming_Skills_II_Day_19
// #Udemy_Linked_List #2023_02_24_Time_243_ms_(100.00%)_Space_43.8_MB_(46.34%)

class MyLinkedList {
    private class Node(var `val`: Int) {
        var next: Node? = null
    }

    private var head: Node?
    private var tail: Node? = null
    private var size: Int

    init {
        head = tail
        size = 0
    }

    operator fun get(index: Int): Int {
        if (index >= size) {
            return -1
        }
        if (index == 0) {
            return head!!.`val`
        }
        var i = 0
        var ptr = head
        while (i++ < index - 1) {
            ptr = ptr!!.next
        }
        return ptr!!.next!!.`val`
    }

    fun addAtHead(`val`: Int) {
        val node = Node(`val`)
        if (head == null) {
            tail = node
            head = tail
            size++
            return
        }
        node.next = head
        head = node
        size++
    }

    fun addAtTail(`val`: Int) {
        if (head == null) {
            addAtHead(`val`)
            return
        }
        val node = Node(`val`)
        tail!!.next = node
        tail = node
        size++
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index > size) {
            return
        }
        if (index == 0) {
            addAtHead(`val`)
            return
        }
        if (index == size) {
            addAtTail(`val`)
            return
        }
        var i = 0
        val node = Node(`val`)
        var ptr = head
        while (i++ < index - 1) {
            ptr = ptr!!.next
        }
        node.next = ptr!!.next
        ptr.next = node
        size++
    }

    fun deleteAtIndex(index: Int) {
        if (index >= size) {
            return
        }
        if (index == 0) {
            head = head!!.next
            size--
            return
        }
        var i = 0
        var ptr = head
        while (i++ < index - 1) {
            ptr = ptr!!.next
        }
        ptr!!.next = ptr.next!!.next
        if (index == size - 1) {
            tail = ptr
        }
        size--
    }
}

/*
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */
