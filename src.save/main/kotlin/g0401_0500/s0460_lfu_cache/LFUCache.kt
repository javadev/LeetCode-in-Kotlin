package g0401_0500.s0460_lfu_cache

// #Hard #Hash_Table #Design #Linked_List #Doubly_Linked_List
// #2022_12_27_Time_1143_ms_(100.00%)_Space_151.2_MB_(66.67%)

class LFUCache(capacity: Int) {
    private class Node {
        var prev: Node? = null
        var next: Node? = null
        var key = -1
        var `val` = 0
        var freq = 0
    }

    private val endOfBlock: MutableMap<Int, Node?>
    private val map: MutableMap<Int, Node>
    private val capacity: Int
    private val linkedList: Node

    init {
        endOfBlock = HashMap()
        map = HashMap()
        this.capacity = capacity
        linkedList = Node()
    }

    operator fun get(key: Int): Int {
        if (map.containsKey(key)) {
            val newEndNode = map[key]
            val endNode: Node?
            val currEndNode = endOfBlock[newEndNode!!.freq]
            if (currEndNode === newEndNode) {
                findNewEndOfBlock(newEndNode)
                if (currEndNode.next == null || currEndNode.next!!.freq > newEndNode.freq + 1) {
                    newEndNode.freq++
                    endOfBlock[newEndNode.freq] = newEndNode
                    return newEndNode.`val`
                }
            }
            if (newEndNode.next != null) {
                newEndNode.next!!.prev = newEndNode.prev
            }
            newEndNode.prev!!.next = newEndNode.next
            newEndNode.freq++
            endNode = if (currEndNode!!.next == null || currEndNode.next!!.freq > newEndNode.freq) {
                currEndNode
            } else {
                endOfBlock[newEndNode.freq]
            }
            endOfBlock[newEndNode.freq] = newEndNode
            if (endNode!!.next != null) {
                endNode.next!!.prev = newEndNode
            }
            newEndNode.next = endNode.next
            endNode.next = newEndNode
            newEndNode.prev = endNode
            return newEndNode.`val`
        }
        return -1
    }

    fun put(key: Int, value: Int) {
        val endNode: Node?
        val newEndNode: Node
        if (capacity == 0) {
            return
        }
        if (map.containsKey(key)) {
            map[key]!!.`val` = value
            get(key)
        } else {
            if (map.size == capacity) {
                val toDelete = linkedList.next
                map.remove(toDelete!!.key)
                if (toDelete.next != null) {
                    toDelete.next!!.prev = linkedList
                }
                linkedList.next = toDelete.next
                if (endOfBlock[toDelete.freq] === toDelete) {
                    endOfBlock.remove(toDelete.freq)
                }
            }
            newEndNode = Node()
            newEndNode.key = key
            newEndNode.`val` = value
            newEndNode.freq = 1
            map[key] = newEndNode
            endNode = endOfBlock.getOrDefault(1, linkedList)
            endOfBlock[1] = newEndNode
            if (endNode!!.next != null) {
                endNode.next!!.prev = newEndNode
            }
            newEndNode.next = endNode.next
            endNode.next = newEndNode
            newEndNode.prev = endNode
        }
    }

    private fun findNewEndOfBlock(node: Node?) {
        val prev = node!!.prev
        if (prev!!.freq == node.freq) {
            endOfBlock[node.freq] = prev
        } else {
            endOfBlock.remove(node.freq)
        }
    }
}

/*
 * Your LFUCache object will be instantiated and called as such:
 * var obj = LFUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */
