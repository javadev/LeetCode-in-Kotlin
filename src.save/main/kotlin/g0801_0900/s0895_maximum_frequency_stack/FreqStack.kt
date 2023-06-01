package g0801_0900.s0895_maximum_frequency_stack

// #Hard #Hash_Table #Stack #Design #Ordered_Set
// #2023_04_11_Time_617_ms_(100.00%)_Space_62.2_MB_(95.00%)

class FreqStack {
    private class Node {
        var next: Node?
        var `val` = 0

        constructor(`val`: Int) {
            this.`val` = `val`
            next = null
        }

        constructor() {
            next = null
        }
    }

    private class DLL {
        var head: Node = Node()
        var size: Int = 0

        fun addNode(x: Int) {
            val node = Node(x)
            node.next = head.next
            head.next = node
            size++
        }

        fun removeNode(): Node? {
            val node = head.next
            if (node != null) {
                head.next = node.next
                node.next = null
                size--
            }
            return node
        }
    }

    private var max = 0
    private val freqMap: HashMap<Int, Int> = HashMap()
    private val freqListMap: HashMap<Int, DLL> = HashMap()

    fun push(`val`: Int) {
        val count = freqMap.getOrDefault(`val`, 0) + 1
        max = max.coerceAtLeast(count)
        freqMap[`val`] = count
        val dll = freqListMap.getOrDefault(count, DLL())
        dll.addNode(`val`)
        freqListMap[count] = dll
    }

    fun pop(): Int {
        val dll = freqListMap[max]
        val node = dll!!.removeNode()
        freqMap[node!!.`val`] = max - 1
        if (dll.size == 0) {
            max--
        }
        return node.`val`
    }
}

/*
 * Your FreqStack object will be instantiated and called as such:
 * var obj = FreqStack()
 * obj.push(`val`)
 * var param_2 = obj.pop()
 */
