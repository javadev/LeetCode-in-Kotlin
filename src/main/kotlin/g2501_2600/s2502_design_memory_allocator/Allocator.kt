package g2501_2600.s2502_design_memory_allocator

// #Medium #Array #Hash_Table #Design #Simulation
// #2023_07_04_Time_284_ms_(100.00%)_Space_45.8_MB_(100.00%)

class Allocator(n: Int) {
    var root: Node

    init {
        root = Node(0, n, -1)
    }

    fun allocate(size: Int, mID: Int): Int {
        var cur: Node? = root
        while (cur != null && (cur.size < size || cur.id != -1)) {
            cur = cur.next
        }
        // unable to allocate
        if (cur == null) {
            return -1
        }
        return if (cur.size == size) {
            cur.id = mID
            cur.ind
        } else {
            val n = Node(cur.ind + size, cur.size - size, -1)
            n.next = cur.next
            cur.next = n
            cur.size = size
            cur.id = mID
            cur.ind
        }
    }

    fun free(mID: Int): Int {
        return collapse(root, mID)
    }

    fun collapse(cur: Node?, id: Int): Int {
        // base case
        if (cur == null) {
            return 0
        }
        // include size if matching id
        var res = if (cur.id == id) cur.size else 0
        // recurse on child
        res += collapse(cur.next, id)
        // unallocate
        if (cur.id == id) {
            cur.id = -1
        }
        // collapse unallocated adjacent nodes
        while (cur.next != null && cur.next!!.id == -1 && cur.id == -1) {
            cur.size += cur.next!!.size
            cur.next = cur.next!!.next
        }
        return res
    }

    class Node(var ind: Int, var size: Int, var id: Int) {
        var next: Node? = null
    }
}
/*
 * Your Allocator object will be instantiated and called as such:
 * var obj = Allocator(n)
 * var param_1 = obj.allocate(size,mID)
 * var param_2 = obj.free(mID)
 */
