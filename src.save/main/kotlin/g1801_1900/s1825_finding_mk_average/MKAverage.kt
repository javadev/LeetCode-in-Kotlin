package g1801_1900.s1825_finding_mk_average

// #Hard #Design #Heap_Priority_Queue #Ordered_Set #Queue
// #2023_06_21_Time_1101_ms_(100.00%)_Space_122.8_MB_(100.00%)

import java.util.Deque
import java.util.LinkedList
import java.util.TreeMap

@Suppress("NAME_SHADOWING")
class MKAverage(m: Int, k: Int) {
    private val m: Double
    private val k: Double
    private val c: Double
    private var avg: Double
    private val middle: Bst
    private val min: Bst
    private val max: Bst
    private val q: Deque<Int>

    init {
        this.m = m.toDouble()
        this.k = k.toDouble()
        c = (m - k * 2).toDouble()
        avg = 0.0
        middle = Bst()
        min = Bst()
        max = Bst()
        q = LinkedList()
    }

    fun addElement(num: Int) {
        var num = num
        if (min.size < k) {
            min.add(num)
            q.offer(num)
            return
        }
        if (max.size < k) {
            min.add(num)
            max.add(min.removeMax())
            q.offer(num)
            return
        }
        if (num >= min.lastKey() && num <= max.firstKey()) {
            middle.add(num)
            avg += num / c
        } else if (num < min.lastKey()) {
            min.add(num)
            val `val` = min.removeMax()
            middle.add(`val`)
            avg += `val` / c
        } else if (num > max.firstKey()) {
            max.add(num)
            val `val` = max.removeMin()
            middle.add(`val`)
            avg += `val` / c
        }
        q.offer(num)
        if (q.size > m) {
            num = q.poll()
            if (middle.containsKey(num)) {
                avg -= num / c
                middle.remove(num)
            } else if (min.containsKey(num)) {
                min.remove(num)
                val `val` = middle.removeMin()
                avg -= `val` / c
                min.add(`val`)
            } else if (max.containsKey(num)) {
                max.remove(num)
                val `val` = middle.removeMax()
                avg -= `val` / c
                max.add(`val`)
            }
        }
    }

    fun calculateMKAverage(): Int {
        return if (q.size < m) {
            -1
        } else avg.toInt()
    }

    internal class Bst {
        var map: TreeMap<Int, Int> = TreeMap()
        var size: Int = 0

        fun add(num: Int) {
            val count = map.getOrDefault(num, 0) + 1
            map[num] = count
            size++
        }

        fun remove(num: Int) {
            val count = map.getOrDefault(num, 1) - 1
            if (count > 0) {
                map[num] = count
            } else {
                map.remove(num)
            }
            size--
        }

        fun removeMin(): Int {
            val key = map.firstKey()
            remove(key)
            return key
        }

        fun removeMax(): Int {
            val key = map.lastKey()
            remove(key)
            return key
        }

        fun containsKey(key: Int): Boolean {
            return map.containsKey(key)
        }

        fun firstKey(): Int {
            return map.firstKey()
        }

        fun lastKey(): Int {
            return map.lastKey()
        }
    }
}
