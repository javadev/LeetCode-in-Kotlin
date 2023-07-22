package g1201_1300.s1206_design_skiplist

// #Hard #Design #Linked_List #2023_06_09_Time_306_ms_(100.00%)_Space_46.8_MB_(75.00%)

@Suppress("NAME_SHADOWING", "kotlin:S2245")
class Skiplist @JvmOverloads constructor(size: Int = INIT_CAPACITY) {
    private val minBoundary: Int
    private val head: Node
    private var headCapacity: Int
    private var headLevel = 0

    class Node internal constructor(val `val`: Int, level: Int) {
        var next: Array<Node?>

        init {
            next = arrayOfNulls(level)
        }
    }

    init {
        var size = size
        require(size != 0) { "size should be greater than 0" }
        if (size < INIT_CAPACITY) {
            size = INIT_CAPACITY
        }
        minBoundary = size / 2
        headCapacity = size
        head = Node(0, size)
    }

    fun search(target: Int): Boolean {
        var curr: Node? = head
        for (i in headLevel - 1 downTo 0) {
            while (curr!!.next[i] != null) {
                val cmp = target - curr.next[i]!!.`val`
                curr = if (cmp < 0) {
                    break
                } else if (cmp > 0) {
                    curr.next[i]
                } else {
                    return true
                }
            }
        }
        return false
    }

    fun add(num: Int) {
        val update = arrayOfNulls<Node>(headLevel + 1)
        update[headLevel] = head
        buildUpdate(num, update)
        val level = randomLevel
        if (level > headLevel) {
            if (headLevel == headCapacity) {
                resizeHead(2 * headCapacity)
            }
            headLevel++
        }
        val x = Node(num, level)
        for (i in 0 until level) {
            val n = update[i]!!.next[i]
            update[i]!!.next[i] = x
            x.next[i] = n
        }
    }

    fun erase(num: Int): Boolean {
        if (headLevel == 0) {
            return false
        }
        val update = arrayOfNulls<Node>(headLevel)
        buildUpdate(num, update)
        if (update[0]!!.next[0] == null || update[0]!!.next[0]!!.`val` != num) {
            return false
        }
        for (i in 0 until headLevel) {
            if (update[i]!!.next[i] == null || update[i]!!.next[i]!!.`val` != num) {
                break
            }
            update[i]!!.next[i] = update[i]!!.next[i]!!.next[i]
        }
        if (head.next[headLevel - 1] == null && --headLevel >= minBoundary && headLevel == headCapacity / 4) {
            resizeHead(headCapacity / 2)
        }
        return true
    }

    private fun buildUpdate(x: Int, update: Array<Node?>) {
        var curr: Node? = head
        for (i in headLevel - 1 downTo 0) {
            while (curr!!.next[i] != null && curr.next[i]!!.`val` < x) {
                curr = curr.next[i]
            }
            update[i] = curr
        }
    }

    private val randomLevel: Int
        get() {
            val maxLevel = 14
            var level = 1
            val limit = maxLevel.coerceAtMost(headLevel + 1)
            val p = 0.5
            while (Math.random() < p && level < limit) {
                level++
            }
            return level
        }

    private fun resizeHead(size: Int) {
        val copy = arrayOfNulls<Node>(size)
        System.arraycopy(head.next, 0, copy, 0, headLevel)
        head.next = copy
        headCapacity = size
    }

    companion object {
        private const val INIT_CAPACITY = 8
    }
}
